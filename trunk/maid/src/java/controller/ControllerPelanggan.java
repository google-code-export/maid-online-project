/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Ricko Shin
 */
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import entity.Pelanggan;

public class ControllerPelanggan {
    
    HttpServletRequest request;

    public ControllerPelanggan(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * Fungsi untuk menyimpan dan membuat pelanggan baru dengan menerima input dari jsp
     * kemudian akan disimpan dalam db
     */
    public void setRegistrasi(Pelanggan pelanggan) {
        String nama = request.getParameter("namaPelanggan");
        String nomormeja = request.getParameter("select");
        HttpSession session = request.getSession();
        JpaPelanggan registrasi = new JpaPelanggan();

        /**
         * validasi terhadap input dalam jsp
         * apabila seluruh input tidak diisikan maka gagal dalam menyimpan objek baru yang
         * telah diinputkan sebelumnya
         */
        if (nama.equals("") || nomormeja.equals("")) {
            request.setAttribute("pesan", "Isikan seluruh field yang tersedia sesuai dengan ketentuan");
            pelanggan.setLoginstat(false);//set login stat false agar pengguna kembali ke halam awal
        } else {

                    pelanggan.setLoginstat(true); //melakukan set terhadap objek baru
                    pelanggan.setNama(nama);
                    pelanggan.setNomormeja(nomormeja);

                    try {
                        registrasi.create(pelanggan);//eksekusi membuat objek baru dan menyimpan

                    } catch (Exception e) {
                        e.printStackTrace();

                    }
               
            }
        }
    }

    /**
     * Fungsi melakukan list terhadap pelanggan yang ada kedalam list
     */
    public void setListPelanggan() {
        JpaPelanggan listPelanggan = new JpaPelanggan();
        HttpSession session = request.getSession();
        List<Pelanggan> list = new ArrayList<Pelanggan>();
        list = listPelanggan.getAllPelanggan();//melakukan list dengan arraylist
        session.setAttribute("list_Pelanggan", list);//memasukkan list kedalam session
    }

    /**
     * Fungsi untuk menghapus objek dari db dengan input berupa nama
     */
    public void setDeletePelanggan() {
        String nama = request.getParameter("nama");
        HttpSession session = request.getSession();
        Pelanggan pelanggan = new Pelanggan();
        JpaPelanggan deletePelanggan = new JpaPelanggan();
        pelanggan = deletePelanggan.findPelangganByNama(nama); //mencari objek berdasarkan input
        try {
            deletePelanggan.destroy(pelanggan.getNama()); //eksekusi menghapus
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Fungsi untuk mencari objek beradasarkan nama
     */
    public void setPelanggan() {
        Pelanggan pelanggan = new Pelanggan();
        String nama = request.getParameter("nama_Pelanggan");//menangkap input nama pelanggan
        HttpSession session = request.getSession();
        JpaPelanggan aturPelanggan = new JpaPelanggan();
        pelanggan = aturPelanggan.findPelangganByNama(nama);//mencari objek bersarkan nama
        session.setAttribute("pelanggan", pelanggan);//memasukkan objek kedalam session
    }
    
}
