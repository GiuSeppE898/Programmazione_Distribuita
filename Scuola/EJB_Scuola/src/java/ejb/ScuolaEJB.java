/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import static ejb.Scuola.CERCA_TUTTI;
import static ejb.Scuola.RICERCA_ID;
import static ejb.Scuola.RICERCA_NUMERO;
import static ejb.Scuola.RICERCA_PROVINCIA;
import static ejb.Scuola.RICERCA_TIPOLOGIA;
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
public class ScuolaEJB implements ScuolaEJBRemote {
    @Inject
    EntityManager em;
    @Override
    public void createScuola(Scuola s) {
        em.persist(s);
    }

    @Override
    public void deleteScuola(Scuola s) {
        em.remove(em.merge(s));
    }

    @Override
    public void updateScuola(Scuola s) {
        em.merge(s);
    }

    @Override
    public List<Scuola> cercaTutti() {
        TypedQuery query = em.createNamedQuery(CERCA_TUTTI, Scuola.class);
        return query.getResultList();
    }

    @Override
    public Scuola ricercaId(int id) {
        Query query = em.createNamedQuery(RICERCA_ID, Scuola.class);
        query.setParameter("id",id);
        return (Scuola) query.getSingleResult();
    }

    @Override
    public List<Scuola> ricercaTipologia(String tipologia) {
        TypedQuery query = em.createNamedQuery(RICERCA_TIPOLOGIA,Scuola.class);
        query.setParameter("tipologia",tipologia);
        return query.getResultList();
    }

    @Override
    public List<Scuola> ricercaProvincia(String provincia) {
        TypedQuery query = em.createNamedQuery(RICERCA_PROVINCIA,Scuola.class);
        query.setParameter("provincia",provincia);
        return query.getResultList();
    }
    
    @WebMethod
    public int ricercaNumero(int id){
        Query query = em.createNamedQuery(RICERCA_NUMERO,Scuola.class);
        query.setParameter("id",id);
        return (int) query.getSingleResult();
    }

    
}
