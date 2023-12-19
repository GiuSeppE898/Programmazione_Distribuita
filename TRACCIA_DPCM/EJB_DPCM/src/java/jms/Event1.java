/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.DPCM;
import javax.enterprise.event.Observes;

/**
 *
 * @author sorre
 */
public class Event1 {
    public void notify(@Observes DPCM d){
        System.out.println("AGGIORNAMENTO EFFETTUATO");
    }
    
}
