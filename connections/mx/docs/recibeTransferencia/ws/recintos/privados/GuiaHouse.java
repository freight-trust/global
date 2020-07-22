
package ws.recintos.privados;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guiaHouse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guiaHouse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroGuiaBL" type="{http://privados.recintos.ws}tipo_numero_guia_bl"/&gt;
 *         &lt;element name="idAsociado" type="{http://privados.recintos.ws}tipo_id_asociado"/&gt;
 *         &lt;element name="cveFolioCAAT" type="{http://privados.recintos.ws}tipo_cve_folio_caat"/&gt;
 *         &lt;element name="mercancia" type="{http://privados.recintos.ws}mercancia"/&gt;
 *         &lt;element name="personas" type="{http://privados.recintos.ws}personas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guiaHouse", namespace = "http://privados.recintos.ws", propOrder = {
    "numeroGuiaBL",
    "idAsociado",
    "cveFolioCAAT",
    "mercancia",
    "personas"
})
public class GuiaHouse {

    @XmlElement(required = true)
    protected String numeroGuiaBL;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idAsociado;
    @XmlElement(required = true)
    protected String cveFolioCAAT;
    @XmlElement(required = true)
    protected Mercancia mercancia;
    protected List<Personas> personas;

    /**
     * Gets the value of the numeroGuiaBL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaBL() {
        return numeroGuiaBL;
    }

    /**
     * Sets the value of the numeroGuiaBL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaBL(String value) {
        this.numeroGuiaBL = value;
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
     * Gets the value of the mercancia property.
     * 
     * @return
     *     possible object is
     *     {@link Mercancia }
     *     
     */
    public Mercancia getMercancia() {
        return mercancia;
    }

    /**
     * Sets the value of the mercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mercancia }
     *     
     */
    public void setMercancia(Mercancia value) {
        this.mercancia = value;
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

}
