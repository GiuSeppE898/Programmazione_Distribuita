
package ejb;

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
@WebServiceClient(name = "VinoEJBService", targetNamespace = "http://ejb/", wsdlLocation = "http://localhost:8080/VinoEJBService/VinoEJB?wsdl")
public class VinoEJBService
    extends Service
{

    private final static URL VINOEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException VINOEJBSERVICE_EXCEPTION;
    private final static QName VINOEJBSERVICE_QNAME = new QName("http://ejb/", "VinoEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/VinoEJBService/VinoEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VINOEJBSERVICE_WSDL_LOCATION = url;
        VINOEJBSERVICE_EXCEPTION = e;
    }

    public VinoEJBService() {
        super(__getWsdlLocation(), VINOEJBSERVICE_QNAME);
    }

    public VinoEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VINOEJBSERVICE_QNAME, features);
    }

    public VinoEJBService(URL wsdlLocation) {
        super(wsdlLocation, VINOEJBSERVICE_QNAME);
    }

    public VinoEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VINOEJBSERVICE_QNAME, features);
    }

    public VinoEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VinoEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VinoEJB
     */
    @WebEndpoint(name = "VinoEJBPort")
    public VinoEJB getVinoEJBPort() {
        return super.getPort(new QName("http://ejb/", "VinoEJBPort"), VinoEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VinoEJB
     */
    @WebEndpoint(name = "VinoEJBPort")
    public VinoEJB getVinoEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb/", "VinoEJBPort"), VinoEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VINOEJBSERVICE_EXCEPTION!= null) {
            throw VINOEJBSERVICE_EXCEPTION;
        }
        return VINOEJBSERVICE_WSDL_LOCATION;
    }

}
