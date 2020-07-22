
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitudMercanciaPedimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitudMercanciaPedimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idMercancia" type="{http://privados.recintos.ws}tipo_id_mercancia"/&gt;
 *         &lt;element name="idAsociado" type="{http://privados.recintos.ws}tipo_id_asociado"/&gt;
 *         &lt;element name="numSecuencia" type="{http://privados.recintos.ws}tipo_id_secuencia"/&gt;
 *         &lt;element name="numPiezas" type="{http://privados.recintos.ws}tipo_num_piezas_mercancia"/&gt;
 *         &lt;element name="cveUmPiezas" type="{http://privados.recintos.ws}tipo_cve_um_piezas"/&gt;
 *         &lt;element name="numPeso" type="{http://privados.recintos.ws}tipo_peso"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudMercanciaPedimento", namespace = "http://privados.recintos.ws", propOrder = {
    "idMercancia",
    "idAsociado",
    "numSecuencia",
    "numPiezas",
    "cveUmPiezas",
    "numPeso"
})
public class SolicitudMercanciaPedimento {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idMercancia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idAsociado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuencia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezas;
    @XmlElement(required = true)
    protected String cveUmPiezas;
    @XmlElement(required = true)
    protected BigDecimal numPeso;

    /**
     * Gets the value of the idMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdMercancia() {
        return idMercancia;
    }

    /**
     * Sets the value of the idMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdMercancia(BigInteger value) {
        this.idMercancia = value;
    }

    /**
     * Gets the value of the idAsociado property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdAsociado() {
        return idAsociado;
    }

    /**
     * Sets the value of the idAsociado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdAsociado(BigInteger value) {
        this.idAsociado = value;
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

}
