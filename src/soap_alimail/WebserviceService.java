
package soap_alimail;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "webserviceService", targetNamespace = "http://soap_alimail/", wsdlLocation = "http://localhost:8081/webservice?wsdl")
public class WebserviceService
    extends Service
{

    private final static URL WEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICESERVICE_EXCEPTION;
    private final static QName WEBSERVICESERVICE_QNAME = new QName("http://soap_alimail/", "webserviceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/webservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICESERVICE_WSDL_LOCATION = url;
        WEBSERVICESERVICE_EXCEPTION = e;
    }

    public WebserviceService() {
        super(__getWsdlLocation(), WEBSERVICESERVICE_QNAME);
    }

    public WebserviceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICESERVICE_QNAME, features);
    }

    public WebserviceService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICESERVICE_QNAME);
    }

    public WebserviceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICESERVICE_QNAME, features);
    }

    public WebserviceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebserviceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Webservice
     */
    @WebEndpoint(name = "webservicePort")
    public Webservice getWebservicePort() {
        return super.getPort(new QName("http://soap_alimail/", "webservicePort"), Webservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Webservice
     */
    @WebEndpoint(name = "webservicePort")
    public Webservice getWebservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap_alimail/", "webservicePort"), Webservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICESERVICE_EXCEPTION!= null) {
            throw WEBSERVICESERVICE_EXCEPTION;
        }
        return WEBSERVICESERVICE_WSDL_LOCATION;
    }

}
