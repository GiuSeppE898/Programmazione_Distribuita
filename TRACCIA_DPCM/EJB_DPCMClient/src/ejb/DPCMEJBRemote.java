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
public interface DPCMEJBRemote {
    public void add(DPCM d);
    public void delete(DPCM d);
    public void update (DPCM d);
    List <DPCM> cercatutti();
    DPCM cercaid(int id);
    List <DPCM> cercaemergenza(String emergenza);
    List <DPCM> cercatipo(String tipo);
    List <DPCM> cercapres(int pres);
    
    
}
