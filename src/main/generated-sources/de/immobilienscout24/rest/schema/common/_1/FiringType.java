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
 * <p>Java-Klasse für FiringType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FiringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="GEOTHERMAL"/>
 *     &lt;enumeration value="SOLAR_HEATING"/>
 *     &lt;enumeration value="PELLET_HEATING"/>
 *     &lt;enumeration value="GAS"/>
 *     &lt;enumeration value="OIL"/>
 *     &lt;enumeration value="DISTRICT_HEATING"/>
 *     &lt;enumeration value="ELECTRICITY"/>
 *     &lt;enumeration value="COAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FiringType")
@XmlEnum
public enum FiringType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erdwärme
     * 
     */
    GEOTHERMAL,

    /**
     * Solarheizung
     * 
     */
    SOLAR_HEATING,

    /**
     * Pelletheizung
     * 
     */
    PELLET_HEATING,

    /**
     * Gas
     * 
     */
    GAS,

    /**
     * Öl
     * 
     */
    OIL,

    /**
     * Fernwärme
     * 
     */
    DISTRICT_HEATING,

    /**
     * Strom
     * 
     */
    ELECTRICITY,

    /**
     * Kohle
     * 
     */
    COAL;

    public String value() {
        return name();
    }

    public static FiringType fromValue(String v) {
        return valueOf(v);
    }

}
