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
 * <p>Java-Klasse für RealEstateState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RealEstateState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="TO_BE_DELETED"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RealEstateState")
@XmlEnum
public enum RealEstateState {


    /**
     * Veröffentlichungsstatus ist aktiv.
     * 
     */
    ACTIVE,

    /**
     * Veröffentlichungsstatus ist inaktiv.
     * 
     */
    INACTIVE,

    /**
     * Immobilie wurde gelöscht.
     * 
     */
    TO_BE_DELETED,

    /**
     * Immobilie ist im Entwurf.
     * 
     */
    DRAFT,

    /**
     * Immobilie ist archiviert.
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static RealEstateState fromValue(String v) {
        return valueOf(v);
    }

}
