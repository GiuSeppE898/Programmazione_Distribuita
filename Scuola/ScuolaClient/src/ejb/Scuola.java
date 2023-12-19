/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import static ejb.Scuola.CERCA_TUTTI;
import static ejb.Scuola.RICERCA_ID;
import static ejb.Scuola.RICERCA_NUMERO;
import static ejb.Scuola.RICERCA_PROVINCIA;
import static ejb.Scuola.RICERCA_TIPOLOGIA;
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
@NamedQueries({
    @NamedQuery(name=CERCA_TUTTI, query = "SELECT s FROM Scuola s"),
    @NamedQuery(name = RICERCA_ID, query = "SELECT s FROM Scuola s WHERE s.id=:id"),
    @NamedQuery(name= RICERCA_TIPOLOGIA , query = "SELECT s FROM Scuola s WHERE s.tipologia = :tipologia"),
    @NamedQuery(name= RICERCA_PROVINCIA ,query = "SELECT s FROM Scuola s WHERE s.provincia = :provincia"),
    @NamedQuery(name=RICERCA_NUMERO,query="SELECT s.numeroS FROM Scuola s WHERE s.id = :id")

    
})

@Entity
@XmlRootElement
public class Scuola implements Serializable {
    public static final String CERCA_TUTTI = "Scuola.cercaTutti";
    public static final String RICERCA_ID = "Scuola.ricercaID";
    public static final String RICERCA_TIPOLOGIA = "Scuola.ricercaTipologia";
    public static final String RICERCA_PROVINCIA= "Scuola.ricercaProvincia";
    public static final String RICERCA_NUMERO= "Scuola.ricercanumero";
    
    @Id
    int id;
    String nome;
    String tipologia;
    String provincia;
    String responsabile;
    String argomento;
    int numeroS;
    boolean acquisto;
    
    public Scuola(){}

    public Scuola(int id, String nome, String tipologia, String provincia, String responsabile, String argomento, int numeroS, boolean acquisto) {
        this.id = id;
        this.nome = nome;
        this.tipologia = tipologia;
        this.provincia = provincia;
        this.responsabile = responsabile;
        this.argomento = argomento;
        this.numeroS = numeroS;
        this.acquisto = acquisto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public void setNumeroS(int numeroS) {
        this.numeroS = numeroS;
    }

    public void setAcquisto(boolean acquisto) {
        this.acquisto = acquisto;
    }

    
    public static String getCERCA_TUTTI() {
        return CERCA_TUTTI;
    }

    public static String getRICERCA_ID() {
        return RICERCA_ID;
    }

    public static String getRICERCA_TIPOLOGIA() {
        return RICERCA_TIPOLOGIA;
    }

    public static String getRICERCA_PROVINCIA() {
        return RICERCA_PROVINCIA;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipologia() {
        return tipologia;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public String getArgomento() {
        return argomento;
    }

    public int getNumeroS() {
        return numeroS;
    }

    public boolean isAcquisto() {
        return acquisto;
    }
    
    
    

    
    
}
