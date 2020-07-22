
package ws.recintos.privados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ideTipoPersona" type="{http://privados.recintos.ws}tipo_ide_tipo_persona"/&gt;
 *         &lt;element name="nombre" type="{http://privados.recintos.ws}tipo_nombre"/&gt;
 *         &lt;element name="domicilio" type="{http://privados.recintos.ws}tipo_domicilio_calle_nem"/&gt;
 *         &lt;element name="cp" type="{http://privados.recintos.ws}tipo_cp"/&gt;
 *         &lt;element name="municipio" type="{http://privados.recintos.ws}tipo_municipio_persona"/&gt;
 *         &lt;element name="entFed" type="{http://privados.recintos.ws}tipo_entidad_federativa"/&gt;
 *         &lt;element name="pais" type="{http://privados.recintos.ws}tipo_pais"/&gt;
 *         &lt;element name="rfc" type="{http://privados.recintos.ws}tipo_rfc"/&gt;
 *         &lt;element name="email" type="{http://privados.recintos.ws}tipo_email"/&gt;
 *         &lt;element name="ciudad" type="{http://privados.recintos.ws}tipo_ciudad_persona"/&gt;
 *         &lt;element name="contacto" type="{http://privados.recintos.ws}tipo_nombre_contacto"/&gt;
 *         &lt;element name="tprTelefono" type="{http://privados.recintos.ws}tipo_telefono_contacto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personas", namespace = "http://privados.recintos.ws", propOrder = {
    "ideTipoPersona",
    "nombre",
    "domicilio",
    "cp",
    "municipio",
    "entFed",
    "pais",
    "rfc",
    "email",
    "ciudad",
    "contacto",
    "tprTelefono"
})
public class Personas {

    @XmlElement(required = true)
    protected String ideTipoPersona;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String domicilio;
    @XmlElement(required = true)
    protected String cp;
    @XmlElement(required = true)
    protected String municipio;
    @XmlElement(required = true)
    protected String entFed;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String rfc;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String ciudad;
    @XmlElement(required = true)
    protected String contacto;
    @XmlElement(required = true)
    protected String tprTelefono;

    /**
     * Gets the value of the ideTipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeTipoPersona() {
        return ideTipoPersona;
    }

    /**
     * Sets the value of the ideTipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeTipoPersona(String value) {
        this.ideTipoPersona = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the domicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Sets the value of the domicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCp() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCp(String value) {
        this.cp = value;
    }

    /**
     * Gets the value of the municipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the entFed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntFed() {
        return entFed;
    }

    /**
     * Sets the value of the entFed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntFed(String value) {
        this.entFed = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the rfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Sets the value of the rfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the ciudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Sets the value of the ciudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Gets the value of the contacto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Sets the value of the contacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacto(String value) {
        this.contacto = value;
    }

    /**
     * Gets the value of the tprTelefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTprTelefono() {
        return tprTelefono;
    }

    /**
     * Sets the value of the tprTelefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTprTelefono(String value) {
        this.tprTelefono = value;
    }

}
