
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
 * <p>Java class for informacionTransferenciaSolicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informacionTransferenciaSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idAsociado" type="{http://privados.recintos.ws}tipo_id_asociado"/&gt;
 *         &lt;element name="numeroGuiaBl" type="{http://privados.recintos.ws}tipo_numero_guia_bl"/&gt;
 *         &lt;element name="mercancia" type="{http://privados.recintos.ws}solicitudMercancia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionTransferenciaSolicitud", namespace = "http://privados.recintos.ws", propOrder = {
    "idAsociado",
    "numeroGuiaBl",
    "mercancia"
})
public class InformacionTransferenciaSolicitud {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idAsociado;
    @XmlElement(required = true)
    protected String numeroGuiaBl;
    protected List<SolicitudMercancia> mercancia;

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
     * {@link SolicitudMercancia }
     * 
     * 
     */
    public List<SolicitudMercancia> getMercancia() {
        if (mercancia == null) {
            mercancia = new ArrayList<SolicitudMercancia>();
        }
        return this.mercancia;
    }

}
