/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.user;
import Model.billdetails;
import Model.bill;
import Model.cart;
import Model.cartItem;
import DAL.billDAL;
import DAL.billdetailsDAL;
import java.util.Date;
import java.sql.Timestamp;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Administrator
 */
public class CheckoutServlet extends HttpServlet {
    public billDAL hd = new billDAL();
    public billdetailsDAL cthd = new billdetailsDAL();
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckoutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckoutServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession session = request.getSession();
        user kh = (user)session.getAttribute("KhachHang");
        if(kh == null){
            session.setAttribute("PageRequest", "checkout.jsp");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("checkout.jsp");
            rd.forward(request, response);
        }
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
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String address = request.getParameter("address");
        String payment = request.getParameter("payment");
        user kh = (user)session.getAttribute("KhachHang");
        cart giohang = (cart)session.getAttribute("GioHang");
        try{
            long billid = new Date().getTime();
            bill h = new bill();
            h.setBill_id(billid);
            h.setUser_id(kh.getUser_id());
            h.setAddress(address);
            h.setPayment(payment);
            h.setTotal(giohang.total());
            h.setDate(new Timestamp(new Date().getTime()));
            hd.insert(h);
            for(cartItem item : giohang.getCart()){
                billdetails c = new billdetails();
                c.setBill_id(billid);
                c.setProduct_id(item.getProductId());
                c.setQuantity(item.getQuantity());
                c.setPrice(item.getPrice());
                cthd.insert(c);
            }
            cart cartnew = new cart();
            session.setAttribute("GioHang", cartnew);
        }catch(Exception e){
            
        }
        response.sendRedirect("/Phat/index.jsp");
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
