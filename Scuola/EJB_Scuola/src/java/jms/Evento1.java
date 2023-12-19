/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Scuola;
import javax.enterprise.event.Observes;

/**
 *
 * @author sorre
 */
public class Evento1 {
    public void norify(@Observes Scuola s){
        System.out.println("Aggiornamento Effettuato");
    }
    
}
