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
public class MessageWrapper implements Serializable {
    int id;
    long nvis;
    public MessageWrapper(){}

    public MessageWrapper(int id, long nvis) {
        this.id = id;
        this.nvis = nvis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNvis() {
        return nvis;
    }

    public void setNvis(long nvis) {
        this.nvis = nvis;
    }
    
    
}
