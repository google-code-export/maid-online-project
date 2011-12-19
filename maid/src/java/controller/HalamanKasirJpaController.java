/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import entity.HalamanKasir;
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
public class HalamanKasirJpaController implements Serializable {

    public HalamanKasirJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HalamanKasir halamanKasir) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(halamanKasir);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HalamanKasir halamanKasir) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            halamanKasir = em.merge(halamanKasir);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = halamanKasir.getId();
                if (findHalamanKasir(id) == null) {
                    throw new NonexistentEntityException("The halamanKasir with id " + id + " no longer exists.");
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
            HalamanKasir halamanKasir;
            try {
                halamanKasir = em.getReference(HalamanKasir.class, id);
                halamanKasir.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The halamanKasir with id " + id + " no longer exists.", enfe);
            }
            em.remove(halamanKasir);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HalamanKasir> findHalamanKasirEntities() {
        return findHalamanKasirEntities(true, -1, -1);
    }

    public List<HalamanKasir> findHalamanKasirEntities(int maxResults, int firstResult) {
        return findHalamanKasirEntities(false, maxResults, firstResult);
    }

    private List<HalamanKasir> findHalamanKasirEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HalamanKasir.class));
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

    public HalamanKasir findHalamanKasir(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HalamanKasir.class, id);
        } finally {
            em.close();
        }
    }

    public int getHalamanKasirCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HalamanKasir> rt = cq.from(HalamanKasir.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
