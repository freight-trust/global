
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="numSecuencia" type="{http://privados.recintos.ws}tipo_id_secuencia"/&gt;
 *         &lt;element name="numPeso" type="{http://privados.recintos.ws}tipo_peso"/&gt;
 *         &lt;element name="numPiezas" type="{http://privados.recintos.ws}tipo_num_piezas_mercancia"/&gt;
 *         &lt;element name="cveUmPiezas" type="{http://privados.recintos.ws}tipo_cve_um_piezas"/&gt;
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
    "numSecuencia",
    "numPeso",
    "numPiezas",
    "cveUmPiezas",
    "observaciones"
})
@XmlRootElement(name = "recibeIncidencia", namespace = "http://privados.recintos.ws")
public class RecibeIncidencia {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuencia;
    @XmlElement(required = true)
    protected BigDecimal numPeso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezas;
    @XmlElement(required = true)
    protected String cveUmPiezas;
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
     * Gets the value of the numSecuencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumSecuencia() {
        return numSecuencia;
    }

    /**
     * Sets the value of the numSecuencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumSecuencia(BigInteger value) {
        this.numSecuencia = value;
    }

    /**
     * Gets the value of the numPeso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumPeso() {
        return numPeso;
    }

    /**
     * Sets the value of the numPeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumPeso(BigDecimal value) {
        this.numPeso = value;
    }

    /**
     * Gets the value of the numPiezas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumPiezas() {
        return numPiezas;
    }

    /**
     * Sets the value of the numPiezas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumPiezas(BigInteger value) {
        this.numPiezas = value;
    }

    /**
     * Gets the value of the cveUmPiezas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveUmPiezas() {
        return cveUmPiezas;
    }

    /**
     * Sets the value of the cveUmPiezas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveUmPiezas(String value) {
        this.cveUmPiezas = value;
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
