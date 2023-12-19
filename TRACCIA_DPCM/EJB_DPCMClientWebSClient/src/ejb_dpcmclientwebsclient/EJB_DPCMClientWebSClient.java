/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb_dpcmclientwebsclient;

import ejb.DPCMEJB;
import ejb.DPCMEJBService;
import ejb.Dpcm;
import java.util.List;

/**
 *
 * @author sorre
 */

public class EJB_DPCMClientWebSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Dpcm> l = cercatipo("Sanitaria");
        for(Dpcm d1 : l){
            System.out.println(d1.getNome());
        }
    }

    private static List<Dpcm> cercatipo(String arg0) {
        ejb.DPCMEJBService service = new ejb.DPCMEJBService();
        ejb.DPCMEJB port = service.getDPCMEJBPort();
        return port.cercatipo(arg0);
    }
    
}
