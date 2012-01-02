/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import controller.exceptions.PreexistingEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import entity.Pesanan;
import entity.Pelanggan;
/**
 *
 * @author Ricko Shin
 */
public class JpaPelanggan {
    
     public JpaPelanggan() {
        emf = Persistence.createEntityManagerFactory("maidPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Fungsi untuk membuat pelanggan baru
     */
    public void create(Pelanggan pelanggan) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pelanggan);
            em.getTransaction().commit();
        } catch (Exception ex) {
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Fungsi untuk menghapus pelanggan yang ada dengan input berupa nama
     */
    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pelanggan pelanggan;
            try {
                pelanggan = em.getReference(Pelanggan.class, id);
                pelanggan.getNama();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The customer with id " + id + " has paid.", enfe);
            }
            em.remove(pelanggan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }


    public Pelanggan findPelanggan(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pelanggan.class, id);
        } finally {
            em.close();
        }
    }

    /**
     * Fungsi untuk mencari pelanggan berdasarkan nama
     */
     public Pelanggan findPelangganByNano(String nama) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Pelanggan c WHERE c.nama =:nama");
            query.setParameter("nama", nama);
            List list = query.getResultList();
            if (list.size() == 1) {

                return (Pelanggan) list.get(0);


            } else {
                return null;
            }
        } finally {
            em.close();
        }
    }

     /**
     * Fungsi untuk mengambil seluruh pelanggan yang tersimpan dalam DB
     */
      public List<Pelanggan> getAllPelanggan() {
        List<Pelanggan> pelanggan = new ArrayList<Pelanggan>();
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT o FROM Pelanggan");
            pelanggan = q.getResultList();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return pelanggan;
    }


    public Pesanan findPesananById(String idPesanan) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM Pesanan c WHERE c.idpesanan =:idpesanan");
            query.setParameter("idpesanan", idPesanan);
            List list = query.getResultList();
            if (list.size() == 1) {

                return (Pesanan) list.get(0);


            } else {
                return null;
            }
        } finally {
            em.close();
        }
    }

    
}
