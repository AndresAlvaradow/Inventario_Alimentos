/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioalimentos.persistencia;

import inventarioalimentos.persistencia.exceptions.NonexistentEntityException;
import inventarioalimentos.persistencia.exceptions.PreexistingEntityException;
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
 * @author AndresA
 */
public class BeneficiarioJpaController implements Serializable {

    public BeneficiarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Beneficiario beneficiario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(beneficiario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findBeneficiario(beneficiario.getIdbeneficiario()) != null) {
                throw new PreexistingEntityException("Beneficiario " + beneficiario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Beneficiario beneficiario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            beneficiario = em.merge(beneficiario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = beneficiario.getIdbeneficiario();
                if (findBeneficiario(id) == null) {
                    throw new NonexistentEntityException("The beneficiario with id " + id + " no longer exists.");
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
            Beneficiario beneficiario;
            try {
                beneficiario = em.getReference(Beneficiario.class, id);
                beneficiario.getIdbeneficiario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The beneficiario with id " + id + " no longer exists.", enfe);
            }
            em.remove(beneficiario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Beneficiario> findBeneficiarioEntities() {
        return findBeneficiarioEntities(true, -1, -1);
    }

    public List<Beneficiario> findBeneficiarioEntities(int maxResults, int firstResult) {
        return findBeneficiarioEntities(false, maxResults, firstResult);
    }

    private List<Beneficiario> findBeneficiarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Beneficiario.class));
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

    public Beneficiario findBeneficiario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Beneficiario.class, id);
        } finally {
            em.close();
        }
    }

    public int getBeneficiarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Beneficiario> rt = cq.from(Beneficiario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
