/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.LoginKoki;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ACER
 */
public class DispatcherLoginKoki extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String page = request.getParameter("page");
        HttpSession session = request.getSession();
        RequestDispatcher dis = null;
         controllerLoginKoki controller = new controllerLoginKoki(request);
         LoginKoki koki = new LoginKoki();
        String pesan = "  ";
        request.setAttribute("pesan", pesan);

        if (page != null) {
            if (page.equals("halamankoki")) { 
                
                koki = controller.getLogin();
                    if (koki.getLoginstat() == true) {// validasi status login pengguna
                        dis = request.getRequestDispatcher("halamankoki.jsp");
                    } else if (koki.getLoginstat() == false) {
                        dis = request.getRequestDispatcher("indexkoki.jsp");
                    } else {
                        dis = request.getRequestDispatcher("indexkoki.jsp");
                    }
                
                dis = request.getRequestDispatcher("koki.jsp");       
            } else if (page.equals("pagekasir")) {
                dis = request.getRequestDispatcher("indexkasir.jsp");
            } else if (page.equals("halamankoki")) {
                String validasi1 = request.getParameter("validasi1");
                session.setAttribute("validasi1", validasi1);
                String validasi2 = request.getParameter("validasi2");
                session.setAttribute("validasi2", validasi2);
                String validasi3 = request.getParameter("validasi3");
                session.setAttribute("validasi3", validasi3);
                String validasi4 = request.getParameter("validasi4");
                session.setAttribute("validasi4", validasi4);
                String validasi5 = request.getParameter("validasi5");
                session.setAttribute("validasi5", validasi5);
                String validasi6 = request.getParameter("validasi6");
                session.setAttribute("validasi6", validasi6);
                String validasi7 = request.getParameter("validasi7");
                session.setAttribute("validasi7", validasi7);
                String validasi8 = request.getParameter("validasi8");
                session.setAttribute("validasi8", validasi8);
                String validasi9 = request.getParameter("validasi9");
                session.setAttribute("validasi9", validasi9);
                dis = request.getRequestDispatcher("halamankoki.jsp");
            } else if (page.equals("halamankasir")) {
                dis = request.getRequestDispatcher("halamankasir.jsp");
            } else if (page.equals("halamankasirnota")) {
                dis = request.getRequestDispatcher("halamankasirnota.jsp");
            } else if (page.equals("bonValidasi")) {
                String nasigoyeng = request.getParameter("nasigoyeng");
                session.setAttribute("nasigoyeng", nasigoyeng);
                String bakmigoyeng = request.getParameter("bakmigoyeng");
                session.setAttribute("bakmigoyeng", bakmigoyeng);
                String guramebakar = request.getParameter("guramebakar");
                session.setAttribute("guramebakar", guramebakar);
                String ayambakar = request.getParameter("ayambakar");
                session.setAttribute("ayambakar", ayambakar);
                String nilabakar = request.getParameter("nilabakar");
                session.setAttribute("nilabakar", nilabakar);
                String odagembira = request.getParameter("odagembira");
                session.setAttribute("odagembira", odagembira);
                String esthe = request.getParameter("esthe");
                session.setAttribute("esthe", esthe);
                String eseyuk = request.getParameter("eseyuk");
                session.setAttribute("eseyuk", eseyuk);
                String esawet = request.getParameter("esawet");
                session.setAttribute("esawet", esawet);
                dis = request.getRequestDispatcher("bon_validasi.jsp");
            } else if (page.equals("terimakasih_telahpesan")) {
                dis = request.getRequestDispatcher("terimakasih_telah memesan");
            } else if (page.equals("validasikoki")) {
                dis = request.getRequestDispatcher("validasikoki.jsp");
            } else if (page.equals("index")) {
                dis = request.getRequestDispatcher("index.jsp");
            } else {
                dis = request.getRequestDispatcher("index.jsp");

            }

            dis.include(request, response);

        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Dispatcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Dispatcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
