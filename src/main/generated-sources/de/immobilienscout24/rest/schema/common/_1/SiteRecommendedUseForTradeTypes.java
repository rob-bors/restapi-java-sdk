//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Empfohlene Nutzungsarten eines Gewerbegrundstuecks
 * 
 * <p>Java-Klasse für SiteRecommendedUseForTradeTypes complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SiteRecommendedUseForTradeTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="siteRecommendedUseForTradeType" type="{http://rest.immobilienscout24.de/schema/common/1.0}SiteRecommendedUseForTradeType" maxOccurs="22" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteRecommendedUseForTradeTypes", propOrder = {
    "siteRecommendedUseForTradeType"
})
public class SiteRecommendedUseForTradeTypes {

    protected List<SiteRecommendedUseForTradeType> siteRecommendedUseForTradeType;

    /**
     * Gets the value of the siteRecommendedUseForTradeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteRecommendedUseForTradeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteRecommendedUseForTradeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRecommendedUseForTradeType }
     * 
     * 
     */
    public List<SiteRecommendedUseForTradeType> getSiteRecommendedUseForTradeType() {
        if (siteRecommendedUseForTradeType == null) {
            siteRecommendedUseForTradeType = new ArrayList<SiteRecommendedUseForTradeType>();
        }
        return this.siteRecommendedUseForTradeType;
    }

}
