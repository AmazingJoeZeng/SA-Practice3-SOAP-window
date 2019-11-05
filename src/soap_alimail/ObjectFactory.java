
package soap_alimail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap_alimail package. 
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

    private final static QName _BatchSendMail_QNAME = new QName("http://soap_alimail/", "BatchSendMail");
    private final static QName _BatchSendMailResponse_QNAME = new QName("http://soap_alimail/", "BatchSendMailResponse");
    private final static QName _SendMailResponse_QNAME = new QName("http://soap_alimail/", "send_mailResponse");
    private final static QName _CheckResponse_QNAME = new QName("http://soap_alimail/", "checkResponse");
    private final static QName _SendMail_QNAME = new QName("http://soap_alimail/", "send_mail");
    private final static QName _Check_QNAME = new QName("http://soap_alimail/", "check");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap_alimail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMailResponse }
     * 
     */
    public SendMailResponse createSendMailResponse() {
        return new SendMailResponse();
    }

    /**
     * Create an instance of {@link BatchSendMail }
     * 
     */
    public BatchSendMail createBatchSendMail() {
        return new BatchSendMail();
    }

    /**
     * Create an instance of {@link BatchSendMailResponse }
     * 
     */
    public BatchSendMailResponse createBatchSendMailResponse() {
        return new BatchSendMailResponse();
    }

    /**
     * Create an instance of {@link CheckResponse }
     * 
     */
    public CheckResponse createCheckResponse() {
        return new CheckResponse();
    }

    /**
     * Create an instance of {@link SendMail }
     * 
     */
    public SendMail createSendMail() {
        return new SendMail();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchSendMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap_alimail/", name = "BatchSendMail")
    public JAXBElement<BatchSendMail> createBatchSendMail(BatchSendMail value) {
        return new JAXBElement<BatchSendMail>(_BatchSendMail_QNAME, BatchSendMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchSendMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap_alimail/", name = "BatchSendMailResponse")
    public JAXBElement<BatchSendMailResponse> createBatchSendMailResponse(BatchSendMailResponse value) {
        return new JAXBElement<BatchSendMailResponse>(_BatchSendMailResponse_QNAME, BatchSendMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap_alimail/", name = "send_mailResponse")
    public JAXBElement<SendMailResponse> createSendMailResponse(SendMailResponse value) {
        return new JAXBElement<SendMailResponse>(_SendMailResponse_QNAME, SendMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap_alimail/", name = "checkResponse")
    public JAXBElement<CheckResponse> createCheckResponse(CheckResponse value) {
        return new JAXBElement<CheckResponse>(_CheckResponse_QNAME, CheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap_alimail/", name = "send_mail")
    public JAXBElement<SendMail> createSendMail(SendMail value) {
        return new JAXBElement<SendMail>(_SendMail_QNAME, SendMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Check }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap_alimail/", name = "check")
    public JAXBElement<Check> createCheck(Check value) {
        return new JAXBElement<Check>(_Check_QNAME, Check.class, null, value);
    }

}
