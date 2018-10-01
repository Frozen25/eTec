
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _CoincidenciasCodigo_QNAME = new QName("http://Services/", "coincidenciasCodigo");
    private final static QName _CoincidenciasCodigoResponse_QNAME = new QName("http://Services/", "coincidenciasCodigoResponse");
    private final static QName _CoincidenciasNombre_QNAME = new QName("http://Services/", "coincidenciasNombre");
    private final static QName _CoincidenciasNombreResponse_QNAME = new QName("http://Services/", "coincidenciasNombreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoincidenciasCodigo }
     * 
     */
    public CoincidenciasCodigo createCoincidenciasCodigo() {
        return new CoincidenciasCodigo();
    }

    /**
     * Create an instance of {@link CoincidenciasCodigoResponse }
     * 
     */
    public CoincidenciasCodigoResponse createCoincidenciasCodigoResponse() {
        return new CoincidenciasCodigoResponse();
    }

    /**
     * Create an instance of {@link CoincidenciasNombre }
     * 
     */
    public CoincidenciasNombre createCoincidenciasNombre() {
        return new CoincidenciasNombre();
    }

    /**
     * Create an instance of {@link CoincidenciasNombreResponse }
     * 
     */
    public CoincidenciasNombreResponse createCoincidenciasNombreResponse() {
        return new CoincidenciasNombreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoincidenciasCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "coincidenciasCodigo")
    public JAXBElement<CoincidenciasCodigo> createCoincidenciasCodigo(CoincidenciasCodigo value) {
        return new JAXBElement<CoincidenciasCodigo>(_CoincidenciasCodigo_QNAME, CoincidenciasCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoincidenciasCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "coincidenciasCodigoResponse")
    public JAXBElement<CoincidenciasCodigoResponse> createCoincidenciasCodigoResponse(CoincidenciasCodigoResponse value) {
        return new JAXBElement<CoincidenciasCodigoResponse>(_CoincidenciasCodigoResponse_QNAME, CoincidenciasCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoincidenciasNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "coincidenciasNombre")
    public JAXBElement<CoincidenciasNombre> createCoincidenciasNombre(CoincidenciasNombre value) {
        return new JAXBElement<CoincidenciasNombre>(_CoincidenciasNombre_QNAME, CoincidenciasNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoincidenciasNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "coincidenciasNombreResponse")
    public JAXBElement<CoincidenciasNombreResponse> createCoincidenciasNombreResponse(CoincidenciasNombreResponse value) {
        return new JAXBElement<CoincidenciasNombreResponse>(_CoincidenciasNombreResponse_QNAME, CoincidenciasNombreResponse.class, null, value);
    }

}
