/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.DPCM;
import ejb.DPCMEJB;
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
public class DPCMMDB implements MessageListener {
@Inject
DPCMEJB d;
@Inject
Event <DPCM> e1;
@Inject @numero
Event <DPCM> e2;

    @Override
    public void onMessage(Message message) {       
        try{
            MessageWrapper mw = message.getBody(MessageWrapper.class);  
            int id = mw.getId();
            int num = mw.getNum();
            DPCM d1 = d.cercaid(id);
            d1.setNumPres(d1.getNumPres()+num);
            e1.fire(d1);
            if(d1.getNumPres()>10) e2.fire(d1);
            
        }catch(JMSException ex){
            Logger.getLogger(DPCMMDB.class.getName()).log(Level.SEVERE,null,ex);            
        }
        
        
    }
    
}
