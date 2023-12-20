/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb_quadrowebsclient;

import java.util.List;

/**
 *
 * @author sorre
 */

public class EJB_QuadroWebSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<ejb.Quadro> l = cercarestauro("restauro");
        for(ejb.Quadro q: l){
            System.out.println("->"+q.getTitolo());            
        }
    }

    private static List<ejb.Quadro> cercarestauro(String arg0) {
        ejb.QuadroEJBService service = new ejb.QuadroEJBService();
        ejb.QuadroEJB port = service.getQuadroEJBPort();
        return port.cercarestauro(arg0);
    }
    
}
