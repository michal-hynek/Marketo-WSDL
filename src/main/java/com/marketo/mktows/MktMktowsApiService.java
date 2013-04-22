
package com.marketo.mktows;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MktMktowsApiService", targetNamespace = "http://www.marketo.com/mktows/", wsdlLocation = "http://app.marketo.com/soap/mktows/2_1?WSDL")
public class MktMktowsApiService
    extends Service
{

    private final static URL MKTMKTOWSAPISERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.marketo.mktows.MktMktowsApiService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.marketo.mktows.MktMktowsApiService.class.getResource(".");
            url = new URL(baseUrl, "http://app.marketo.com/soap/mktows/2_1?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://app.marketo.com/soap/mktows/2_1?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MKTMKTOWSAPISERVICE_WSDL_LOCATION = url;
    }

    public MktMktowsApiService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MktMktowsApiService() {
        super(MKTMKTOWSAPISERVICE_WSDL_LOCATION, new QName("http://www.marketo.com/mktows/", "MktMktowsApiService"));
    }

    /**
     * 
     * @return
     *     returns MktowsPort
     */
    @WebEndpoint(name = "MktowsApiSoapPort")
    public MktowsPort getMktowsApiSoapPort() {
        return super.getPort(new QName("http://www.marketo.com/mktows/", "MktowsApiSoapPort"), MktowsPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MktowsPort
     */
    @WebEndpoint(name = "MktowsApiSoapPort")
    public MktowsPort getMktowsApiSoapPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.marketo.com/mktows/", "MktowsApiSoapPort"), MktowsPort.class, features);
    }

}
