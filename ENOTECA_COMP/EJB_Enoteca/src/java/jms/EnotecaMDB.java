/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Vino;
import ejb.VinoEJB;
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

@MessageDriven (mappedName = "jms/javaee7/Topic")
public class EnotecaMDB implements MessageListener {
    
    @Inject
    private VinoEJB vinoEJB;
    
    @Inject
    private Event <Vino> event;
    
    @Inject @Numero
    private Event <Vino> eventNumero;

    @Override
    public void onMessage(Message message) {
        
        try {
            MessageWrapper mw = message.getBody(MessageWrapper.class);
            
            Integer id = mw.getId();
            Integer N_Bottiglie = mw.getN_Bottiglie();
            
            Vino v = vinoEJB.ricercaId(id);
            v.setNbottiglie(N_Bottiglie);
            
            event.fire(v);
            
            if(N_Bottiglie < 10){
                eventNumero.fire(v);
            }
            
        } catch (JMSException ex) {
            Logger.getLogger(EnotecaMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
    
