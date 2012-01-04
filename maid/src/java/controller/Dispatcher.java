/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Integer;
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
public class Dispatcher extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String page = request.getParameter("page");
        HttpSession session = request.getSession();
        RequestDispatcher dis = null;
        String nasigoyengInt = null;

        if (page != null) {
            if (page.equals("pesan")) {
                String namaPelanggan = request.getParameter("namaPelanggan");
                session.setAttribute("namaPelanggan", namaPelanggan);
                String select = request.getParameter("select");
                session.setAttribute("select", select);
                dis = request.getRequestDispatcher("Pesan.jsp");
            } else if (page.equals("loginpelanggan")) {
                dis = request.getRequestDispatcher("loginpelanggan.jsp");
            } else if (page.equals("pagekoki")) {
                dis = request.getRequestDispatcher("indexkoki.jsp");
            } else if (page.equals("pagekasir")) {
                dis = request.getRequestDispatcher("indexkasir.jsp");
            } else if (page.equals("halamankoki")) {
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
        processRequest(request, response);
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
        processRequest(request, response);
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
