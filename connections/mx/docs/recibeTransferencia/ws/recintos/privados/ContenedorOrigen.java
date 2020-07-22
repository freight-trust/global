
package ws.recintos.privados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contenedorOrigen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contenedorOrigen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inicialesContenedor" type="{http://privados.recintos.ws}tipo_iniciales_contenedor"/&gt;
 *         &lt;element name="numeroContenedor" type="{http://privados.recintos.ws}tipo_num_contenedor"/&gt;
 *         &lt;element name="tipoContenedor" type="{http://privados.recintos.ws}tipo_de_contenedor"/&gt;
 *         &lt;element name="estadoDelContenedor" type="{http://privados.recintos.ws}tipo_ide_contenedor_estado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contenedorOrigen", namespace = "http://privados.recintos.ws", propOrder = {
    "inicialesContenedor",
    "numeroContenedor",
    "tipoContenedor",
    "estadoDelContenedor"
})
public class ContenedorOrigen {

    @XmlElement(required = true)
    protected String inicialesContenedor;
    @XmlElement(required = true)
    protected String numeroContenedor;
    @XmlElement(required = true)
    protected String tipoContenedor;
    @XmlElement(required = true)
    protected String estadoDelContenedor;

    /**
     * Gets the value of the inicialesContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInicialesContenedor() {
        return inicialesContenedor;
    }

    /**
     * Sets the value of the inicialesContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInicialesContenedor(String value) {
        this.inicialesContenedor = value;
    }

    /**
     * Gets the value of the numeroContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroContenedor() {
        return numeroContenedor;
    }

    /**
     * Sets the value of the numeroContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroContenedor(String value) {
        this.numeroContenedor = value;
    }

    /**
     * Gets the value of the tipoContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContenedor() {
        return tipoContenedor;
    }

    /**
     * Sets the value of the tipoContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContenedor(String value) {
        this.tipoContenedor = value;
    }

    /**
     * Gets the value of the estadoDelContenedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDelContenedor() {
        return estadoDelContenedor;
    }

    /**
     * Sets the value of the estadoDelContenedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDelContenedor(String value) {
        this.estadoDelContenedor = value;
    }

}
