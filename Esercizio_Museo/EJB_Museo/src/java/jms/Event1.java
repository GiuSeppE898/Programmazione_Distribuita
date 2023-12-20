/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Museo;
import javax.enterprise.event.Observes;

/**
 *
 * @author sorre
 */
public class Event1 {
    public void notify(@Observes Museo m){
        System.out.println("Aggiornamento Effettuato!");
    }
    
}
