/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Scuola;
import ejb.ScuolaEJB;
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
public class ScuolaMDB implements MessageListener{
    @Inject 
    private ScuolaEJB s;
    @Inject
    private Event <Scuola> evento1;
    @Inject @gold
    private Event <Scuola> evento2;
    
     public void onMessage(Message message) {
        
        try {
            MessageWrapper mw = message.getBody(MessageWrapper.class);
            
            Integer id = mw.getId();
            Integer numeroS = mw.getNumeroS() ;
            
            Scuola s1 = s.ricercaId(id);
            s1.setNumeroS(numeroS);
            
            evento1.fire(s1);
            
            if(numeroS>40){
                evento2.fire(s1);
            }
            
        } catch (JMSException ex) {
            Logger.getLogger(ScuolaMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
