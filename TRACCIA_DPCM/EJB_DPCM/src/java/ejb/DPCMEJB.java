/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import static ejb.DPCM.CERCA_EMERGENZA;
import static ejb.DPCM.CERCA_ID;
import static ejb.DPCM.CERCA_PRES;
import static ejb.DPCM.CERCA_TIPO;
import static ejb.DPCM.CERCA_TUTTI;
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
public class DPCMEJB implements DPCMEJBRemote {
@Inject
EntityManager em;
    @Override
    @WebMethod(exclude=true)
    public void add(DPCM d) {
        em.persist(d);        
    }

    @Override
    @WebMethod(exclude=true)
    public void delete(DPCM d) {
        em.remove(em.merge(d));
    }

    @Override
    @WebMethod(exclude=true)
    public void update(DPCM d) {
        em.merge(d);
    }

    @Override
    @WebMethod(exclude=true)
    public List<DPCM> cercatutti() {
        TypedQuery <DPCM> query = em.createNamedQuery(CERCA_TUTTI,DPCM.class);
        return query.getResultList();
    }

    @Override
    @WebMethod(exclude=true)
    public DPCM cercaid(int id) {
        Query query = em.createNamedQuery(CERCA_ID,DPCM.class);
        query.setParameter("id",id);
        return (DPCM) query.getSingleResult();
    }

    @Override
    @WebMethod(exclude=true)
    public List<DPCM> cercaemergenza(String emergenza) {
        TypedQuery query = em.createNamedQuery(CERCA_EMERGENZA,DPCM.class);
        query.setParameter("emergenza",emergenza);
        return query.getResultList();
    }


    @Override
    @WebMethod(exclude=true)
    public List<DPCM> cercapres(int Numpres) {
        TypedQuery query = em.createNamedQuery(CERCA_PRES,DPCM.class);
        query.setParameter("numPres",Numpres);
        return query.getResultList();
    }
    @Override
    @WebMethod
    public List<DPCM> cercatipo(String tipo) {
        TypedQuery query = em.createNamedQuery(CERCA_TIPO,DPCM.class);
        query.setParameter("tipo",tipo);
        return query.getResultList();        
    }
    
}
