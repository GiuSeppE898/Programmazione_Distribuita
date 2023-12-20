/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import static ejb.Museo.CERCA_ID;
import static ejb.Museo.CERCA_REGIONE;
import static ejb.Museo.CERCA_TUTTI;
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
@NamedQueries({
    @NamedQuery (name= CERCA_TUTTI, query="SELECT m FROM Museo m"),
    @NamedQuery (name = CERCA_ID, query = "SELECT m FROM Museo m WHERE m.id=:id"),
    @NamedQuery (name = CERCA_REGIONE,query = "SELECT m FROM Museo m WHERE m.regione = :regione")

    
})
@XmlRootElement
public class Museo implements Serializable {
    public static final String CERCA_TUTTI = "Museo.cercatutti";
    public static final String CERCA_ID = "Museo.cercaid";
    public static final String CERCA_REGIONE = "Museo.cercaregione";
    @Id
    int id;
    String nome;
    String direttore;
    long nvisitatori;
    String citta;
    String provincia;
    String regione;

    public Museo(){}

    public Museo(int id, String nome, String direttore, long nvisitatori, String citta, String provincia, String regione) {
        this.id = id;
        this.nome = nome;
        this.direttore = direttore;
        this.nvisitatori = nvisitatori;
        this.citta = citta;
        this.provincia = provincia;
        this.regione = regione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDirettore() {
        return direttore;
    }

    public void setDirettore(String direttore) {
        this.direttore = direttore;
    }

    public long getNvisitatori() {
        return nvisitatori;
    }

    public void setNvisitatori(long nvisitatori) {
        this.nvisitatori = nvisitatori;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    @Override
    public String toString() {
        return "Museo{" + "id=" + id + ", nome=" + nome + ", direttore=" + direttore + ", nvisitatori=" + nvisitatori + ", citta=" + citta + ", provincia=" + provincia + ", regione=" + regione + '}';
    }

    
    
    
}
