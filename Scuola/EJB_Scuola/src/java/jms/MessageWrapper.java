/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import java.io.Serializable;

/**
 *
 * @author sorre
 */
public class MessageWrapper implements Serializable{
    int id;
    int numeroS;
    public MessageWrapper(){}

    public MessageWrapper(int id, int numeroS) {
        this.id = id;
        this.numeroS = numeroS;
    }

    public int getId() {
        return id;
    }

    public int getNumeroS() {
        return numeroS;
    }
    
    
}
