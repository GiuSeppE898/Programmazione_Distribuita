/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb_museowebsclient;

import ejb.Museo;
import java.util.List;

/**
 *
 * @author sorre
 */

public class EJB_MuseoWebSClient {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        List <ejb.Museo> l = cercatutti();
        for(ejb.Museo m : l){
            System.out.println(m.getNome());
        }
    }

    private static java.util.List<ejb.Museo> cercatutti() {
        ejb.MuseoEJBService service = new ejb.MuseoEJBService();
        ejb.MuseoEJB port = service.getMuseoEJBPort();
        return port.cercatutti();
    }
    
}
