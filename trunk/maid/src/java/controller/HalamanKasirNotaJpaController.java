/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import entity.HalamanKasirNota;
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
public class HalamanKasirNotaJpaController implements Serializable {

    public HalamanKasirNotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HalamanKasirNota halamanKasirNota) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(halamanKasirNota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HalamanKasirNota halamanKasirNota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            halamanKasirNota = em.merge(halamanKasirNota);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = halamanKasirNota.getId();
                if (findHalamanKasirNota(id) == null) {
                    throw new NonexistentEntityException("The halamanKasirNota with id " + id + " no longer exists.");
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
            HalamanKasirNota halamanKasirNota;
            try {
                halamanKasirNota = em.getReference(HalamanKasirNota.class, id);
                halamanKasirNota.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The halamanKasirNota with id " + id + " no longer exists.", enfe);
            }
            em.remove(halamanKasirNota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HalamanKasirNota> findHalamanKasirNotaEntities() {
        return findHalamanKasirNotaEntities(true, -1, -1);
    }

    public List<HalamanKasirNota> findHalamanKasirNotaEntities(int maxResults, int firstResult) {
        return findHalamanKasirNotaEntities(false, maxResults, firstResult);
    }

    private List<HalamanKasirNota> findHalamanKasirNotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HalamanKasirNota.class));
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

    public HalamanKasirNota findHalamanKasirNota(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HalamanKasirNota.class, id);
        } finally {
            em.close();
        }
    }

    public int getHalamanKasirNotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HalamanKasirNota> rt = cq.from(HalamanKasirNota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
