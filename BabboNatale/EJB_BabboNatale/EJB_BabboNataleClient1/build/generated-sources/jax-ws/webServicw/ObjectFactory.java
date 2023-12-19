
package webServicw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webServicw package. 
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

    private final static QName _Cercaid_QNAME = new QName("http://ejb/", "Cercaid");
    private final static QName _CercaidResponse_QNAME = new QName("http://ejb/", "CercaidResponse");
    private final static QName _Cercalettera_QNAME = new QName("http://ejb/", "Cercalettera");
    private final static QName _CercaletteraResponse_QNAME = new QName("http://ejb/", "CercaletteraResponse");
    private final static QName _Cercanucleo_QNAME = new QName("http://ejb/", "Cercanucleo");
    private final static QName _CercanucleoResponse_QNAME = new QName("http://ejb/", "CercanucleoResponse");
    private final static QName _Cercatutti_QNAME = new QName("http://ejb/", "Cercatutti");
    private final static QName _CercatuttiResponse_QNAME = new QName("http://ejb/", "CercatuttiResponse");
    private final static QName _CreateBambino_QNAME = new QName("http://ejb/", "createBambino");
    private final static QName _CreateBambinoResponse_QNAME = new QName("http://ejb/", "createBambinoResponse");
    private final static QName _DeleteBambino_QNAME = new QName("http://ejb/", "deleteBambino");
    private final static QName _DeleteBambinoResponse_QNAME = new QName("http://ejb/", "deleteBambinoResponse");
    private final static QName _UpdateBambino_QNAME = new QName("http://ejb/", "updateBambino");
    private final static QName _UpdateBambinoResponse_QNAME = new QName("http://ejb/", "updateBambinoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webServicw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cercaid }
     * 
     */
    public Cercaid createCercaid() {
        return new Cercaid();
    }

    /**
     * Create an instance of {@link CercaidResponse }
     * 
     */
    public CercaidResponse createCercaidResponse() {
        return new CercaidResponse();
    }

    /**
     * Create an instance of {@link Cercalettera }
     * 
     */
    public Cercalettera createCercalettera() {
        return new Cercalettera();
    }

    /**
     * Create an instance of {@link CercaletteraResponse }
     * 
     */
    public CercaletteraResponse createCercaletteraResponse() {
        return new CercaletteraResponse();
    }

    /**
     * Create an instance of {@link Cercanucleo }
     * 
     */
    public Cercanucleo createCercanucleo() {
        return new Cercanucleo();
    }

    /**
     * Create an instance of {@link CercanucleoResponse }
     * 
     */
    public CercanucleoResponse createCercanucleoResponse() {
        return new CercanucleoResponse();
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
     * Create an instance of {@link CreateBambino }
     * 
     */
    public CreateBambino createCreateBambino() {
        return new CreateBambino();
    }

    /**
     * Create an instance of {@link CreateBambinoResponse }
     * 
     */
    public CreateBambinoResponse createCreateBambinoResponse() {
        return new CreateBambinoResponse();
    }

    /**
     * Create an instance of {@link DeleteBambino }
     * 
     */
    public DeleteBambino createDeleteBambino() {
        return new DeleteBambino();
    }

    /**
     * Create an instance of {@link DeleteBambinoResponse }
     * 
     */
    public DeleteBambinoResponse createDeleteBambinoResponse() {
        return new DeleteBambinoResponse();
    }

    /**
     * Create an instance of {@link UpdateBambino }
     * 
     */
    public UpdateBambino createUpdateBambino() {
        return new UpdateBambino();
    }

    /**
     * Create an instance of {@link UpdateBambinoResponse }
     * 
     */
    public UpdateBambinoResponse createUpdateBambinoResponse() {
        return new UpdateBambinoResponse();
    }

    /**
     * Create an instance of {@link Bambino }
     * 
     */
    public Bambino createBambino() {
        return new Bambino();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercaid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercaid }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "Cercaid")
    public JAXBElement<Cercaid> createCercaid(Cercaid value) {
        return new JAXBElement<Cercaid>(_Cercaid_QNAME, Cercaid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercaidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercaidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "CercaidResponse")
    public JAXBElement<CercaidResponse> createCercaidResponse(CercaidResponse value) {
        return new JAXBElement<CercaidResponse>(_CercaidResponse_QNAME, CercaidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercalettera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercalettera }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "Cercalettera")
    public JAXBElement<Cercalettera> createCercalettera(Cercalettera value) {
        return new JAXBElement<Cercalettera>(_Cercalettera_QNAME, Cercalettera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercaletteraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercaletteraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "CercaletteraResponse")
    public JAXBElement<CercaletteraResponse> createCercaletteraResponse(CercaletteraResponse value) {
        return new JAXBElement<CercaletteraResponse>(_CercaletteraResponse_QNAME, CercaletteraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercanucleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercanucleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "Cercanucleo")
    public JAXBElement<Cercanucleo> createCercanucleo(Cercanucleo value) {
        return new JAXBElement<Cercanucleo>(_Cercanucleo_QNAME, Cercanucleo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercanucleoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercanucleoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "CercanucleoResponse")
    public JAXBElement<CercanucleoResponse> createCercanucleoResponse(CercanucleoResponse value) {
        return new JAXBElement<CercanucleoResponse>(_CercanucleoResponse_QNAME, CercanucleoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cercatutti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cercatutti }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "Cercatutti")
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
    @XmlElementDecl(namespace = "http://ejb/", name = "CercatuttiResponse")
    public JAXBElement<CercatuttiResponse> createCercatuttiResponse(CercatuttiResponse value) {
        return new JAXBElement<CercatuttiResponse>(_CercatuttiResponse_QNAME, CercatuttiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createBambino")
    public JAXBElement<CreateBambino> createCreateBambino(CreateBambino value) {
        return new JAXBElement<CreateBambino>(_CreateBambino_QNAME, CreateBambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBambinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBambinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createBambinoResponse")
    public JAXBElement<CreateBambinoResponse> createCreateBambinoResponse(CreateBambinoResponse value) {
        return new JAXBElement<CreateBambinoResponse>(_CreateBambinoResponse_QNAME, CreateBambinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteBambino")
    public JAXBElement<DeleteBambino> createDeleteBambino(DeleteBambino value) {
        return new JAXBElement<DeleteBambino>(_DeleteBambino_QNAME, DeleteBambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBambinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBambinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteBambinoResponse")
    public JAXBElement<DeleteBambinoResponse> createDeleteBambinoResponse(DeleteBambinoResponse value) {
        return new JAXBElement<DeleteBambinoResponse>(_DeleteBambinoResponse_QNAME, DeleteBambinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateBambino")
    public JAXBElement<UpdateBambino> createUpdateBambino(UpdateBambino value) {
        return new JAXBElement<UpdateBambino>(_UpdateBambino_QNAME, UpdateBambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBambinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBambinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateBambinoResponse")
    public JAXBElement<UpdateBambinoResponse> createUpdateBambinoResponse(UpdateBambinoResponse value) {
        return new JAXBElement<UpdateBambinoResponse>(_UpdateBambinoResponse_QNAME, UpdateBambinoResponse.class, null, value);
    }

}
