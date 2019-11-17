/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.cart;
import Model.cartItem;
import DAL.productDAL;
import Model.product;
/**
 *
 * @author Administrator
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {
    public productDAL prod = new productDAL();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         HttpSession session = request.getSession();
        String cmd = request.getParameter("command");
        long id = Long.parseLong(request.getParameter("ProductID"));
        cart gio = (cart)session.getAttribute("GioHang");
       
        if(gio == null){
            gio = new cart();
            session.setAttribute("GioHang", gio);
        }
        switch(cmd){
            case "add":
                product p = prod.productByProductID(id);
                cartItem i = new cartItem(p.getProduct_id(), p.getProduct_name(),p.getProduct_image(), 1, p.getProduct_price());
                gio.addToCart(i);
                break;
            case "delete":
                product m = prod.productByProductID(id);
                cartItem n = new cartItem(m.getProduct_id(), m.getProduct_name(),m.getProduct_image(), 1, m.getProduct_price());
                gio.removeItem(n);
                break;
        }
        response.sendRedirect("/Phat/index.jsp");
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
