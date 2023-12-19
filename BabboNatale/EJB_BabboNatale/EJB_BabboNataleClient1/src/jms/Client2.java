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
public class Client2 {
    public static void main(String[] args) throws NamingException{
    MessageWrapper mp= new MessageWrapper(2);
    Context ctx = new InitialContext();
    ConnectionFactory cf =(ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
    Topic topic = (Topic) ctx.lookup("jms/javaee7/Topic");
    try(JMSContext jmscontext = cf.createContext()){
        jmscontext.createProducer().send(topic, mp);
    }    
    
    
    }    
}
