
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _GuardarRegistro_QNAME = new QName("http://webService/", "guardarRegistro");
    private final static QName _VarificarProductoResponse_QNAME = new QName("http://webService/", "varificarProductoResponse");
    private final static QName _ActualizaSctock_QNAME = new QName("http://webService/", "actualizaSctock");
    private final static QName _ListaProductoResponse_QNAME = new QName("http://webService/", "listaProductoResponse");
    private final static QName _ListaProducto_QNAME = new QName("http://webService/", "listaProducto");
    private final static QName _VarificarProducto_QNAME = new QName("http://webService/", "varificarProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaProductoResponse }
     * 
     */
    public ListaProductoResponse createListaProductoResponse() {
        return new ListaProductoResponse();
    }

    /**
     * Create an instance of {@link ActualizaSctock }
     * 
     */
    public ActualizaSctock createActualizaSctock() {
        return new ActualizaSctock();
    }

    /**
     * Create an instance of {@link GuardarRegistro }
     * 
     */
    public GuardarRegistro createGuardarRegistro() {
        return new GuardarRegistro();
    }

    /**
     * Create an instance of {@link VarificarProductoResponse }
     * 
     */
    public VarificarProductoResponse createVarificarProductoResponse() {
        return new VarificarProductoResponse();
    }

    /**
     * Create an instance of {@link ListaProducto }
     * 
     */
    public ListaProducto createListaProducto() {
        return new ListaProducto();
    }

    /**
     * Create an instance of {@link VarificarProducto }
     * 
     */
    public VarificarProducto createVarificarProducto() {
        return new VarificarProducto();
    }

    /**
     * Create an instance of {@link SalidaProducto }
     * 
     */
    public SalidaProducto createSalidaProducto() {
        return new SalidaProducto();
    }

    /**
     * Create an instance of {@link Stock }
     * 
     */
    public Stock createStock() {
        return new Stock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "guardarRegistro")
    public JAXBElement<GuardarRegistro> createGuardarRegistro(GuardarRegistro value) {
        return new JAXBElement<GuardarRegistro>(_GuardarRegistro_QNAME, GuardarRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VarificarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "varificarProductoResponse")
    public JAXBElement<VarificarProductoResponse> createVarificarProductoResponse(VarificarProductoResponse value) {
        return new JAXBElement<VarificarProductoResponse>(_VarificarProductoResponse_QNAME, VarificarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizaSctock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "actualizaSctock")
    public JAXBElement<ActualizaSctock> createActualizaSctock(ActualizaSctock value) {
        return new JAXBElement<ActualizaSctock>(_ActualizaSctock_QNAME, ActualizaSctock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listaProductoResponse")
    public JAXBElement<ListaProductoResponse> createListaProductoResponse(ListaProductoResponse value) {
        return new JAXBElement<ListaProductoResponse>(_ListaProductoResponse_QNAME, ListaProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "listaProducto")
    public JAXBElement<ListaProducto> createListaProducto(ListaProducto value) {
        return new JAXBElement<ListaProducto>(_ListaProducto_QNAME, ListaProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VarificarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService/", name = "varificarProducto")
    public JAXBElement<VarificarProducto> createVarificarProducto(VarificarProducto value) {
        return new JAXBElement<VarificarProducto>(_VarificarProducto_QNAME, VarificarProducto.class, null, value);
    }

}
