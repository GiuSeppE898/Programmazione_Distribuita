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
public interface BambinoEJBRemote {
    void createBambino(Bambino b);
    void updateBambino(Bambino b);
    void deleteBambino(Bambino b);
    
    List <Bambino> Cercatutti();
    List <Bambino> Cercanucleo(int num);
    Bambino Cercaid(int id);
    List <Bambino> Cercalettera(boolean stato);
    
}
