/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Quadro;
import java.io.Serializable;

/**
 *
 * @author sorre
 */
public class MessageWrapper implements Serializable{
    Quadro q;
    public MessageWrapper(){}
    public MessageWrapper(Quadro q) {
        this.q = q;
    }

    public Quadro getQ() {
        return q;
    }

    public void setQ(Quadro q) {
        this.q = q;
    }
    
    
    
}
