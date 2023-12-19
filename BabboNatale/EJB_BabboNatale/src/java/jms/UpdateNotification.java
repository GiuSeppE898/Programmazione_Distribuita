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
public class UpdateNotification {
    public void notify(@Observes Bambino b){
        b.setStatol(true);
        System.out.println("ID: " + b.getId() + "\n" + "Aggiornamento effettuato ");      
    }
    
}
