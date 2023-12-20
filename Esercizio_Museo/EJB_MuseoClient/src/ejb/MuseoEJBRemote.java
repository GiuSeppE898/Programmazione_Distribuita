/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionRemote.java to edit this template
 */
package ejb;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sorre
 */
@Remote
public interface MuseoEJBRemote {
    public void add(Museo m);
    public void update(Museo m);
    public void delete(Museo m);
    
    public List<Museo> cercatutti();
    public Museo cercaid(int id);
    public List <Museo> cercaregione(String regione);
}
