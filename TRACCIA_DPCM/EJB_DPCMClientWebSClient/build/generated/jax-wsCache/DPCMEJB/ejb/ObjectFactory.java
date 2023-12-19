
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

    private final static QName _Cercatipo_QNAME = new QName("http://ejb/", "cercatipo");
    private final static QName _CercatipoResponse_QNAME = new QName("http://ejb/", "cercatipoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cercatipo }
     * 
     */
    public Cercatipo createCercatipo() {
        return new Cercatipo();
    }

    /**
     * Create an instance of {@link CercatipoResponse }
     * 
     */
    public CercatipoResponse createCercatipoResponse() {
        return new CercatipoResponse();
    }

    /**
     * Create an instance of {@link Dpcm }
     * 
     */
    public Dpcm createDpcm() {
        return new Dpcm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercatipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercatipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercatipo")
    public JAXBElement<Cercatipo> createCercatipo(Cercatipo value) {
        return new JAXBElement<Cercatipo>(_Cercatipo_QNAME, Cercatipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercatipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercatipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercatipoResponse")
    public JAXBElement<CercatipoResponse> createCercatipoResponse(CercatipoResponse value) {
        return new JAXBElement<CercatipoResponse>(_CercatipoResponse_QNAME, CercatipoResponse.class, null, value);
    }

}
