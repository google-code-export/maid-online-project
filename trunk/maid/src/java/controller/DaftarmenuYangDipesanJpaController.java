/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import entity.DaftarmenuYangDipesan;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ACER
 */
public class DaftarmenuYangDipesanJpaController implements Serializable {

    public DaftarmenuYangDipesanJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DaftarmenuYangDipesan daftarmenuYangDipesan) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(daftarmenuYangDipesan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DaftarmenuYangDipesan daftarmenuYangDipesan) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            daftarmenuYangDipesan = em.merge(daftarmenuYangDipesan);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = daftarmenuYangDipesan.getId();
                if (findDaftarmenuYangDipesan(id) == null) {
                    throw new NonexistentEntityException("The daftarmenuYangDipesan with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            DaftarmenuYangDipesan daftarmenuYangDipesan;
            try {
                daftarmenuYangDipesan = em.getReference(DaftarmenuYangDipesan.class, id);
                daftarmenuYangDipesan.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The daftarmenuYangDipesan with id " + id + " no longer exists.", enfe);
            }
            em.remove(daftarmenuYangDipesan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DaftarmenuYangDipesan> findDaftarmenuYangDipesanEntities() {
        return findDaftarmenuYangDipesanEntities(true, -1, -1);
    }

    public List<DaftarmenuYangDipesan> findDaftarmenuYangDipesanEntities(int maxResults, int firstResult) {
        return findDaftarmenuYangDipesanEntities(false, maxResults, firstResult);
    }

    private List<DaftarmenuYangDipesan> findDaftarmenuYangDipesanEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DaftarmenuYangDipesan.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public DaftarmenuYangDipesan findDaftarmenuYangDipesan(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DaftarmenuYangDipesan.class, id);
        } finally {
            em.close();
        }
    }

    public int getDaftarmenuYangDipesanCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DaftarmenuYangDipesan> rt = cq.from(DaftarmenuYangDipesan.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
