
package ejb_scuolawebsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per scuola complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="scuola"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acquisto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="argomento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroS" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responsabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scuola", propOrder = {
    "acquisto",
    "argomento",
    "id",
    "nome",
    "numeroS",
    "provincia",
    "responsabile",
    "tipologia"
})
public class Scuola {

    protected boolean acquisto;
    protected String argomento;
    protected int id;
    protected String nome;
    protected int numeroS;
    protected String provincia;
    protected String responsabile;
    protected String tipologia;

    /**
     * Recupera il valore della proprietà acquisto.
     * 
     */
    public boolean isAcquisto() {
        return acquisto;
    }

    /**
     * Imposta il valore della proprietà acquisto.
     * 
     */
    public void setAcquisto(boolean value) {
        this.acquisto = value;
    }

    /**
     * Recupera il valore della proprietà argomento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgomento() {
        return argomento;
    }

    /**
     * Imposta il valore della proprietà argomento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgomento(String value) {
        this.argomento = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà numeroS.
     * 
     */
    public int getNumeroS() {
        return numeroS;
    }

    /**
     * Imposta il valore della proprietà numeroS.
     * 
     */
    public void setNumeroS(int value) {
        this.numeroS = value;
    }

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà responsabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsabile() {
        return responsabile;
    }

    /**
     * Imposta il valore della proprietà responsabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsabile(String value) {
        this.responsabile = value;
    }

    /**
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Imposta il valore della proprietà tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologia(String value) {
        this.tipologia = value;
    }

}
