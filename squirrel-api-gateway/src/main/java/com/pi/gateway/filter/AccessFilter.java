package com.pi.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 实现了自定义过滤器之后, 并不会直接生效, 还需要为其创建具体的Bean才能启动该过滤器
 */
public class AccessFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        // 过滤器的类型，它决定过滤器在请求的哪个生命周期中执行。

        // pre: 可以在请求被路由之前调用
        // routing: 在路由请求时候被调用
        // error: 处理请求时发生错误时被调用
        // post: 在routing和error过滤器之后被调用

        // 这里定义为pre，代表会在请求被路由之前执行。
        return "pre";
    }

    @Override
    public int filterOrder() {
        // 过滤器的执行顺序。当请求在一个阶段中存在多个过滤器时，需要根据该方法返回的值来依次执行。数值越小优先级越高。
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 判断该过滤器是否需要被执行。这里我们直接返回了true，因此该过滤器对所有请求都会生效。
        // 实际运用中可以利用该函数来指定过滤器的有效范围。
        return true;
    }

    @Override
    public Object run() {

        // 过滤器的具体逻辑。

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        logger.info("{} request to {}", request.getMethod(), request.getRequestURL().toString());

        Object accessToken = request.getParameter("access_token");
        if (accessToken == null) {
            logger.warn("access_token is required.");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }

        logger.info("access_token is ", accessToken);
        return null;
    }

}
