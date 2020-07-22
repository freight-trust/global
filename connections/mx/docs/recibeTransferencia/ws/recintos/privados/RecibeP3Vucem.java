
package ws.recintos.privados;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informacionGeneral" type="{http://privados.recintos.ws}informacionGeneral"/&gt;
 *         &lt;element name="IdtipoMercancia" type="{http://privados.recintos.ws}tipo_id_tipo_mercancia"/&gt;
 *         &lt;element name="fechaInicioCarga" type="{http://privados.recintos.ws}tipo_fec_ini_carga"/&gt;
 *         &lt;element name="fechaFinCarga" type="{http://privados.recintos.ws}tipo_fec_fin_carga"/&gt;
 *         &lt;element name="peso" type="{http://privados.recintos.ws}tipo_peso"/&gt;
 *         &lt;element name="condicionCarga" type="{http://privados.recintos.ws}condiciones_carga"/&gt;
 *         &lt;element name="observaciones" type="{http://privados.recintos.ws}observaciones"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "informacionGeneral",
    "idtipoMercancia",
    "fechaInicioCarga",
    "fechaFinCarga",
    "peso",
    "condicionCarga",
    "observaciones"
})
@XmlRootElement(name = "recibeP3Vucem", namespace = "http://privados.recintos.ws")
public class RecibeP3Vucem {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(name = "IdtipoMercancia")
    @XmlSchemaType(name = "positiveInteger")
    protected int idtipoMercancia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicioCarga;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinCarga;
    @XmlElement(required = true)
    protected BigDecimal peso;
    @XmlElement(required = true)
    protected String condicionCarga;
    @XmlElement(required = true)
    protected String observaciones;

    /**
     * Gets the value of the informacionGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionGeneral }
     *     
     */
    public InformacionGeneral getInformacionGeneral() {
        return informacionGeneral;
    }

    /**
     * Sets the value of the informacionGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionGeneral }
     *     
     */
    public void setInformacionGeneral(InformacionGeneral value) {
        this.informacionGeneral = value;
    }

    /**
     * Gets the value of the idtipoMercancia property.
     * 
     */
    public int getIdtipoMercancia() {
        return idtipoMercancia;
    }

    /**
     * Sets the value of the idtipoMercancia property.
     * 
     */
    public void setIdtipoMercancia(int value) {
        this.idtipoMercancia = value;
    }

    /**
     * Gets the value of the fechaInicioCarga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioCarga() {
        return fechaInicioCarga;
    }

    /**
     * Sets the value of the fechaInicioCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioCarga(XMLGregorianCalendar value) {
        this.fechaInicioCarga = value;
    }

    /**
     * Gets the value of the fechaFinCarga property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinCarga() {
        return fechaFinCarga;
    }

    /**
     * Sets the value of the fechaFinCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinCarga(XMLGregorianCalendar value) {
        this.fechaFinCarga = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Gets the value of the condicionCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionCarga() {
        return condicionCarga;
    }

    /**
     * Sets the value of the condicionCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionCarga(String value) {
        this.condicionCarga = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

}
