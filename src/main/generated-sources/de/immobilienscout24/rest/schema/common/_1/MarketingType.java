//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarketingType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PURCHASE"/>
 *     &lt;enumeration value="PURCHASE_PER_SQM"/>
 *     &lt;enumeration value="RENT"/>
 *     &lt;enumeration value="RENT_PER_SQM"/>
 *     &lt;enumeration value="LEASE"/>
 *     &lt;enumeration value="LEASEHOLD"/>
 *     &lt;enumeration value="BUDGET_RENT"/>
 *     &lt;enumeration value="RENT_AND_BUY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketingType")
@XmlEnum
public enum MarketingType {


    /**
     * Kauf
     * 
     */
    PURCHASE,

    /**
     * Kauf pro Quadratmeter
     * 
     */
    PURCHASE_PER_SQM,

    /**
     * Miete
     * 
     */
    RENT,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

    /**
     * Pacht
     * 
     */
    LEASE,

    /**
     * Erbpacht
     * 
     */
    LEASEHOLD,

    /**
     * Gesamtmiete aus allen verfügbaren Miet-Informationen zum
     *                         Vergleich zu einem gegebenen Monatsbudget
     *                     
     * 
     */
    BUDGET_RENT,

    /**
     * Miete und Kauf
     * 
     */
    RENT_AND_BUY;

    public String value() {
        return name();
    }

    public static MarketingType fromValue(String v) {
        return valueOf(v);
    }

}
