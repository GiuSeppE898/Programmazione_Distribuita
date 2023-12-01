/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb_enotecawebsclient;

import ejb.Vino;
import java.util.List;

/**
 *
 * @author sorre
 */
public class EJB_EnotecaWebSClient {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        List <Vino> v = ricercaTipologia("Champagne");
        for(Vino v1 : v){
            System.out.println("Nome : "+v1.getNominativo());
        }
    }

    private static java.util.List<ejb.Vino> ricercaTipologia(java.lang.String arg0) {
        ejb.VinoEJBService service = new ejb.VinoEJBService();
        ejb.VinoEJB port = service.getVinoEJBPort();
        return port.ricercaTipologia(arg0);
    }
    
}
