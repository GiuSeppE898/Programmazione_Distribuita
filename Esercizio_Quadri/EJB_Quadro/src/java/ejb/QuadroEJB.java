/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import static ejb.Quadro.CERCA_AUTORE;
import static ejb.Quadro.CERCA_RESTAURO;
import static ejb.Quadro.CERCA_SALA;
import static ejb.Quadro.CERCA_TECNICA;
import static ejb.Quadro.CERCA_TUTTI;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author sorre
 */
@Stateless
@LocalBean
@WebService
public class QuadroEJB implements QuadroEJBRemote {
    @Inject 
    EntityManager em;
    @Override
    @WebMethod(exclude=true)
    public void add(Quadro q) {
        em.persist(q);
    }

    @Override
    @WebMethod(exclude=true)
    public void update(Quadro q) {
        em.merge(q);
    }

    @Override
    @WebMethod(exclude=true)
    public void delete(Quadro q) {
        em.remove(em.merge(q));
    }

    @Override
    @WebMethod(exclude=true)
    public List<Quadro> cercatutti() {
        TypedQuery <Quadro> query = em.createNamedQuery(CERCA_TUTTI,Quadro.class);
        return query.getResultList();
    }

    @Override
    @WebMethod(exclude=true)
    public List<Quadro> cercaautore(String autore) {
        TypedQuery <Quadro> query = em.createNamedQuery(CERCA_AUTORE,Quadro.class);
        query.setParameter("autore",autore);
        return query.getResultList();
    }

    @Override
    @WebMethod(exclude=true)
    public List<Quadro> cercatecnica(String tecnica) {
        TypedQuery <Quadro> query = em.createNamedQuery(CERCA_TECNICA,Quadro.class);
        query.setParameter("tecnica",tecnica);
        return query.getResultList();
    }

    @Override
    @WebMethod(exclude=true)
    public List<Quadro> cercasala(int sala) {
       TypedQuery <Quadro> query = em.createNamedQuery(CERCA_SALA,Quadro.class);
       query.setParameter("sala",sala);
       return query.getResultList(); 
    }

    @Override
    @WebMethod
    public List<Quadro> cercarestauro(String stato) {
        TypedQuery <Quadro> query = em.createNamedQuery(CERCA_RESTAURO,Quadro.class);
        query.setParameter("stato",stato);
        return query.getResultList();
    }

}
