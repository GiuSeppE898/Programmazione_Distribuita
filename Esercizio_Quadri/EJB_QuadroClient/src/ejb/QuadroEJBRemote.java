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
public interface QuadroEJBRemote {
    public void add(Quadro q);
    public void update(Quadro q);
    public void delete(Quadro q);
    
    public List <Quadro> cercatutti();
    public List<Quadro> cercaautore(String autore);
    public List<Quadro> cercatecnica(String tecnica);
    public List<Quadro> cercasala(int sala);
    public List<Quadro> cercarestauro(String stato);
    
}
