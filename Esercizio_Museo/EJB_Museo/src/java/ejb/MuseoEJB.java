/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import static ejb.Museo.CERCA_ID;
import static ejb.Museo.CERCA_REGIONE;
import static ejb.Museo.CERCA_TUTTI;
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
@Stateless
@LocalBean
@WebService
public class MuseoEJB implements MuseoEJBRemote {
    @Inject 
    EntityManager em;

    @WebMethod(exclude=true)
    public void add(Museo m) {
        em.persist(m);        
    }

    @Override
    @WebMethod(exclude=true)
    public void update(Museo m) {
        em.merge(m);
    }

    @Override
    @WebMethod(exclude=true)
    public void delete(Museo m) {
        em.remove(em.merge(m));
    }

    @Override
    @WebMethod
    public List<Museo> cercatutti() {
        TypedQuery <Museo> query = em.createNamedQuery(CERCA_TUTTI,Museo.class);
        return query.getResultList();
    }

    @Override
    @WebMethod(exclude=true)
    public Museo cercaid(int id) {
        Query query = em.createNamedQuery(CERCA_ID,Museo.class);
        query.setParameter("id",id);
        return (Museo) query.getSingleResult();
    }

    @Override
    @WebMethod(exclude=true)
    public List<Museo> cercaregione(String regione) {
        TypedQuery <Museo> query = em.createNamedQuery(CERCA_REGIONE,Museo.class);
        query.setParameter("regione",regione);
        return query.getResultList();
    }
}
