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
public interface ScuolaEJBRemote {
    public void createScuola(Scuola s);
    public void deleteScuola(Scuola s);
    public void updateScuola(Scuola s);
    
    public List<Scuola> cercaTutti();
    public Scuola ricercaId(int id);
    public List<Scuola> ricercaTipologia(String tipologia);
    public List<Scuola> ricercaProvincia(String provincia);
    public int ricercaNumero(int id);
    
}
