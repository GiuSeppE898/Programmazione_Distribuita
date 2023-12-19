/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejb;


import static ejb.DPCM.CERCA_EMERGENZA;
import static ejb.DPCM.CERCA_ID;
import static ejb.DPCM.CERCA_PRES;
import static ejb.DPCM.CERCA_TIPO;
import static ejb.DPCM.CERCA_TUTTI;
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
@Entity
@NamedQueries({
    @NamedQuery(name= CERCA_TUTTI, query ="SELECT d FROM DPCM d"),
    @NamedQuery(name = CERCA_ID, query = "SELECT d FROM DPCM d WHERE d.id=:id "),
    @NamedQuery ( name = CERCA_EMERGENZA, query="SELECT d FROM DPCM d WHERE d.emergenza=:emergenza"),
    @NamedQuery(name = CERCA_TIPO, query="SELECT d FROM DPCM d WHERe d.tipo=:tipo"),
    @NamedQuery(name = CERCA_PRES, query = "SELECT d FROM DPCM d WHERE d.numPres>:numPres ")
    
})
public class DPCM implements Serializable {
    public static final String CERCA_TUTTI = "DPCM.cercatutti";
    public static final String CERCA_ID = "DPCM.cercaid";
    public static final String CERCA_EMERGENZA = "DPCM.cercaemergenza";
    public static final String CERCA_TIPO = "DPCM.cercatipo";
    public static final String CERCA_PRES = "DPCM.cercapres";
    @Id
    int id;
    String nome;
    String emergenza;
    String tipo;
    String livello;
    int numPres;
    
    public DPCM(){}

    public DPCM(int id, String nome, String emergenza, String tipo, String livello, int numPres) {
        this.id = id;
        this.nome = nome;
        this.emergenza = emergenza;
        this.tipo = tipo;
        this.livello = livello;
        this.numPres = numPres;
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

    public String getEmergenza() {
        return emergenza;
    }

    public void setEmergenza(String emergenza) {
        this.emergenza = emergenza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    public int getNumPres() {
        return numPres;
    }

    public void setNumPres(int numPres) {
        this.numPres = numPres;
    }

    @Override
    public String toString() {
        return "DPCM{" + "id=" + id + ", nome=" + nome + ", emergenza=" + emergenza + ", tipo=" + tipo + ", livello=" + livello + ", numPres=" + numPres + '}';
    }
    
    
    
}
