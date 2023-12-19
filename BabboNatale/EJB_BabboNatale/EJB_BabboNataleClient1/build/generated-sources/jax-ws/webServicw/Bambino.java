
package webServicw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per bambino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bambino"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="città" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="età" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numerop" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priorità" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="statol" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bambino", propOrder = {
    "citt\u00e0",
    "cognome",
    "et\u00e0",
    "id",
    "numerop",
    "paese",
    "priorit\u00e0",
    "statol"
})
public class Bambino {

    protected String città;
    protected String cognome;
    protected int età;
    protected int id;
    protected int numerop;
    protected String paese;
    protected boolean priorità;
    protected boolean statol;

    /**
     * Recupera il valore della proprietà città.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCittà() {
        return città;
    }

    /**
     * Imposta il valore della proprietà città.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCittà(String value) {
        this.città = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà età.
     * 
     */
    public int getEtà() {
        return età;
    }

    /**
     * Imposta il valore della proprietà età.
     * 
     */
    public void setEtà(int value) {
        this.età = value;
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
     * Recupera il valore della proprietà numerop.
     * 
     */
    public int getNumerop() {
        return numerop;
    }

    /**
     * Imposta il valore della proprietà numerop.
     * 
     */
    public void setNumerop(int value) {
        this.numerop = value;
    }

    /**
     * Recupera il valore della proprietà paese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaese() {
        return paese;
    }

    /**
     * Imposta il valore della proprietà paese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaese(String value) {
        this.paese = value;
    }

    /**
     * Recupera il valore della proprietà priorità.
     * 
     */
    public boolean isPriorità() {
        return priorità;
    }

    /**
     * Imposta il valore della proprietà priorità.
     * 
     */
    public void setPriorità(boolean value) {
        this.priorità = value;
    }

    /**
     * Recupera il valore della proprietà statol.
     * 
     */
    public boolean isStatol() {
        return statol;
    }

    /**
     * Imposta il valore della proprietà statol.
     * 
     */
    public void setStatol(boolean value) {
        this.statol = value;
    }

}
