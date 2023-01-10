package com.example.csrfdemo1.filter;

import jakarta.servlet.*;
import org.springframework.security.web.csrf.CsrfToken;

import java.io.IOException;
import java.util.logging.Logger;

public class CsrfTokenLogger implements Filter {

    private Logger logger =
            Logger.getLogger(CsrfTokenLogger.class.getName());

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Object object = request.getAttribute("_csrf");
        CsrfToken token = (CsrfToken) object;
        logger.info("CSRF Token "+ token.getToken());
        chain.doFilter(request,response);
    }
}
