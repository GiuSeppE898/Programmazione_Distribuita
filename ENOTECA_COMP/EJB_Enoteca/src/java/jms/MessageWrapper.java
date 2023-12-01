/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import ejb.Vino;
import java.io.Serializable;

/**
 *
 * @author sorre
 */
public class MessageWrapper implements Serializable {
    
    private Integer id;
    private Integer N_Bottiglie;

    public MessageWrapper(Integer id, Integer N_Bottiglie) {
        this.id = id;
        this.N_Bottiglie = N_Bottiglie;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getN_Bottiglie() {
        return N_Bottiglie;
    }

    public void setN_Bottiglie(Integer N_Bottiglie) {
        this.N_Bottiglie = N_Bottiglie;
    }
    
    
}
