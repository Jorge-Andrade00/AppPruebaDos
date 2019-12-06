
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarRegistro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarRegistro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sp" type="{http://webService/}salidaProducto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarRegistro", propOrder = {
    "sp"
})
public class GuardarRegistro {

    protected SalidaProducto sp;

    /**
     * Obtiene el valor de la propiedad sp.
     * 
     * @return
     *     possible object is
     *     {@link SalidaProducto }
     *     
     */
    public SalidaProducto getSp() {
        return sp;
    }

    /**
     * Define el valor de la propiedad sp.
     * 
     * @param value
     *     allowed object is
     *     {@link SalidaProducto }
     *     
     */
    public void setSp(SalidaProducto value) {
        this.sp = value;
    }

}
