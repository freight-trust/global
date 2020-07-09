
package ws.recintos.privados;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for informacionGeneral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informacionGeneral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idOperacion" type="{http://privados.recintos.ws}tipo_id_operacion"/&gt;
 *         &lt;element name="idAsociado" type="{http://privados.recintos.ws}tipo_id_asociado"/&gt;
 *         &lt;element name="fechRegistro" type="{http://privados.recintos.ws}tipo_fec_registro"/&gt;
 *         &lt;element name="idDetalleMovimiento" type="{http://privados.recintos.ws}tipo_id_detalle_movimiento"/&gt;
 *         &lt;element name="idMovimiento" type="{http://privados.recintos.ws}tipo_id_movimiento"/&gt;
 *         &lt;element name="idTipoOperacion" type="{http://privados.recintos.ws}tipo_id_tipo_operacion"/&gt;
 *         &lt;element name="idRecintoFiscalizado" type="{http://privados.recintos.ws}tipo_id_recinto_fiscalizado"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionGeneral", namespace = "http://privados.recintos.ws", propOrder = {
    "idOperacion",
    "idAsociado",
    "fechRegistro",
    "idDetalleMovimiento",
    "idMovimiento",
    "idTipoOperacion",
    "idRecintoFiscalizado"
})
public class InformacionGeneral {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idOperacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idAsociado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechRegistro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idDetalleMovimiento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idMovimiento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idTipoOperacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idRecintoFiscalizado;

    /**
     * Gets the value of the idOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdOperacion() {
        return idOperacion;
    }

    /**
     * Sets the value of the idOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdOperacion(BigInteger value) {
        this.idOperacion = value;
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
     * Gets the value of the fechRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechRegistro() {
        return fechRegistro;
    }

    /**
     * Sets the value of the fechRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechRegistro(XMLGregorianCalendar value) {
        this.fechRegistro = value;
    }

    /**
     * Gets the value of the idDetalleMovimiento property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdDetalleMovimiento() {
        return idDetalleMovimiento;
    }

    /**
     * Sets the value of the idDetalleMovimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdDetalleMovimiento(BigInteger value) {
        this.idDetalleMovimiento = value;
    }

    /**
     * Gets the value of the idMovimiento property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdMovimiento() {
        return idMovimiento;
    }

    /**
     * Sets the value of the idMovimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdMovimiento(BigInteger value) {
        this.idMovimiento = value;
    }

    /**
     * Gets the value of the idTipoOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdTipoOperacion() {
        return idTipoOperacion;
    }

    /**
     * Sets the value of the idTipoOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdTipoOperacion(BigInteger value) {
        this.idTipoOperacion = value;
    }

    /**
     * Gets the value of the idRecintoFiscalizado property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdRecintoFiscalizado() {
        return idRecintoFiscalizado;
    }

    /**
     * Sets the value of the idRecintoFiscalizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdRecintoFiscalizado(BigInteger value) {
        this.idRecintoFiscalizado = value;
    }

}
