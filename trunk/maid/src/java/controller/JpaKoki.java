/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import entity.LoginKoki;
/**
 *
 * @author Susilo
 */
public class JpaKoki {
    
    public JpaKoki() {
        emf = Persistence.createEntityManagerFactory("maidPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Fungsi untuk mencari mahasiswa berdasarkan nrp
     */
     public LoginKoki findKokiByNama(String nama) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT c FROM login_koki c WHERE c.nama =:nama");
            query.setParameter("nama", nama);
            List list = query.getResultList();
            if (list.size() == 1) {

                return (LoginKoki) list.get(0);


            } else {
                return null;
            }
        } finally {
            em.close();
        }
    }

     /**
     * Fungsi untuk mengambil seluruh koki yang tersimpan dalam DB
     */
      public List<LoginKoki> getAllKoki() {
        List<LoginKoki> koki = new ArrayList<LoginKoki>();
        EntityManager em = getEntityManager();
        
            Query q = em.createQuery("SELECT o FROM login_koki ");
            koki = q.getResultList();
            
        return koki;
    }

     public void edit(LoginKoki koki) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            koki = em.merge(koki);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = koki.getNama();
                if (findKoki(id) == null) {
                    throw new NonexistentEntityException("The mahasiswa with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public LoginKoki findKoki(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LoginKoki.class, id);
        } finally {
            em.close();
        }
    }
    
}
