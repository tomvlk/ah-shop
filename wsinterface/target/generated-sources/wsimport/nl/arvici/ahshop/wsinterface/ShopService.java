
package nl.arvici.ahshop.wsinterface;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "shopService", targetNamespace = "http://schemas.arvici.nl/messages/message", wsdlLocation = "file:/C:/Users/tom/IdeaProjects/ahshop/wsinterface/src/main/webapp/wsdl/webservice.wsdl")
public class ShopService
    extends Service
{

    private final static URL SHOPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHOPSERVICE_EXCEPTION;
    private final static QName SHOPSERVICE_QNAME = new QName("http://schemas.arvici.nl/messages/message", "shopService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/tom/IdeaProjects/ahshop/wsinterface/src/main/webapp/wsdl/webservice.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHOPSERVICE_WSDL_LOCATION = url;
        SHOPSERVICE_EXCEPTION = e;
    }

    public ShopService() {
        super(__getWsdlLocation(), SHOPSERVICE_QNAME);
    }

    public ShopService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHOPSERVICE_QNAME, features);
    }

    public ShopService(URL wsdlLocation) {
        super(wsdlLocation, SHOPSERVICE_QNAME);
    }

    public ShopService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHOPSERVICE_QNAME, features);
    }

    public ShopService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShopService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WsInterface getWSPort() {
        return super.getPort(new QName("http://schemas.arvici.nl/messages/message", "WS-Port"), WsInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsInterface
     */
    @WebEndpoint(name = "WS-Port")
    public WsInterface getWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.arvici.nl/messages/message", "WS-Port"), WsInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHOPSERVICE_EXCEPTION!= null) {
            throw SHOPSERVICE_EXCEPTION;
        }
        return SHOPSERVICE_WSDL_LOCATION;
    }

}
