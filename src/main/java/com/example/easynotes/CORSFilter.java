package com.example.easynotes;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter extends GenericFilterBean implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse=(HttpServletResponse)servletResponse;
        httpServletResponse.setHeader("Access-Control-Allow-Origin","*");
        httpServletResponse.setHeader("Access-Control-Allow-Methods","*");

        httpServletResponse.setHeader("Access-Control-Allow-Headers","*");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials","*");
        httpServletResponse.setHeader("Access-Control-Max-Age","3600");

        System.out.println("****** CORS Configuration Completed ******");
        filterChain.doFilter(servletRequest,servletResponse);

    }
}
