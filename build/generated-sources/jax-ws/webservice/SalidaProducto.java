
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para salidaProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="salidaProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadSalida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nuemroSalida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salidaProducto", propOrder = {
    "cantidadSalida",
    "nuemroSalida",
    "sku"
})
public class SalidaProducto {

    protected int cantidadSalida;
    protected int nuemroSalida;
    protected String sku;

    /**
     * Obtiene el valor de la propiedad cantidadSalida.
     * 
     */
    public int getCantidadSalida() {
        return cantidadSalida;
    }

    /**
     * Define el valor de la propiedad cantidadSalida.
     * 
     */
    public void setCantidadSalida(int value) {
        this.cantidadSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad nuemroSalida.
     * 
     */
    public int getNuemroSalida() {
        return nuemroSalida;
    }

    /**
     * Define el valor de la propiedad nuemroSalida.
     * 
     */
    public void setNuemroSalida(int value) {
        this.nuemroSalida = value;
    }

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

}
