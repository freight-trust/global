
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mercancia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mercancia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numSecuencia" type="{http://privados.recintos.ws}tipo_id_secuencia"/&gt;
 *         &lt;element name="cvepaisOrigen" type="{http://privados.recintos.ws}tipo_cve_pais_origen"/&gt;
 *         &lt;element name="descripcionMercancia" type="{http://privados.recintos.ws}tipo_descripcion_mercancia"/&gt;
 *         &lt;element name="cveImo" type="{http://privados.recintos.ws}tipo_cve_imo"/&gt;
 *         &lt;element name="cveVid" type="{http://privados.recintos.ws}tipo_cve_vid"/&gt;
 *         &lt;element name="valorMercancia" type="{http://privados.recintos.ws}tipo_valor_mercancia"/&gt;
 *         &lt;element name="cveMoneda" type="{http://privados.recintos.ws}tipo_cve_moneda"/&gt;
 *         &lt;element name="numPiezas" type="{http://privados.recintos.ws}tipo_num_piezas_mercancia"/&gt;
 *         &lt;element name="cveUmPiezas" type="{http://privados.recintos.ws}tipo_cve_um_piezas"/&gt;
 *         &lt;element name="numPeso" type="{http://privados.recintos.ws}tipo_peso"/&gt;
 *         &lt;element name="cvePeso" type="{http://privados.recintos.ws}tipo_cve_peso"/&gt;
 *         &lt;element name="condicionCarga" type="{http://privados.recintos.ws}condiciones_carga"/&gt;
 *         &lt;element name="cveTipoMercancia" type="{http://privados.recintos.ws}tipo_cve_tipo_mercancia"/&gt;
 *         &lt;element name="volumenMercancia" type="{http://privados.recintos.ws}tipo_num_volument_total"/&gt;
 *         &lt;element name="Observaciones" type="{http://privados.recintos.ws}observaciones"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mercancia", namespace = "http://privados.recintos.ws", propOrder = {
    "numSecuencia",
    "cvepaisOrigen",
    "descripcionMercancia",
    "cveImo",
    "cveVid",
    "valorMercancia",
    "cveMoneda",
    "numPiezas",
    "cveUmPiezas",
    "numPeso",
    "cvePeso",
    "condicionCarga",
    "cveTipoMercancia",
    "volumenMercancia",
    "observaciones"
})
public class Mercancia {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuencia;
    @XmlElement(required = true)
    protected String cvepaisOrigen;
    @XmlElement(required = true)
    protected String descripcionMercancia;
    @XmlElement(required = true)
    protected String cveImo;
    @XmlElement(required = true)
    protected String cveVid;
    @XmlElement(required = true)
    protected BigDecimal valorMercancia;
    @XmlElement(required = true)
    protected String cveMoneda;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezas;
    @XmlElement(required = true)
    protected String cveUmPiezas;
    @XmlElement(required = true)
    protected BigDecimal numPeso;
    @XmlElement(required = true)
    protected BigDecimal cvePeso;
    @XmlElement(required = true)
    protected String condicionCarga;
    @XmlElement(required = true)
    protected String cveTipoMercancia;
    @XmlElement(required = true)
    protected BigDecimal volumenMercancia;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;

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
     * Gets the value of the cvepaisOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvepaisOrigen() {
        return cvepaisOrigen;
    }

    /**
     * Sets the value of the cvepaisOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvepaisOrigen(String value) {
        this.cvepaisOrigen = value;
    }

    /**
     * Gets the value of the descripcionMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMercancia() {
        return descripcionMercancia;
    }

    /**
     * Sets the value of the descripcionMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMercancia(String value) {
        this.descripcionMercancia = value;
    }

    /**
     * Gets the value of the cveImo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveImo() {
        return cveImo;
    }

    /**
     * Sets the value of the cveImo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveImo(String value) {
        this.cveImo = value;
    }

    /**
     * Gets the value of the cveVid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveVid() {
        return cveVid;
    }

    /**
     * Sets the value of the cveVid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveVid(String value) {
        this.cveVid = value;
    }

    /**
     * Gets the value of the valorMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMercancia() {
        return valorMercancia;
    }

    /**
     * Sets the value of the valorMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMercancia(BigDecimal value) {
        this.valorMercancia = value;
    }

    /**
     * Gets the value of the cveMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveMoneda() {
        return cveMoneda;
    }

    /**
     * Sets the value of the cveMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveMoneda(String value) {
        this.cveMoneda = value;
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

    /**
     * Gets the value of the cvePeso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCvePeso() {
        return cvePeso;
    }

    /**
     * Sets the value of the cvePeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCvePeso(BigDecimal value) {
        this.cvePeso = value;
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
     * Gets the value of the cveTipoMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveTipoMercancia() {
        return cveTipoMercancia;
    }

    /**
     * Sets the value of the cveTipoMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveTipoMercancia(String value) {
        this.cveTipoMercancia = value;
    }

    /**
     * Gets the value of the volumenMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumenMercancia() {
        return volumenMercancia;
    }

    /**
     * Sets the value of the volumenMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumenMercancia(BigDecimal value) {
        this.volumenMercancia = value;
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
