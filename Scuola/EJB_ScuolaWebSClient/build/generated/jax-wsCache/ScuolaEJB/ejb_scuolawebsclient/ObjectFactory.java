
package ejb_scuolawebsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejb_scuolawebsclient package. 
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

    private final static QName _CercaTutti_QNAME = new QName("http://ejb/", "cercaTutti");
    private final static QName _CercaTuttiResponse_QNAME = new QName("http://ejb/", "cercaTuttiResponse");
    private final static QName _CreateScuola_QNAME = new QName("http://ejb/", "createScuola");
    private final static QName _CreateScuolaResponse_QNAME = new QName("http://ejb/", "createScuolaResponse");
    private final static QName _DeleteScuola_QNAME = new QName("http://ejb/", "deleteScuola");
    private final static QName _DeleteScuolaResponse_QNAME = new QName("http://ejb/", "deleteScuolaResponse");
    private final static QName _RicercaId_QNAME = new QName("http://ejb/", "ricercaId");
    private final static QName _RicercaIdResponse_QNAME = new QName("http://ejb/", "ricercaIdResponse");
    private final static QName _RicercaNumero_QNAME = new QName("http://ejb/", "ricercaNumero");
    private final static QName _RicercaNumeroResponse_QNAME = new QName("http://ejb/", "ricercaNumeroResponse");
    private final static QName _RicercaProvincia_QNAME = new QName("http://ejb/", "ricercaProvincia");
    private final static QName _RicercaProvinciaResponse_QNAME = new QName("http://ejb/", "ricercaProvinciaResponse");
    private final static QName _RicercaTipologia_QNAME = new QName("http://ejb/", "ricercaTipologia");
    private final static QName _RicercaTipologiaResponse_QNAME = new QName("http://ejb/", "ricercaTipologiaResponse");
    private final static QName _Scuola_QNAME = new QName("http://ejb/", "scuola");
    private final static QName _UpdateScuola_QNAME = new QName("http://ejb/", "updateScuola");
    private final static QName _UpdateScuolaResponse_QNAME = new QName("http://ejb/", "updateScuolaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb_scuolawebsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CercaTutti }
     * 
     */
    public CercaTutti createCercaTutti() {
        return new CercaTutti();
    }

    /**
     * Create an instance of {@link CercaTuttiResponse }
     * 
     */
    public CercaTuttiResponse createCercaTuttiResponse() {
        return new CercaTuttiResponse();
    }

    /**
     * Create an instance of {@link CreateScuola }
     * 
     */
    public CreateScuola createCreateScuola() {
        return new CreateScuola();
    }

    /**
     * Create an instance of {@link CreateScuolaResponse }
     * 
     */
    public CreateScuolaResponse createCreateScuolaResponse() {
        return new CreateScuolaResponse();
    }

    /**
     * Create an instance of {@link DeleteScuola }
     * 
     */
    public DeleteScuola createDeleteScuola() {
        return new DeleteScuola();
    }

    /**
     * Create an instance of {@link DeleteScuolaResponse }
     * 
     */
    public DeleteScuolaResponse createDeleteScuolaResponse() {
        return new DeleteScuolaResponse();
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
     * Create an instance of {@link RicercaNumero }
     * 
     */
    public RicercaNumero createRicercaNumero() {
        return new RicercaNumero();
    }

    /**
     * Create an instance of {@link RicercaNumeroResponse }
     * 
     */
    public RicercaNumeroResponse createRicercaNumeroResponse() {
        return new RicercaNumeroResponse();
    }

    /**
     * Create an instance of {@link RicercaProvincia }
     * 
     */
    public RicercaProvincia createRicercaProvincia() {
        return new RicercaProvincia();
    }

    /**
     * Create an instance of {@link RicercaProvinciaResponse }
     * 
     */
    public RicercaProvinciaResponse createRicercaProvinciaResponse() {
        return new RicercaProvinciaResponse();
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
     * Create an instance of {@link Scuola }
     * 
     */
    public Scuola createScuola() {
        return new Scuola();
    }

    /**
     * Create an instance of {@link UpdateScuola }
     * 
     */
    public UpdateScuola createUpdateScuola() {
        return new UpdateScuola();
    }

    /**
     * Create an instance of {@link UpdateScuolaResponse }
     * 
     */
    public UpdateScuolaResponse createUpdateScuolaResponse() {
        return new UpdateScuolaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercaTutti }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercaTutti }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercaTutti")
    public JAXBElement<CercaTutti> createCercaTutti(CercaTutti value) {
        return new JAXBElement<CercaTutti>(_CercaTutti_QNAME, CercaTutti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CercaTuttiResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CercaTuttiResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "cercaTuttiResponse")
    public JAXBElement<CercaTuttiResponse> createCercaTuttiResponse(CercaTuttiResponse value) {
        return new JAXBElement<CercaTuttiResponse>(_CercaTuttiResponse_QNAME, CercaTuttiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateScuola }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateScuola }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createScuola")
    public JAXBElement<CreateScuola> createCreateScuola(CreateScuola value) {
        return new JAXBElement<CreateScuola>(_CreateScuola_QNAME, CreateScuola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateScuolaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateScuolaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createScuolaResponse")
    public JAXBElement<CreateScuolaResponse> createCreateScuolaResponse(CreateScuolaResponse value) {
        return new JAXBElement<CreateScuolaResponse>(_CreateScuolaResponse_QNAME, CreateScuolaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScuola }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteScuola }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteScuola")
    public JAXBElement<DeleteScuola> createDeleteScuola(DeleteScuola value) {
        return new JAXBElement<DeleteScuola>(_DeleteScuola_QNAME, DeleteScuola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScuolaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteScuolaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteScuolaResponse")
    public JAXBElement<DeleteScuolaResponse> createDeleteScuolaResponse(DeleteScuolaResponse value) {
        return new JAXBElement<DeleteScuolaResponse>(_DeleteScuolaResponse_QNAME, DeleteScuolaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaNumero }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaNumero }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaNumero")
    public JAXBElement<RicercaNumero> createRicercaNumero(RicercaNumero value) {
        return new JAXBElement<RicercaNumero>(_RicercaNumero_QNAME, RicercaNumero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaNumeroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaNumeroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaNumeroResponse")
    public JAXBElement<RicercaNumeroResponse> createRicercaNumeroResponse(RicercaNumeroResponse value) {
        return new JAXBElement<RicercaNumeroResponse>(_RicercaNumeroResponse_QNAME, RicercaNumeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaProvincia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaProvincia }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaProvincia")
    public JAXBElement<RicercaProvincia> createRicercaProvincia(RicercaProvincia value) {
        return new JAXBElement<RicercaProvincia>(_RicercaProvincia_QNAME, RicercaProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RicercaProvinciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RicercaProvinciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "ricercaProvinciaResponse")
    public JAXBElement<RicercaProvinciaResponse> createRicercaProvinciaResponse(RicercaProvinciaResponse value) {
        return new JAXBElement<RicercaProvinciaResponse>(_RicercaProvinciaResponse_QNAME, RicercaProvinciaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Scuola }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Scuola }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "scuola")
    public JAXBElement<Scuola> createScuola(Scuola value) {
        return new JAXBElement<Scuola>(_Scuola_QNAME, Scuola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScuola }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateScuola }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateScuola")
    public JAXBElement<UpdateScuola> createUpdateScuola(UpdateScuola value) {
        return new JAXBElement<UpdateScuola>(_UpdateScuola_QNAME, UpdateScuola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScuolaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateScuolaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateScuolaResponse")
    public JAXBElement<UpdateScuolaResponse> createUpdateScuolaResponse(UpdateScuolaResponse value) {
        return new JAXBElement<UpdateScuolaResponse>(_UpdateScuolaResponse_QNAME, UpdateScuolaResponse.class, null, value);
    }

}
