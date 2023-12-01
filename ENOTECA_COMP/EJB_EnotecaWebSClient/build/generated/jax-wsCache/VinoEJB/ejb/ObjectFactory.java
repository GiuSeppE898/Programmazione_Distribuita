
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

    private final static QName _CreateVino_QNAME = new QName("http://ejb/", "createVino");
    private final static QName _CreateVinoResponse_QNAME = new QName("http://ejb/", "createVinoResponse");
    private final static QName _DeleteVino_QNAME = new QName("http://ejb/", "deleteVino");
    private final static QName _DeleteVinoResponse_QNAME = new QName("http://ejb/", "deleteVinoResponse");
    private final static QName _RicercaId_QNAME = new QName("http://ejb/", "ricercaId");
    private final static QName _RicercaIdResponse_QNAME = new QName("http://ejb/", "ricercaIdResponse");
    private final static QName _RicercaPrezzo_QNAME = new QName("http://ejb/", "ricercaPrezzo");
    private final static QName _RicercaPrezzoResponse_QNAME = new QName("http://ejb/", "ricercaPrezzoResponse");
    private final static QName _RicercaTipologia_QNAME = new QName("http://ejb/", "ricercaTipologia");
    private final static QName _RicercaTipologiaResponse_QNAME = new QName("http://ejb/", "ricercaTipologiaResponse");
    private final static QName _RicercaVitigno_QNAME = new QName("http://ejb/", "ricercaVitigno");
    private final static QName _RicercaVitignoResponse_QNAME = new QName("http://ejb/", "ricercaVitignoResponse");
    private final static QName _Tuttivini_QNAME = new QName("http://ejb/", "tuttivini");
    private final static QName _TuttiviniResponse_QNAME = new QName("http://ejb/", "tuttiviniResponse");
    private final static QName _UpdateVino_QNAME = new QName("http://ejb/", "updateVino");
    private final static QName _UpdateVinoResponse_QNAME = new QName("http://ejb/", "updateVinoResponse");
    private final static QName _Vino_QNAME = new QName("http://ejb/", "vino");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateVino }
     * 
     */
    public CreateVino createCreateVino() {
        return new CreateVino();
    }

    /**
     * Create an instance of {@link CreateVinoResponse }
     * 
     */
    public CreateVinoResponse createCreateVinoResponse() {
        return new CreateVinoResponse();
    }

    /**
     * Create an instance of {@link DeleteVino }
     * 
     */
    public DeleteVino createDeleteVino() {
        return new DeleteVino();
    }

    /**
     * Create an instance of {@link DeleteVinoResponse }
     * 
     */
    public DeleteVinoResponse createDeleteVinoResponse() {
        return new DeleteVinoResponse();
    }

    /**
     * Create an instance of {@link RicercaId }
     * 
     */
    public RicercaId createRicercaId() {
        return new RicercaId();
    }

    /**
     * Create an instance of {@link RicercaIdResponse }
     * 
     */
    public RicercaIdResponse createRicercaIdResponse() {
        return new RicercaIdResponse();
    }

    /**
     * Create an instance of {@link RicercaPrezzo }
     * 
     */
    public RicercaPrezzo createRicercaPrezzo() {
        return new RicercaPrezzo();
    }

    /**
     * Create an instance of {@link RicercaPrezzoResponse }
     * 
     */
    public RicercaPrezzoResponse createRicercaPrezzoResponse() {
        return new RicercaPrezzoResponse();
    }

    /**
     * Create an instance of {@link RicercaTipologia }
     * 
     */
    public RicercaTipologia createRicercaTipologia() {
        return new RicercaTipologia();
    }

    /**
     * Create an instance of {@link RicercaTipologiaResponse }
     * 
     */
    public RicercaTipologiaResponse createRicercaTipologiaResponse() {
        return new RicercaTipologiaResponse();
    }

    /**
     * Create an instance of {@link RicercaVitigno }
     * 
     */
    public RicercaVitigno createRicercaVitigno() {
        return new RicercaVitigno();
    }

    /**
     * Create an instance of {@link RicercaVitignoResponse }
     * 
     */
    public RicercaVitignoResponse createRicercaVitignoResponse() {
        return new RicercaVitignoResponse();
    }

    /**
     * Create an instance of {@link Tuttivini }
     * 
     */
    public Tuttivini createTuttivini() {
        return new Tuttivini();
    }

    /**
     * Create an instance of {@link TuttiviniResponse }
     * 
     */
    public TuttiviniResponse createTuttiviniResponse() {
        return new TuttiviniResponse();
    }

    /**
     * Create an instance of {@link UpdateVino }
     * 
     */
    public UpdateVino createUpdateVino() {
        return new UpdateVino();
    }

    /**
     * Create an instance of {@link UpdateVinoResponse }
     * 
     */
    public UpdateVinoResponse createUpdateVinoResponse() {
        return new UpdateVinoResponse();
    }

    /**
     * Create an instance of {@link Vino }
     * 
     */
    public Vino createVino() {
        return new Vino();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createVino")
    public JAXBElement<CreateVino> createCreateVino(CreateVino value) {
        return new JAXBElement<CreateVino>(_CreateVino_QNAME, CreateVino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createVinoResponse")
    public JAXBElement<CreateVinoResponse> createCreateVinoResponse(CreateVinoResponse value) {
        return new JAXBElement<CreateVinoResponse>(_CreateVinoResponse_QNAME, CreateVinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteVino")
    public JAXBElement<DeleteVino> createDeleteVino(DeleteVino value) {
        return new JAXBElement<DeleteVino>(_DeleteVino_QNAME, DeleteVino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteVinoResponse")
    public JAXBElement<DeleteVinoResponse> createDeleteVinoResponse(DeleteVinoResponse value) {
        return new JAXBElement<DeleteVinoResponse>(_DeleteVinoResponse_QNAME, DeleteVinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaId")
    public JAXBElement<RicercaId> createRicercaId(RicercaId value) {
        return new JAXBElement<RicercaId>(_RicercaId_QNAME, RicercaId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaIdResponse")
    public JAXBElement<RicercaIdResponse> createRicercaIdResponse(RicercaIdResponse value) {
        return new JAXBElement<RicercaIdResponse>(_RicercaIdResponse_QNAME, RicercaIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaPrezzo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaPrezzo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaPrezzo")
    public JAXBElement<RicercaPrezzo> createRicercaPrezzo(RicercaPrezzo value) {
        return new JAXBElement<RicercaPrezzo>(_RicercaPrezzo_QNAME, RicercaPrezzo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaPrezzoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaPrezzoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaPrezzoResponse")
    public JAXBElement<RicercaPrezzoResponse> createRicercaPrezzoResponse(RicercaPrezzoResponse value) {
        return new JAXBElement<RicercaPrezzoResponse>(_RicercaPrezzoResponse_QNAME, RicercaPrezzoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaTipologia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaTipologia }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaTipologia")
    public JAXBElement<RicercaTipologia> createRicercaTipologia(RicercaTipologia value) {
        return new JAXBElement<RicercaTipologia>(_RicercaTipologia_QNAME, RicercaTipologia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaTipologiaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaTipologiaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaTipologiaResponse")
    public JAXBElement<RicercaTipologiaResponse> createRicercaTipologiaResponse(RicercaTipologiaResponse value) {
        return new JAXBElement<RicercaTipologiaResponse>(_RicercaTipologiaResponse_QNAME, RicercaTipologiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaVitigno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaVitigno }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaVitigno")
    public JAXBElement<RicercaVitigno> createRicercaVitigno(RicercaVitigno value) {
        return new JAXBElement<RicercaVitigno>(_RicercaVitigno_QNAME, RicercaVitigno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaVitignoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaVitignoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaVitignoResponse")
    public JAXBElement<RicercaVitignoResponse> createRicercaVitignoResponse(RicercaVitignoResponse value) {
        return new JAXBElement<RicercaVitignoResponse>(_RicercaVitignoResponse_QNAME, RicercaVitignoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tuttivini }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tuttivini }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "tuttivini")
    public JAXBElement<Tuttivini> createTuttivini(Tuttivini value) {
        return new JAXBElement<Tuttivini>(_Tuttivini_QNAME, Tuttivini.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TuttiviniResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TuttiviniResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "tuttiviniResponse")
    public JAXBElement<TuttiviniResponse> createTuttiviniResponse(TuttiviniResponse value) {
        return new JAXBElement<TuttiviniResponse>(_TuttiviniResponse_QNAME, TuttiviniResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateVino")
    public JAXBElement<UpdateVino> createUpdateVino(UpdateVino value) {
        return new JAXBElement<UpdateVino>(_UpdateVino_QNAME, UpdateVino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateVinoResponse")
    public JAXBElement<UpdateVinoResponse> createUpdateVinoResponse(UpdateVinoResponse value) {
        return new JAXBElement<UpdateVinoResponse>(_UpdateVinoResponse_QNAME, UpdateVinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Vino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "vino")
    public JAXBElement<Vino> createVino(Vino value) {
        return new JAXBElement<Vino>(_Vino_QNAME, Vino.class, null, value);
    }

}
