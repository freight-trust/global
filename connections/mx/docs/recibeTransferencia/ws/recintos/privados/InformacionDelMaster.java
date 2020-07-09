
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for informacionDelMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informacionDelMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroGuiaBlMaster" type="{http://privados.recintos.ws}tipo_numero_guia_bl"/&gt;
 *         &lt;element name="cveFolioCAAT" type="{http://privados.recintos.ws}tipo_cve_folio_caat"/&gt;
 *         &lt;element name="ideTipoOperacionMaster" type="{http://privados.recintos.ws}tipo_ide_tipo_operacion_master"/&gt;
 *         &lt;element name="valorDeclaradoAduana" type="{http://privados.recintos.ws}tipo_valor_declarado"/&gt;
 *         &lt;element name="cveMoneda" type="{http://privados.recintos.ws}tipo_cve_moneda"/&gt;
 *         &lt;element name="pesoBrutoTotal" type="{http://privados.recintos.ws}tipo_num_peso_bruto_total"/&gt;
 *         &lt;element name="codUnidadPesoBruto" type="{http://privados.recintos.ws}tipo_cod_unidad_peso_bruto"/&gt;
 *         &lt;element name="pesoIngresadoKG" type="{http://privados.recintos.ws}tipo_peso_ingresado_kg"/&gt;
 *         &lt;element name="numVolumenTotal" type="{http://privados.recintos.ws}tipo_num_volument_total"/&gt;
 *         &lt;element name="codUnidadVolumen" type="{http://privados.recintos.ws}tipo_cod_unidad_volumen"/&gt;
 *         &lt;element name="numParcialidad" type="{http://privados.recintos.ws}tipo_num_parcialidad"/&gt;
 *         &lt;element name="numSecuencia" type="{http://privados.recintos.ws}tipo_num_secuencia"/&gt;
 *         &lt;element name="observaciones" type="{http://privados.recintos.ws}observaciones"/&gt;
 *         &lt;element name="mercancia" type="{http://privados.recintos.ws}mercancia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="personas" type="{http://privados.recintos.ws}personas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guiaHouse" type="{http://privados.recintos.ws}guiaHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contenedor" type="{http://privados.recintos.ws}contenedor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionDelMaster", namespace = "http://privados.recintos.ws", propOrder = {
    "numeroGuiaBlMaster",
    "cveFolioCAAT",
    "ideTipoOperacionMaster",
    "valorDeclaradoAduana",
    "cveMoneda",
    "pesoBrutoTotal",
    "codUnidadPesoBruto",
    "pesoIngresadoKG",
    "numVolumenTotal",
    "codUnidadVolumen",
    "numParcialidad",
    "numSecuencia",
    "observaciones",
    "mercancia",
    "personas",
    "guiaHouse",
    "contenedor"
})
public class InformacionDelMaster {

    @XmlElement(required = true)
    protected String numeroGuiaBlMaster;
    @XmlElement(required = true)
    protected String cveFolioCAAT;
    @XmlElement(required = true)
    protected String ideTipoOperacionMaster;
    @XmlElement(required = true)
    protected BigDecimal valorDeclaradoAduana;
    @XmlElement(required = true)
    protected String cveMoneda;
    @XmlElement(required = true)
    protected BigDecimal pesoBrutoTotal;
    @XmlElement(required = true)
    protected BigDecimal codUnidadPesoBruto;
    @XmlElement(required = true)
    protected BigDecimal pesoIngresadoKG;
    @XmlElement(required = true)
    protected BigDecimal numVolumenTotal;
    @XmlElement(required = true)
    protected String codUnidadVolumen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numParcialidad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuencia;
    @XmlElement(required = true)
    protected String observaciones;
    protected List<Mercancia> mercancia;
    protected List<Personas> personas;
    protected List<GuiaHouse> guiaHouse;
    protected List<Contenedor> contenedor;

    /**
     * Gets the value of the numeroGuiaBlMaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaBlMaster() {
        return numeroGuiaBlMaster;
    }

    /**
     * Sets the value of the numeroGuiaBlMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaBlMaster(String value) {
        this.numeroGuiaBlMaster = value;
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
     * Gets the value of the valorDeclaradoAduana property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDeclaradoAduana() {
        return valorDeclaradoAduana;
    }

    /**
     * Sets the value of the valorDeclaradoAduana property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDeclaradoAduana(BigDecimal value) {
        this.valorDeclaradoAduana = value;
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
     * Gets the value of the pesoBrutoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    /**
     * Sets the value of the pesoBrutoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoBrutoTotal(BigDecimal value) {
        this.pesoBrutoTotal = value;
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
     * Gets the value of the pesoIngresadoKG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoIngresadoKG() {
        return pesoIngresadoKG;
    }

    /**
     * Sets the value of the pesoIngresadoKG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoIngresadoKG(BigDecimal value) {
        this.pesoIngresadoKG = value;
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
     * Gets the value of the mercancia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mercancia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMercancia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mercancia }
     * 
     * 
     */
    public List<Mercancia> getMercancia() {
        if (mercancia == null) {
            mercancia = new ArrayList<Mercancia>();
        }
        return this.mercancia;
    }

    /**
     * Gets the value of the personas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Personas }
     * 
     * 
     */
    public List<Personas> getPersonas() {
        if (personas == null) {
            personas = new ArrayList<Personas>();
        }
        return this.personas;
    }

    /**
     * Gets the value of the guiaHouse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiaHouse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiaHouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuiaHouse }
     * 
     * 
     */
    public List<GuiaHouse> getGuiaHouse() {
        if (guiaHouse == null) {
            guiaHouse = new ArrayList<GuiaHouse>();
        }
        return this.guiaHouse;
    }

    /**
     * Gets the value of the contenedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contenedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContenedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contenedor }
     * 
     * 
     */
    public List<Contenedor> getContenedor() {
        if (contenedor == null) {
            contenedor = new ArrayList<Contenedor>();
        }
        return this.contenedor;
    }

}
