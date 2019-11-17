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
import DAL.userDAL;
import Model.user;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Administrator
 */
@WebServlet(name = "UsersServlet", urlPatterns = {"/UsersServlet"})
public class UsersServlet extends HttpServlet {
    public userDAL user = new userDAL();
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
        request.setCharacterEncoding("UTF-8");
        String cmd=request.getParameter("command");
        HttpSession session = request.getSession();
        String url="";
        user kh = new user();
        switch(cmd){
            case "DangKy":
                kh.setUser_id(new java.util.Date().getTime());
                kh.setUser_fullname(request.getParameter("fullname"));
                kh.setUser_email(request.getParameter("email"));
                kh.setUser_pass(request.getParameter("password"));
                user.insertUser(kh);
                session.setAttribute("KhachHang", kh);
                url = "/index.jsp";
                break;
            case "DangNhap":
                kh = user.login(request.getParameter("email"),request.getParameter("password"));
                if(kh!=null){
                    session.setAttribute("KhachHang", kh);
                    String page = session.getAttribute("PageRequest").toString();
                    if(!page.isEmpty())
                        url = "/"+page;
                    else
                        url = "/index.jsp";
                }else{
                    session.setAttribute("error", "Email hoặc mật khẩu không đúng.!");
                    url = "/login.jsp";
                }
                break;
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
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
