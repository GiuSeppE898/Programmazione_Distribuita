/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb_scuolawebsclient;

/**
 *
 * @author sorre
 */

public class EJB_ScuolaWebSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = ricercaNumero(1);
        System.out.println(""+num);
    }

    private static int ricercaNumero(int arg0) {
        ScuolaEJBService service = new ScuolaEJBService();
        ScuolaEJB port = service.getScuolaEJBPort();
        return port.ricercaNumero(arg0);
    }
    
}
