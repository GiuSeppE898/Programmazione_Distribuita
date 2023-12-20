/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;


import ejb.Quadro;
import ejb.QuadroEJB;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sorre
 */
@MessageDriven(mappedName="jms/javaee7/Topic")
public class QuadroMDB implements MessageListener{
    @Inject
    QuadroEJB q;
    @Inject
    Event <Integer> e1;

    @Override
    public void onMessage(Message message) {
        try{
            MessageWrapper mw = message.getBody(MessageWrapper.class);
            Quadro q1 = mw.getQ();
            q.add(q1);
            int size = q.cercatutti().size();
            e1.fire(size);
            
            
            
        }catch(JMSException ex){
            Logger.getLogger(QuadroMDB.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    
    
}
