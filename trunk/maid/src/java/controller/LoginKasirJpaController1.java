/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import entity.LoginKasir;
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
public class LoginKasirJpaController1 implements Serializable {

    public LoginKasirJpaController1(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LoginKasir loginKasir) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(loginKasir);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LoginKasir loginKasir) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            loginKasir = em.merge(loginKasir);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = loginKasir.getId();
                if (findLoginKasir(id) == null) {
                    throw new NonexistentEntityException("The loginKasir with id " + id + " no longer exists.");
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
            LoginKasir loginKasir;
            try {
                loginKasir = em.getReference(LoginKasir.class, id);
                loginKasir.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loginKasir with id " + id + " no longer exists.", enfe);
            }
            em.remove(loginKasir);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LoginKasir> findLoginKasirEntities() {
        return findLoginKasirEntities(true, -1, -1);
    }

    public List<LoginKasir> findLoginKasirEntities(int maxResults, int firstResult) {
        return findLoginKasirEntities(false, maxResults, firstResult);
    }

    private List<LoginKasir> findLoginKasirEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LoginKasir.class));
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

    public LoginKasir findLoginKasir(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LoginKasir.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoginKasirCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LoginKasir> rt = cq.from(LoginKasir.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
