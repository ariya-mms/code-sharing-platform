package platform.controller;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("")
@Component
public final class ViewResponseHeaderFilter implements Filter {

    @Override
    public final void doFilter(ServletRequest request,
                               ServletResponse response,
                               FilterChain chain) throws IOException, ServletException {
        final var httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Content-Type", "text/html");
        chain.doFilter(request, response);
    }

//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // ...
//    }
//
//    @Override
//    public void destroy() {
//        // ...
//    }
}
