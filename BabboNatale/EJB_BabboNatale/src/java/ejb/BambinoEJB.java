/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import static ejb.Bambino.CERCA_ID;
import static ejb.Bambino.CERCA_NUCLEO;
import static ejb.Bambino.CERCA_TUTTI;
import static ejb.Bambino.LETTERA_NO;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author sorre
 */
@WebService
@Stateless
@LocalBean
public class BambinoEJB implements BambinoEJBRemote {
    @Inject
    EntityManager em;
    
    @Override
    public void createBambino(Bambino b) {
        em.persist(b);
    }

    @Override
    public void updateBambino(Bambino b) {
        em.merge(b);
        }

    @Override
    public void deleteBambino(Bambino b) {
        em.remove(em.merge(b));
    }

    @Override
    public List<Bambino> Cercatutti() {
        TypedQuery query = em.createNamedQuery(CERCA_TUTTI, Bambino.class);
        return query.getResultList();
    }

    @Override
    public List<Bambino> Cercanucleo(int num) {
        TypedQuery query = em.createNamedQuery(CERCA_NUCLEO,Bambino.class);
        query.setParameter("num",num);
        return query.getResultList();
    }

    @Override
    public Bambino Cercaid(int id) {
        Query query = em.createNamedQuery(CERCA_ID,Bambino.class);
        query.setParameter("id",id);
        return (Bambino) query.getSingleResult();
    }

    @Override
    @WebMethod
    public List<Bambino> Cercalettera(boolean stato) {
        TypedQuery query = em.createNamedQuery(LETTERA_NO,Bambino.class);
        query.setParameter("stato",false);
        return query.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
