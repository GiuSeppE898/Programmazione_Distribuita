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
public class Client1 {
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        QuadroEJBRemote q =(QuadroEJBRemote) ctx.lookup("java:global/EJB_Quadro/QuadroEJB!ejb.QuadroEJBRemote");
        List<Quadro> l = q.cercaautore("Caravaggio");
        
        for(Quadro q1: l){
            System.out.println(q1);
        }
        l = q.cercarestauro("restauro");
        
        for(Quadro q1: l){
            System.out.println(q1);
        }
    }
    
}
