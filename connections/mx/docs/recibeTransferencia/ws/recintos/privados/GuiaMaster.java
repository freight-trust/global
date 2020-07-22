
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guiaMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guiaMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroGuiaBl" type="{http://privados.recintos.ws}tipo_numero_guia_bl"/&gt;
 *         &lt;element name="cveFolioCAAT" type="{http://privados.recintos.ws}tipo_cve_folio_caat"/&gt;
 *         &lt;element name="ideTipoOperacionMaster" type="{http://privados.recintos.ws}tipo_ide_tipo_operacion_master"/&gt;
 *         &lt;element name="valorDeclarado" type="{http://privados.recintos.ws}tipo_valor_declarado"/&gt;
 *         &lt;element name="cveMoneda" type="{http://privados.recintos.ws}tipo_cve_moneda"/&gt;
 *         &lt;element name="numPesoBrutoTotal" type="{http://privados.recintos.ws}tipo_num_peso_bruto_total"/&gt;
 *         &lt;element name="codUnidadPesoBruto" type="{http://privados.recintos.ws}tipo_cod_unidad_peso_bruto"/&gt;
 *         &lt;element name="numVolumenTotal" type="{http://privados.recintos.ws}tipo_num_volument_total"/&gt;
 *         &lt;element name="codUnidadVolumen" type="{http://privados.recintos.ws}tipo_cod_unidad_volumen"/&gt;
 *         &lt;element name="numPiezas" type="{http://privados.recintos.ws}tipo_num_piezas"/&gt;
 *         &lt;element name="numParcialidad" type="{http://privados.recintos.ws}tipo_num_parcialidad"/&gt;
 *         &lt;element name="numSecuencia" type="{http://privados.recintos.ws}tipo_num_secuencia"/&gt;
 *         &lt;element name="observaciones" type="{http://privados.recintos.ws}observaciones"/&gt;
 *         &lt;element name="tipoCarga" type="{http://privados.recintos.ws}tipo_tipo_carga"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaMaster", namespace = "http://privados.recintos.ws", propOrder = {
    "numeroGuiaBl",
    "cveFolioCAAT",
    "ideTipoOperacionMaster",
    "valorDeclarado",
    "cveMoneda",
    "numPesoBrutoTotal",
    "codUnidadPesoBruto",
    "numVolumenTotal",
    "codUnidadVolumen",
    "numPiezas",
    "numParcialidad",
    "numSecuencia",
    "observaciones",
    "tipoCarga"
})
public class GuiaMaster {

    @XmlElement(required = true)
    protected String numeroGuiaBl;
    @XmlElement(required = true)
    protected String cveFolioCAAT;
    @XmlElement(required = true)
    protected String ideTipoOperacionMaster;
    @XmlElement(required = true)
    protected BigDecimal valorDeclarado;
    @XmlElement(required = true)
    protected String cveMoneda;
    @XmlElement(required = true)
    protected BigDecimal numPesoBrutoTotal;
    @XmlElement(required = true)
    protected BigDecimal codUnidadPesoBruto;
    @XmlElement(required = true)
    protected BigDecimal numVolumenTotal;
    @XmlElement(required = true)
    protected String codUnidadVolumen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezas;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numParcialidad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuencia;
    @XmlElement(required = true)
    protected String observaciones;
    @XmlElement(required = true)
    protected String tipoCarga;

    /**
     * Gets the value of the numeroGuiaBl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaBl() {
        return numeroGuiaBl;
    }

    /**
     * Sets the value of the numeroGuiaBl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaBl(String value) {
        this.numeroGuiaBl = value;
    }

    /**
     * Gets the value of the cveFolioCAAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveFolioCAAT() {
        return cveFolioCAAT;
    }

    /**
     * Sets the value of the cveFolioCAAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveFolioCAAT(String value) {
        this.cveFolioCAAT = value;
    }

    /**
     * Gets the value of the ideTipoOperacionMaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeTipoOperacionMaster() {
        return ideTipoOperacionMaster;
    }

    /**
     * Sets the value of the ideTipoOperacionMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeTipoOperacionMaster(String value) {
        this.ideTipoOperacionMaster = value;
    }

    /**
     * Gets the value of the valorDeclarado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Sets the value of the valorDeclarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeclarado(BigDecimal value) {
        this.valorDeclarado = value;
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
     * Gets the value of the numPesoBrutoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumPesoBrutoTotal() {
        return numPesoBrutoTotal;
    }

    /**
     * Sets the value of the numPesoBrutoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumPesoBrutoTotal(BigDecimal value) {
        this.numPesoBrutoTotal = value;
    }

    /**
     * Gets the value of the codUnidadPesoBruto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodUnidadPesoBruto() {
        return codUnidadPesoBruto;
    }

    /**
     * Sets the value of the codUnidadPesoBruto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodUnidadPesoBruto(BigDecimal value) {
        this.codUnidadPesoBruto = value;
    }

    /**
     * Gets the value of the numVolumenTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumVolumenTotal() {
        return numVolumenTotal;
    }

    /**
     * Sets the value of the numVolumenTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumVolumenTotal(BigDecimal value) {
        this.numVolumenTotal = value;
    }

    /**
     * Gets the value of the codUnidadVolumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUnidadVolumen() {
        return codUnidadVolumen;
    }

    /**
     * Sets the value of the codUnidadVolumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUnidadVolumen(String value) {
        this.codUnidadVolumen = value;
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
     * Gets the value of the numParcialidad property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumParcialidad() {
        return numParcialidad;
    }

    /**
     * Sets the value of the numParcialidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumParcialidad(BigInteger value) {
        this.numParcialidad = value;
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

    /**
     * Gets the value of the tipoCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Sets the value of the tipoCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarga(String value) {
        this.tipoCarga = value;
    }

}
