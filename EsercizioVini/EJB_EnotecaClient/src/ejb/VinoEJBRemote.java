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
public interface VinoEJBRemote {
    void createVino(Vino v);
    void deleteVino(Vino v);
    void updateVino(Vino v);
    List<Vino> tuttivini();
    
    Vino ricercaId(int id);
    List <Vino>ricercaPrezzo(float prezzo);
    List <Vino>ricercaVitigno(String vitigno);
    
    
}
