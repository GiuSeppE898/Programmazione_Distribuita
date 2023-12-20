
package ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Cercarestauro_QNAME = new QName("http://ejb/", "cercarestauro");
    private final static QName _CercarestauroResponse_QNAME = new QName("http://ejb/", "cercarestauroResponse");
    private final static QName _Quadro_QNAME = new QName("http://ejb/", "quadro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cercarestauro }
     * 
     */
    public Cercarestauro createCercarestauro() {
        return new Cercarestauro();
    }

    /**
     * Create an instance of {@link CercarestauroResponse }
     * 
     */
    public CercarestauroResponse createCercarestauroResponse() {
        return new CercarestauroResponse();
    }

    /**
     * Create an instance of {@link Quadro }
     * 
     */
    public Quadro createQuadro() {
        return new Quadro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercarestauro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercarestauro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercarestauro")
    public JAXBElement<Cercarestauro> createCercarestauro(Cercarestauro value) {
        return new JAXBElement<Cercarestauro>(_Cercarestauro_QNAME, Cercarestauro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercarestauroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercarestauroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercarestauroResponse")
    public JAXBElement<CercarestauroResponse> createCercarestauroResponse(CercarestauroResponse value) {
        return new JAXBElement<CercarestauroResponse>(_CercarestauroResponse_QNAME, CercarestauroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quadro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Quadro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "quadro")
    public JAXBElement<Quadro> createQuadro(Quadro value) {
        return new JAXBElement<Quadro>(_Quadro_QNAME, Quadro.class, null, value);
    }

}
