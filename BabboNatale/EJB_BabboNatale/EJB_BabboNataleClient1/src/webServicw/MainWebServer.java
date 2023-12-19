/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webServicw;

import java.util.List;

/**
 *
 * @author sorre
 */
public class MainWebServer {
    public static void main(String args[]){
        boolean v = false;
        List <Bambino> b = cercalettera(v);
        for (Bambino b1 : b){
            System.out.println(b1.getCognome());
        }
    }

    private static List<Bambino> cercalettera(boolean arg0) {
        webServicw.BambinoEJBService service = new webServicw.BambinoEJBService();
        webServicw.BambinoEJB port = service.getBambinoEJBPort();
        return port.cercalettera(arg0);
    }
    
    
}
