/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Susilo
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import entity.LoginKoki;

public class controllerLoginKoki {

    HttpServletRequest request;

    controllerLoginKoki(HttpServletRequest request) {
        this.request = request;
    }
    
    /**
     * Fungsi untuk login koki
     */
    public LoginKoki getLogin() {
        String nama = request.getParameter("nama");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        JpaKoki login = new JpaKoki();
        LoginKoki koki = new LoginKoki();
        if (login.findKokiByNama(nama) != null) {//validasi keberadaan akun berdasarkan nama
            koki = login.findKokiByNama(nama);//membuat objek menjadi objek yang telah ditemukan dlm db

            if (koki.getPassword().equals(password)) {//validasi kesesuaian antara password
                koki.setLoginstat(true);
                session.setAttribute("koki", koki);
                try {
                    login.edit(koki);//eksekusi menyimpan perubahan khususnya loginstat
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                koki.setLoginstat(false);//pesan apabila password salah
                request.setAttribute("pesan", "Username dan password Anda tidak dibenar");
            }

        } else {
            koki.setLoginstat(false);//pesan apabila akun tidak ditemukan
            request.setAttribute("pesan", "Username dan password Anda tidak ditemukan");
        }
        return koki;
    }

}
