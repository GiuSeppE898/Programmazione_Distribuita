/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Bambino;
import javax.enterprise.event.Observes;

/**
 *
 * @author sorre
 */
public class UpdateNotificationPriorita {
    public void notify(@Observes @Priorita Bambino b){
        System.out.println("Procedere con Priorita");
        b.setPriorità(true);
        
    }
    
}
