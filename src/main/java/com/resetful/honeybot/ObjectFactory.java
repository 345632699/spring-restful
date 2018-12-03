
package com.resetful.honeybot;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.resetful.honeybot package. 
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

    private final static QName _TokenCheckerResponse_QNAME = new QName("http://SingleLoginAtIM/", "tokenCheckerResponse");
    private final static QName _UserChecker_QNAME = new QName("http://SingleLoginAtIM/", "userChecker");
    private final static QName _UserCheckerResponse_QNAME = new QName("http://SingleLoginAtIM/", "userCheckerResponse");
    private final static QName _TokenChecker_QNAME = new QName("http://SingleLoginAtIM/", "tokenChecker");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.resetful.honeybot
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TokenCheckerResponse }
     * 
     */
    public TokenCheckerResponse createTokenCheckerResponse() {
        return new TokenCheckerResponse();
    }

    /**
     * Create an instance of {@link UserChecker }
     * 
     */
    public UserChecker createUserChecker() {
        return new UserChecker();
    }

    /**
     * Create an instance of {@link UserCheckerResponse }
     * 
     */
    public UserCheckerResponse createUserCheckerResponse() {
        return new UserCheckerResponse();
    }

    /**
     * Create an instance of {@link TokenChecker }
     * 
     */
    public TokenChecker createTokenChecker() {
        return new TokenChecker();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenCheckerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SingleLoginAtIM/", name = "tokenCheckerResponse")
    public JAXBElement<TokenCheckerResponse> createTokenCheckerResponse(TokenCheckerResponse value) {
        return new JAXBElement<TokenCheckerResponse>(_TokenCheckerResponse_QNAME, TokenCheckerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserChecker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SingleLoginAtIM/", name = "userChecker")
    public JAXBElement<UserChecker> createUserChecker(UserChecker value) {
        return new JAXBElement<UserChecker>(_UserChecker_QNAME, UserChecker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCheckerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SingleLoginAtIM/", name = "userCheckerResponse")
    public JAXBElement<UserCheckerResponse> createUserCheckerResponse(UserCheckerResponse value) {
        return new JAXBElement<UserCheckerResponse>(_UserCheckerResponse_QNAME, UserCheckerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenChecker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SingleLoginAtIM/", name = "tokenChecker")
    public JAXBElement<TokenChecker> createTokenChecker(TokenChecker value) {
        return new JAXBElement<TokenChecker>(_TokenChecker_QNAME, TokenChecker.class, null, value);
    }

}
