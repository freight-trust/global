
package ws.recintos.privados;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="idRecintoFiscalizadoTransferencia" type="{http://privados.recintos.ws}tipo_id_recinto_fiscalizado"/&gt;
 *         &lt;element name="transferencia" type="{http://privados.recintos.ws}informacionTransferenciaSolicitud" maxOccurs="unbounded"/&gt;
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
    "idRecintoFiscalizadoTransferencia",
    "transferencia"
})
@XmlRootElement(name = "recibeTransferenciaOrigen", namespace = "http://privados.recintos.ws")
public class RecibeTransferenciaOrigen {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idRecintoFiscalizadoTransferencia;
    @XmlElement(required = true)
    protected List<InformacionTransferenciaSolicitud> transferencia;

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
     * Gets the value of the idRecintoFiscalizadoTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdRecintoFiscalizadoTransferencia() {
        return idRecintoFiscalizadoTransferencia;
    }

    /**
     * Sets the value of the idRecintoFiscalizadoTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdRecintoFiscalizadoTransferencia(BigInteger value) {
        this.idRecintoFiscalizadoTransferencia = value;
    }

    /**
     * Gets the value of the transferencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacionTransferenciaSolicitud }
     * 
     * 
     */
    public List<InformacionTransferenciaSolicitud> getTransferencia() {
        if (transferencia == null) {
            transferencia = new ArrayList<InformacionTransferenciaSolicitud>();
        }
        return this.transferencia;
    }

}
