/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import static ejb.Vino.RICERCA_ID;
import static ejb.Vino.RICERCA_PREZZO;
import static ejb.Vino.RICERCA_VINI;
import static ejb.Vino.RICERCA_VITIGNO;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;


/**
 *
 * @author sorre
 */
@Entity
@NamedQueries({
    @NamedQuery(name=RICERCA_ID, query="SELECT v FROM Vino v WHERE v.id=:id"),
    @NamedQuery(name=RICERCA_PREZZO, query="SELECT v FROM Vino v WHERE v.prezzo =:prezzo"),
    @NamedQuery(name=RICERCA_VITIGNO, query="SELECT v FROM Vino v WHERE v.vitigno=:vitigno"),
    @NamedQuery(name=RICERCA_VINI, query="SELECT v FROM Vino v"),
    

})
public class Vino implements Serializable {
    public static final String RICERCA_ID="Vino.ricercaId";
    public static final String RICERCA_PREZZO="Vino.ricercaPrezzo";
    public static final String RICERCA_VITIGNO="Vino.ricercaVitigno";
    public static final String RICERCA_VINI="Vino.tuttiVini";
    @Id
    private int id;
    private String nominativo;
    private String vitigno;
    private String azienda;
    private int nbottiglie;
    private String provenienza;
    private float prezzo;
    private String tipologia;
    private boolean acquisto;
    public Vino(){}
    public Vino(int id, String nominativo, String vitigno, String azienda, int nbottiglie, String provenienza, float prezzo, String tipologia, boolean acquisto) {
        this.id = id;
        this.nominativo = nominativo;
        this.vitigno = vitigno;
        this.azienda = azienda;
        this.nbottiglie = nbottiglie;
        this.provenienza = provenienza;
        this.prezzo = prezzo;
        this.tipologia = tipologia;
        this.acquisto = acquisto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getVitigno() {
        return vitigno;
    }

    public void setVitigno(String vitigno) {
        this.vitigno = vitigno;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public int getNbottiglie() {
        return nbottiglie;
    }

    public void setNbottiglie(int nbottiglie) {
        this.nbottiglie = nbottiglie;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public boolean isAcquisto() {
        return acquisto;
    }

    public void setAcquisto(boolean acquisto) {
        this.acquisto = acquisto;
    }
    
    
    
    
    
}
