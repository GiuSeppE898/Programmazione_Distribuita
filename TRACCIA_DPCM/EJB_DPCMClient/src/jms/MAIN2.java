/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

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
public class MAIN2 {
    public static void main(String[] args) throws NamingException{
        Context ctx = new InitialContext();
        Topic topic = (Topic) ctx.lookup("jms/javaee7/Topic");
        ConnectionFactory cf =  (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        MessageWrapper mw = new MessageWrapper(1,1);
        try(JMSContext jmsctx = cf.createContext()){
            jmsctx.createProducer().send(topic,mw);            
        }
        
    }
    
}
