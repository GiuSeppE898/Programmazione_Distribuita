/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Quadro;
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
public class Client2 {
    public static void main(String[] args) throws NamingException{
        Quadro q = new Quadro(4,"Incoronazione della Vergine","Pinturicchio",1505,"Olio su tavola",7,"prestito");      
        MessageWrapper mw = new MessageWrapper(q);
        Context ctx = new InitialContext();
        Topic topic = (Topic)ctx.lookup("jms/javaee7/Topic");
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        try(JMSContext jmsctx = cf.createContext()){
            jmsctx.createProducer().send(topic,mw);
        }
        
        
        
    }
}
