
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
@WebServiceClient(name = "DPCMEJBService", targetNamespace = "http://ejb/", wsdlLocation = "http://localhost:8080/DPCMEJBService/DPCMEJB?wsdl")
public class DPCMEJBService
    extends Service
{

    private final static URL DPCMEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DPCMEJBSERVICE_EXCEPTION;
    private final static QName DPCMEJBSERVICE_QNAME = new QName("http://ejb/", "DPCMEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DPCMEJBService/DPCMEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DPCMEJBSERVICE_WSDL_LOCATION = url;
        DPCMEJBSERVICE_EXCEPTION = e;
    }

    public DPCMEJBService() {
        super(__getWsdlLocation(), DPCMEJBSERVICE_QNAME);
    }

    public DPCMEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DPCMEJBSERVICE_QNAME, features);
    }

    public DPCMEJBService(URL wsdlLocation) {
        super(wsdlLocation, DPCMEJBSERVICE_QNAME);
    }

    public DPCMEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DPCMEJBSERVICE_QNAME, features);
    }

    public DPCMEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DPCMEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DPCMEJB
     */
    @WebEndpoint(name = "DPCMEJBPort")
    public DPCMEJB getDPCMEJBPort() {
        return super.getPort(new QName("http://ejb/", "DPCMEJBPort"), DPCMEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DPCMEJB
     */
    @WebEndpoint(name = "DPCMEJBPort")
    public DPCMEJB getDPCMEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejb/", "DPCMEJBPort"), DPCMEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DPCMEJBSERVICE_EXCEPTION!= null) {
            throw DPCMEJBSERVICE_EXCEPTION;
        }
        return DPCMEJBSERVICE_WSDL_LOCATION;
    }

}
