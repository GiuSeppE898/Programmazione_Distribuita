/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Vino;
import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author sorre
 */
public class EnotecaProducer {
    public static void main(String[] args) throws NamingException{
        Scanner scanner = new Scanner(System.in);
         //Vino v = new  Vino(1, "Montevetrano", "Carbenet", "Colli Di Salerno", 4, "Italia", 60, "Rosso", false); 
         
        // Chiedi all'utente il nuovo numero di bottiglie
        System.out.print("Inserisci il nuovo numero di bottiglie: ");
        int nuovoNumeroBottiglie = scanner.nextInt();
        MessageWrapper mw = new MessageWrapper(1,nuovoNumeroBottiglie);
         
         Context jndiContext = new InitialContext();
    
         ConnectionFactory connectionFactory = (ConnectionFactory) jndiContext.lookup ("jms/javaee7/ConnectionFactory");
         Topic topic = (Topic) jndiContext.lookup("jms/javaee7/Topic");
        
         
         try (JMSContext jmsContext = connectionFactory.createContext()){
             jmsContext.createProducer().send(topic, mw);
         }
    }
}
