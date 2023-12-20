/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Museo;
import ejb.MuseoEJB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author sorre
 */
@MessageDriven(mappedName = "jms/javaee7/Topic")
public class MuseoMDB implements MessageListener {
    @Inject
    MuseoEJB m;
    @Inject
    Event <Museo> e1;
    @Inject @complimenti
    Event <Museo> e2;
    
    public void onMessage(Message message){
        try {
            MessageWrapper mw = message.getBody(MessageWrapper.class);
            int id = mw.getId();
            long num = mw.getNvis();
            
            Museo m1 = m.cercaid(id);
            m1.setNvisitatori(num);
            m.update(m1);
            e1.fire(m1);
            if(num>5000){
                e2.fire(m1);
            }
        }catch(JMSException ex){
            Logger.getLogger(MuseoMDB.class.getName()).log(Level.SEVERE,null,ex);
        
        }
        
    }
    
    
}
