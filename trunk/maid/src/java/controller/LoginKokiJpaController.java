/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import entity.LoginKoki;
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
public class LoginKokiJpaController implements Serializable {

    public LoginKokiJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LoginKoki loginKoki) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(loginKoki);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LoginKoki loginKoki) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            loginKoki = em.merge(loginKoki);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = loginKoki.getId();
                if (findLoginKoki(id) == null) {
                    throw new NonexistentEntityException("The loginKoki with id " + id + " no longer exists.");
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
            LoginKoki loginKoki;
            try {
                loginKoki = em.getReference(LoginKoki.class, id);
                loginKoki.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loginKoki with id " + id + " no longer exists.", enfe);
            }
            em.remove(loginKoki);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LoginKoki> findLoginKokiEntities() {
        return findLoginKokiEntities(true, -1, -1);
    }

    public List<LoginKoki> findLoginKokiEntities(int maxResults, int firstResult) {
        return findLoginKokiEntities(false, maxResults, firstResult);
    }

    private List<LoginKoki> findLoginKokiEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LoginKoki.class));
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

    public LoginKoki findLoginKoki(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LoginKoki.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoginKokiCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LoginKoki> rt = cq.from(LoginKoki.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
