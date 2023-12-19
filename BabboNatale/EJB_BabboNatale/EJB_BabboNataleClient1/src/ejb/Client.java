/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;    

/**
 *
 * @author sorre
 */
public class Client {
    public static void main(String[] args) throws NamingException{
        Context ctx ;
        ctx = new InitialContext();
        BambinoEJBRemote BambinoEJB = (BambinoEJBRemote) ctx.lookup("java:global/EJB_BabboNatale/BambinoEJB!ejb.BambinoEJBRemote");
        System.out.println("Stampa Bambini: ");
        List<Bambino> l = BambinoEJB.Cercatutti();
        for(Bambino b1 : l){
            System.out.println(b1);
        }
        
    }
    
}
