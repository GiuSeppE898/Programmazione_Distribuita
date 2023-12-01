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
public class UpdateNotificationNumero {
    public void notify(@Observes @Numero Vino v){
        System.out.println("“Il vino "+ v.getId()+ " deve essere riassortito");
    }
}

