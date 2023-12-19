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
public class Event2 {
    public void notify(@Observes @numero DPCM d){
        System.out.println("SUPERATE LE 10 PRESENTAZIONI");
    }
    
}
