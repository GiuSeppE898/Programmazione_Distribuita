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
public class Main {
    public static void main(String[] args) throws NamingException{
        
           Scanner scanner = new Scanner(System.in);
        
           Context ctx;
           ctx = new InitialContext();
           
           VinoEJBRemote VinoEJB = (VinoEJBRemote) ctx.lookup("java:global/EJB_Enoteca/VinoEJB!ejb.VinoEJBRemote");
           
           System.out.println("Stampa Vini: ");
           List<Vino> v = VinoEJB.tuttivini();
           v.forEach(v1 -> {
               System.out.println("\nID: " + v1.getId());
               System.out.println("Nominativo: " + v1.getNominativo());
               System.out.println("Tipologia: " + v1.getTipologia());
           });
           
           
           System.out.println("Ricerca per ID: ");
           System.out.print("Inserisci un id: ");
           
           int n = scanner.nextInt();
           Vino v1 = VinoEJB.ricercaId(n);
           
           System.out.println("\n\nTI RITORNO:");
           System.out.println("\nID: " + v1.getId());
           System.out.println("Nominativo: " + v1.getNominativo());
           System.out.println("Tipologia: " + v1.getTipologia());
           
    }
    
}
