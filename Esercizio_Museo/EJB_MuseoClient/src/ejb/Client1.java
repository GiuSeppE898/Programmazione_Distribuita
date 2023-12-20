/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import java.util.List;
import java.util.Scanner;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author sorre
 */
public class Client1 {
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        MuseoEJBRemote m = (MuseoEJBRemote) ctx.lookup("java:global/EJB_Museo/MuseoEJB!ejb.MuseoEJBRemote");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la regione");
        String r = sc.nextLine();
        List <Museo> l = m.cercaregione(r);
        for(Museo m1 : l){
            System.out.println(m1);
        }
    }
    
}
