
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
 *         &lt;element name="guiaMaster" type="{http://privados.recintos.ws}guiaMaster"/&gt;
 *         &lt;element name="guiaHouse" type="{http://privados.recintos.ws}guiaHouse" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "guiaMaster",
    "guiaHouse"
})
@XmlRootElement(name = "recibeConsolidacion", namespace = "http://privados.recintos.ws")
public class RecibeConsolidacion {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(required = true)
    protected GuiaMaster guiaMaster;
    protected List<GuiaHouse> guiaHouse;

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
     * Gets the value of the guiaMaster property.
     * 
     * @return
     *     possible object is
     *     {@link GuiaMaster }
     *     
     */
    public GuiaMaster getGuiaMaster() {
        return guiaMaster;
    }

    /**
     * Sets the value of the guiaMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiaMaster }
     *     
     */
    public void setGuiaMaster(GuiaMaster value) {
        this.guiaMaster = value;
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

}
