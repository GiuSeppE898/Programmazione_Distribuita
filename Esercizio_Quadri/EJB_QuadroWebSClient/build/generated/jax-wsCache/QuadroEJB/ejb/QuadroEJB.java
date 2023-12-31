
package ejb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QuadroEJB", targetNamespace = "http://ejb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuadroEJB {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Quadro>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cercarestauro", targetNamespace = "http://ejb/", className = "ejb.Cercarestauro")
    @ResponseWrapper(localName = "cercarestauroResponse", targetNamespace = "http://ejb/", className = "ejb.CercarestauroResponse")
    @Action(input = "http://ejb/QuadroEJB/cercarestauroRequest", output = "http://ejb/QuadroEJB/cercarestauroResponse")
    public List<Quadro> cercarestauro(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
