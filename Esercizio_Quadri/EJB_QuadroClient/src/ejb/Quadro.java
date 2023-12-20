/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import static ejb.Quadro.CERCA_AUTORE;
import static ejb.Quadro.CERCA_RESTAURO;
import static ejb.Quadro.CERCA_SALA;
import static ejb.Quadro.CERCA_TECNICA;
import static ejb.Quadro.CERCA_TUTTI;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sorre
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name=CERCA_TUTTI,query="SELECT q FROM Quadro q"),
    @NamedQuery(name=CERCA_AUTORE, query="SELECT q FROM Quadro q WHERE q.autore=:autore"),
    @NamedQuery (name=CERCA_TECNICA, query="SELECT q FROM Quadro q WHERE q.tecnica=:tecnica"),
    @NamedQuery (name=CERCA_SALA, query="SELECT q FROM Quadro q WHERE q.sala=:sala"),
    @NamedQuery (name=CERCA_RESTAURO, query="SELECT q FROM Quadro q WHERE q.stato=:stato")
})
public class Quadro implements Serializable {
    public static final String CERCA_TUTTI = "Quadro.cercatutti";
    public static final String CERCA_AUTORE = "Quadro.cercaautore";
    public static final String CERCA_TECNICA = "Quadro.cercatecnica";
    public static final String CERCA_SALA = "Quadro.cercasala";
    public static final String CERCA_RESTAURO = "Quadro.cercarestauro";
    
    @Id
    int id;
    String titolo;
    String autore;
    int anno;
    String tecnica;
    int sala;
    String stato;
    public Quadro(){}

    public Quadro(int id, String titolo, String autore, int anno, String tecnica, int sala, String Stato) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.tecnica = tecnica;
        this.sala = sala;
        this.stato = Stato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String Stato) {
        this.stato = Stato;
    }

    @Override
    public String toString() {
        return "Quadro{" + "id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", anno=" + anno + ", tecnica=" + tecnica + ", sala=" + sala + ", Stato=" + stato + '}';
    }
    
    
}
