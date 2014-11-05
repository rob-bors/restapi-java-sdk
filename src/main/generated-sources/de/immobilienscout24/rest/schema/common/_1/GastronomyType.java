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
 * <p>Java-Klasse für GastronomyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GastronomyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAR_LOUNGE"/>
 *     &lt;enumeration value="CAFE"/>
 *     &lt;enumeration value="CLUB_DISCO"/>
 *     &lt;enumeration value="GUESTS_HOUSE"/>
 *     &lt;enumeration value="TAVERN"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="HOTEL_RESIDENCE"/>
 *     &lt;enumeration value="HOTEL_GARNI"/>
 *     &lt;enumeration value="PENSION"/>
 *     &lt;enumeration value="RESTAURANT"/>
 *     &lt;enumeration value="BUNGALOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GastronomyType")
@XmlEnum
public enum GastronomyType {


    /**
     * Barbetrieb/Lounge
     * 
     */
    BAR_LOUNGE,

    /**
     * Cafe
     * 
     */
    CAFE,

    /**
     * Club/Diskothek
     * 
     */
    CLUB_DISCO,

    /**
     * Gästehaus
     * 
     */
    GUESTS_HOUSE,

    /**
     * Gaststätte
     * 
     */
    TAVERN,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Hotelanwesen
     * 
     */
    HOTEL_RESIDENCE,

    /**
     * Hotel garni (Ein Hotel, dass nur Frühstück anbietet /Tageshotel)
     *                     
     * 
     */
    HOTEL_GARNI,

    /**
     * Pension
     * 
     */
    PENSION,

    /**
     * Restaurant
     * 
     */
    RESTAURANT,

    /**
     * Ferienbungalows
     * 
     */
    BUNGALOW;

    public String value() {
        return name();
    }

    public static GastronomyType fromValue(String v) {
        return valueOf(v);
    }

}
