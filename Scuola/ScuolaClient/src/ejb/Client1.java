/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import java.util.List;
import java.util.Scanner;
import static java.util.logging.Logger.global;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author sorre
 */
public class Client1 {
    public static void main(String[] args) throws NamingException{
        Context ctx ;
        ctx = new InitialContext();
        ScuolaEJBRemote s = (ScuolaEJBRemote) ctx.lookup("java:global/EJB_Scuola/ScuolaEJB!ejb.ScuolaEJBRemote");
        System.out.println("Stampa di tutte le scuola");
        List<Scuola> lista = s.cercaTutti();
        for(Scuola s1: lista){
            System.out.println(s1.getNome());
        }        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la tipologia da cercare");
        String tipologia = sc.nextLine();
        List<Scuola> lista1 = s.ricercaTipologia(tipologia);
        for(Scuola s1: lista){
            System.out.println(s1.getNome());
        }
    }
}
