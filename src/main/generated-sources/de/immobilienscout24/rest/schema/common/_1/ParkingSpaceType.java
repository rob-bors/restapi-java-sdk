//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:03:21 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParkingSpaceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSpaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="OUTSIDE"/>
 *     &lt;enumeration value="CARPORT"/>
 *     &lt;enumeration value="DUPLEX"/>
 *     &lt;enumeration value="CAR_PARK"/>
 *     &lt;enumeration value="UNDERGROUND_GARAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpaceType")
@XmlEnum
public enum ParkingSpaceType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Außenstellplatz
     * 
     */
    OUTSIDE,

    /**
     * Carport
     * 
     */
    CARPORT,

    /**
     * Duplex
     * 
     */
    DUPLEX,

    /**
     * Parkhaus
     * 
     */
    CAR_PARK,

    /**
     * Tiefgarage
     * 
     */
    UNDERGROUND_GARAGE;

    public String value() {
        return name();
    }

    public static ParkingSpaceType fromValue(String v) {
        return valueOf(v);
    }

}
