/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Bambino;
import ejb.BambinoEJB;
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
public class BambinoMDB implements MessageListener {
    @Inject
    private BambinoEJB b;
    @Inject
    private Event <Bambino> event;
    @Inject @Priorita
    private Event <Bambino> eventP;

    @Override
    public void onMessage(Message message) {
        try{
            MessageWrapper mw = message.getBody(MessageWrapper.class);
            int id = mw.getId();
            
            Bambino b1 = b.Cercaid(id);
            event.fire(b1);
            if(b1.getNumerop()>9){
                eventP.fire(b1);
            }
            
        }catch (JMSException ex) {
            Logger.getLogger(BambinoMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
