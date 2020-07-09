
package ws.recintos.privados;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="transporte" type="{http://privados.recintos.ws}transporte"/&gt;
 *         &lt;element name="guiaMaster" type="{http://privados.recintos.ws}informacionDelMaster"/&gt;
 *         &lt;element name="contenedor" type="{http://privados.recintos.ws}contenedor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guiaHouse" type="{http://privados.recintos.ws}guiaHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mercancia" type="{http://privados.recintos.ws}mercancia" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "informacionGeneral",
    "transporte",
    "guiaMaster",
    "contenedor",
    "guiaHouse",
    "mercancia",
    "personas"
})
@XmlRootElement(name = "recibeIngresoSinIdAsociado", namespace = "http://privados.recintos.ws")
public class RecibeIngresoSinIdAsociado {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(required = true)
    protected Transporte transporte;
    @XmlElement(required = true)
    protected InformacionDelMaster guiaMaster;
    protected List<Contenedor> contenedor;
    protected List<GuiaHouse> guiaHouse;
    protected List<Mercancia> mercancia;
    protected List<Personas> personas;

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
     * Gets the value of the transporte property.
     * 
     * @return
     *     possible object is
     *     {@link Transporte }
     *     
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Sets the value of the transporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transporte }
     *     
     */
    public void setTransporte(Transporte value) {
        this.transporte = value;
    }

    /**
     * Gets the value of the guiaMaster property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionDelMaster }
     *     
     */
    public InformacionDelMaster getGuiaMaster() {
        return guiaMaster;
    }

    /**
     * Sets the value of the guiaMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionDelMaster }
     *     
     */
    public void setGuiaMaster(InformacionDelMaster value) {
        this.guiaMaster = value;
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

}
