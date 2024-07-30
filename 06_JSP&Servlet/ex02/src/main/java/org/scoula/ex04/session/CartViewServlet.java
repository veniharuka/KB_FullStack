package org.scoula.ex04.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cart_view")
public class CartViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("장바구니 리스트");

        HttpSession session = request.getSession(false);
        session.setMaxInactiveInterval(20);

        if(session != null) {
            ArrayList<String> list = (ArrayList<String>) session.getAttribute("product");
            out.print("상품 : "+ list + "<br>");
        }else{
            out.print("세션 없음 " + "<br>");
        }

        out.print("<a href='session_product.jsp'>상품 선택 페이지 </a><br>");
        out.print("<a href='cart_delete'>장바구니 비우기</a><br>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}