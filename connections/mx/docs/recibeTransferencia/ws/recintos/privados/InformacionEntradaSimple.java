
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for informacionEntradaSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informacionEntradaSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoDeMercancia" type="{http://privados.recintos.ws}tipo_id_tipo_mercancia"/&gt;
 *         &lt;element name="fechaInicioCarga" type="{http://privados.recintos.ws}tipo_fec_ini_carga"/&gt;
 *         &lt;element name="fechaFinCarga" type="{http://privados.recintos.ws}tipo_fec_fin_carga"/&gt;
 *         &lt;element name="peso" type="{http://privados.recintos.ws}tipo_peso"/&gt;
 *         &lt;element name="totalDeParcialidades" type="{http://privados.recintos.ws}tipo_num_parcialidad"/&gt;
 *         &lt;element name="numeroDeParcialidad" type="{http://privados.recintos.ws}tipo_num_parcialidad"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionEntradaSimple", namespace = "http://privados.recintos.ws", propOrder = {
    "tipoDeMercancia",
    "fechaInicioCarga",
    "fechaFinCarga",
    "peso",
    "totalDeParcialidades",
    "numeroDeParcialidad"
})
public class InformacionEntradaSimple {

    @XmlSchemaType(name = "positiveInteger")
    protected int tipoDeMercancia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicioCarga;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinCarga;
    @XmlElement(required = true)
    protected BigDecimal peso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDeParcialidades;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numeroDeParcialidad;

    /**
     * Gets the value of the tipoDeMercancia property.
     * 
     */
    public int getTipoDeMercancia() {
        return tipoDeMercancia;
    }

    /**
     * Sets the value of the tipoDeMercancia property.
     * 
     */
    public void setTipoDeMercancia(int value) {
        this.tipoDeMercancia = value;
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
     * Gets the value of the totalDeParcialidades property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDeParcialidades() {
        return totalDeParcialidades;
    }

    /**
     * Sets the value of the totalDeParcialidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDeParcialidades(BigInteger value) {
        this.totalDeParcialidades = value;
    }

    /**
     * Gets the value of the numeroDeParcialidad property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroDeParcialidad() {
        return numeroDeParcialidad;
    }

    /**
     * Sets the value of the numeroDeParcialidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroDeParcialidad(BigInteger value) {
        this.numeroDeParcialidad = value;
    }

}
