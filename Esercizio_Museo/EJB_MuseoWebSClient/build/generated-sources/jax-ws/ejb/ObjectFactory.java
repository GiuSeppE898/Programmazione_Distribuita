
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

    private final static QName _Cercatutti_QNAME = new QName("http://ejb/", "cercatutti");
    private final static QName _CercatuttiResponse_QNAME = new QName("http://ejb/", "cercatuttiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cercatutti }
     * 
     */
    public Cercatutti createCercatutti() {
        return new Cercatutti();
    }

    /**
     * Create an instance of {@link CercatuttiResponse }
     * 
     */
    public CercatuttiResponse createCercatuttiResponse() {
        return new CercatuttiResponse();
    }

    /**
     * Create an instance of {@link Museo }
     * 
     */
    public Museo createMuseo() {
        return new Museo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercatutti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercatutti }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercatutti")
    public JAXBElement<Cercatutti> createCercatutti(Cercatutti value) {
        return new JAXBElement<Cercatutti>(_Cercatutti_QNAME, Cercatutti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercatuttiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercatuttiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercatuttiResponse")
    public JAXBElement<CercatuttiResponse> createCercatuttiResponse(CercatuttiResponse value) {
        return new JAXBElement<CercatuttiResponse>(_CercatuttiResponse_QNAME, CercatuttiResponse.class, null, value);
    }

}
