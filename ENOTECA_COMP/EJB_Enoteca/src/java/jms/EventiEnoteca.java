/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Vino;
import javax.enterprise.event.Observes;

/**
 *
 * @author sorre
 */
public class EventiEnoteca {
    public void notify(@Observes Vino v) {
        System.out.println("ID: " + v.getId() + "\n" + "Aggiornamento numero di bottiglie: " + v.getNbottiglie());
    }
    
}

