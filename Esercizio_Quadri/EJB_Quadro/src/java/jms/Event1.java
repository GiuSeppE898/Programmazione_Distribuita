/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import javax.enterprise.event.Observes;

/**
 *
 * @author sorre
 */
public class Event1 {
    public void notify (@Observes int num){
        System.out.println("Aggiornamento effettuato, numero di quadri : "+num);        
    }
    
}
