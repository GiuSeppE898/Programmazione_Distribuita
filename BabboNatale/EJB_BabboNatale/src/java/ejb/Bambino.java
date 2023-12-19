/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;

import static ejb.Bambino.CERCA_ID;
import static ejb.Bambino.CERCA_NUCLEO;
import static ejb.Bambino.CERCA_TUTTI;
import static ejb.Bambino.LETTERA_NO;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author sorre
 */
@NamedQueries({
    @NamedQuery(name=CERCA_TUTTI,query = "SELECT b FROM Bambino b"),
    @NamedQuery(name=CERCA_ID,query = "SELECT b FROM Bambino b WHERE b.id=:id"),
    @NamedQuery(name=CERCA_NUCLEO,query = "SELECT b FROM Bambino b WHERE b.numerop>:num "),
    @NamedQuery(name=LETTERA_NO,query = "SELECT b FROM Bambino b WHERE b.statol =:stato")
    
})
@Entity
public class Bambino implements Serializable {
    public static final String CERCA_TUTTI = "Bambino.Cercatutti";
    public static final String CERCA_ID = "Bambino.Cercaid";
    public static final String CERCA_NUCLEO = "Bambino.Cercanucleo";
    public static final String LETTERA_NO = "Bambino.Cercalettera";

    private static final long serialVersionUID = 1L;
    @Id
    int id;
    String cognome;
    String città;
    String paese; 
    int età; 
    int numerop; 
    boolean statol;
    boolean priorità;

    public Bambino() {
    }

    public Bambino(int id, String cognome, String città, String paese, int età, int numerop, boolean Statol, boolean priorità) {
        this.id = id;
        this.cognome = cognome;
        this.città = città;
        this.paese = paese;
        this.età = età;
        this.numerop = numerop;
        this.statol = Statol;
        this.priorità = priorità;
    }

    public int getId() {
        return id;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCittà() {
        return città;
    }

    public String getPaese() {
        return paese;
    }

    public int getEtà() {
        return età;
    }

    public int getNumerop() {
        return numerop;
    }

    public boolean isStatol() {
        return statol;
    }

    public boolean isPriorità() {
        return priorità;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public void setNumerop(int numerop) {
        this.numerop = numerop;
    }

    public void setStatol(boolean Statol) {
        this.statol = Statol;
    }

    public void setPriorità(boolean priorità) {
        this.priorità = priorità;
    }
    
    public String toString() {
        return "Bambino{" +
                "id=" + id +
                ", cognome='" + cognome + '\'' +
                ", città='" + città + '\'' +
                ", paese='" + paese + '\'' +
                ", età=" + età +
                ", numerop=" + numerop +
                ", statol=" + statol +
                ", priorità=" + priorità +
                '}';
    }
    
    
}
