
package webServicw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BambinoEJBService", targetNamespace = "http://ejb/", wsdlLocation = "http://localhost:8080/BambinoEJBService/BambinoEJB?wsdl")
public class BambinoEJBService
    extends Service
{

    private final static URL BAMBINOEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException BAMBINOEJBSERVICE_EXCEPTION;
    private final static QName BAMBINOEJBSERVICE_QNAME = new QName("http://ejb/", "BambinoEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/BambinoEJBService/BambinoEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BAMBINOEJBSERVICE_WSDL_LOCATION = url;
        BAMBINOEJBSERVICE_EXCEPTION = e;
    }

    public BambinoEJBService() {
        super(__getWsdlLocation(), BAMBINOEJBSERVICE_QNAME);
    }

    public BambinoEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BAMBINOEJBSERVICE_QNAME, features);
    }

    public BambinoEJBService(URL wsdlLocation) {
        super(wsdlLocation, BAMBINOEJBSERVICE_QNAME);
    }

    public BambinoEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BAMBINOEJBSERVICE_QNAME, features);
    }

    public BambinoEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BambinoEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BambinoEJB
     */
    @WebEndpoint(name = "BambinoEJBPort")
    public BambinoEJB getBambinoEJBPort() {
        return super.getPort(new QName("http://ejb/", "BambinoEJBPort"), BambinoEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BambinoEJB
     */
    @WebEndpoint(name = "BambinoEJBPort")
    public BambinoEJB getBambinoEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb/", "BambinoEJBPort"), BambinoEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BAMBINOEJBSERVICE_EXCEPTION!= null) {
            throw BAMBINOEJBSERVICE_EXCEPTION;
        }
        return BAMBINOEJBSERVICE_WSDL_LOCATION;
    }

}
