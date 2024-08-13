package org.scoula.ex04.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cart_save")
public class CartSaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String product = request.getParameter("product");
        HttpSession session = request.getSession();
        ArrayList<String> list =(ArrayList<String>) session.getAttribute("product");
        if(list == null) {
            list = new ArrayList<String>();
            session.setAttribute("product", list);
        }

        list.add(product);

        out.print("<html><body>");
        out.print("Product 추가!! <br>");
        out.print("<a href='session_product.jsp'>상품 선택 페이지 </a><br>");
        out.print("<a href='cart_view'>장바구니 보기</a><br>");

        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }
}