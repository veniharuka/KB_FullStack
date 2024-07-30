package org.scoula.boardservlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = "/board")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httprequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpresponse = (HttpServletResponse) servletResponse;
        // false면 없으면 새로 만들지 말아라 라는 거
        HttpSession session = httprequest.getSession(false);
        boolean loggedIn = (session != null && session.getAttribute("username") != null);

        if (loggedIn) {
            filterChain.doFilter(servletRequest, servletResponse);

        }else {
            httpresponse.sendRedirect("auth.jsp");
        }

    }
}
