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
 * <p>Java-Klasse für ShortTermAccommodationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ShortTermAccommodationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APARTMENT"/>
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="HOUSE"/>
 *     &lt;enumeration value="ROOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShortTermAccommodationType")
@XmlEnum
public enum ShortTermAccommodationType {


    /**
     * Wohnung und Apartment
     * 
     */
    APARTMENT,

    /**
     * Wohnung
     * 
     */
    FLAT,

    /**
     * Haus
     * 
     */
    HOUSE,

    /**
     * Zimmer
     * 
     */
    ROOM;

    public String value() {
        return name();
    }

    public static ShortTermAccommodationType fromValue(String v) {
        return valueOf(v);
    }

}
