/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

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
public class ScuolaProducer {
    public static void main(String [] args) throws NamingException{
        Context ctx = new InitialContext();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nuovo numero di studenti: ");
        int studenti = scanner.nextInt();
        MessageWrapper mw = new MessageWrapper(1,studenti);
        ConnectionFactory connectionFactory = (ConnectionFactory) ctx.lookup ("jms/javaee7/ConnectionFactory");
         Topic topic = (Topic) ctx.lookup("jms/javaee7/Topic");
        
         
         try (JMSContext jmsContext = connectionFactory.createContext()){
             jmsContext.createProducer().send(topic, mw);
         }
    }
    
}
