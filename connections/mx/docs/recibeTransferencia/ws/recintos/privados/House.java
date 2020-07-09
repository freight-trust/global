
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for house complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="house"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="guiaHouse" type="{http://privados.recintos.ws}tipo_id_guia_house"/&gt;
 *         &lt;element name="cveFolioCAAT" type="{http://privados.recintos.ws}tipo_cve_folio_caat"/&gt;
 *         &lt;element name="pesoenKG" type="{http://privados.recintos.ws}tipo_peso_kg"/&gt;
 *         &lt;element name="mercancia" type="{http://privados.recintos.ws}mercancia" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "house", namespace = "http://privados.recintos.ws", propOrder = {
    "guiaHouseAndCveFolioCAATAndPesoenKG"
})
public class House {

    @XmlElements({
        @XmlElement(name = "guiaHouse", required = true, type = BigInteger.class),
        @XmlElement(name = "cveFolioCAAT", required = true, type = String.class),
        @XmlElement(name = "pesoenKG", required = true, type = BigDecimal.class),
        @XmlElement(name = "mercancia", required = true, type = Mercancia.class),
        @XmlElement(name = "personas", required = true, type = Personas.class)
    })
    protected List<Object> guiaHouseAndCveFolioCAATAndPesoenKG;

    /**
     * Gets the value of the guiaHouseAndCveFolioCAATAndPesoenKG property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiaHouseAndCveFolioCAATAndPesoenKG property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiaHouseAndCveFolioCAATAndPesoenKG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * {@link String }
     * {@link BigDecimal }
     * {@link Mercancia }
     * {@link Personas }
     * 
     * 
     */
    public List<Object> getGuiaHouseAndCveFolioCAATAndPesoenKG() {
        if (guiaHouseAndCveFolioCAATAndPesoenKG == null) {
            guiaHouseAndCveFolioCAATAndPesoenKG = new ArrayList<Object>();
        }
        return this.guiaHouseAndCveFolioCAATAndPesoenKG;
    }

}
