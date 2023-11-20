/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import static ejb.Vino.RICERCA_ID;
import static ejb.Vino.RICERCA_PREZZO;
import static ejb.Vino.RICERCA_VINI;
import static ejb.Vino.RICERCA_VITIGNO;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author sorre
 */
@Stateless
@LocalBean
public class VinoEJB implements VinoEJBRemote {
    @Inject
    EntityManager em;
    @Override
    public void createVino(Vino v) {
        em.persist(v);
    }

    @Override
    public void deleteVino(Vino v) {
        em.remove(em.merge(v));
    }

    @Override
    public void updateVino(Vino v) {
        em.merge(v);
    }

    @Override
    public List<Vino> tuttivini() {
        TypedQuery <Vino> query = em.createNamedQuery(RICERCA_VINI, Vino.class);
        return query.getResultList();        
    }

    @Override
    public Vino ricercaId(int id) {
        Query query = em.createNamedQuery(RICERCA_ID,Vino.class);
        query.setParameter("id",id);
        return (Vino) query.getSingleResult();
        
    }

    @Override
    public List<Vino> ricercaPrezzo(float prezzo) {
        TypedQuery <Vino> query = em.createNamedQuery(RICERCA_PREZZO,Vino.class);
        query.setParameter("prezzo",prezzo);
        return query.getResultList();
    }

    @Override
    public List<Vino> ricercaVitigno(String vitigno) {
        TypedQuery <Vino> query = em.createNamedQuery(RICERCA_VITIGNO, Vino.class);
        query.setParameter("vitigno",vitigno);
        return query.getResultList();
    }

    
}
