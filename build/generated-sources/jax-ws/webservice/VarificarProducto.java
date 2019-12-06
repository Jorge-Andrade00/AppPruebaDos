
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para varificarProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="varificarProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroSalida" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varificarProducto", propOrder = {
    "numeroSalida"
})
public class VarificarProducto {

    protected int numeroSalida;

    /**
     * Obtiene el valor de la propiedad numeroSalida.
     * 
     */
    public int getNumeroSalida() {
        return numeroSalida;
    }

    /**
     * Define el valor de la propiedad numeroSalida.
     * 
     */
    public void setNumeroSalida(int value) {
        this.numeroSalida = value;
    }

}
