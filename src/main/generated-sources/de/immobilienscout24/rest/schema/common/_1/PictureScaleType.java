//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.11.05 um 11:50:50 AM CET 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PictureScaleType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureScaleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCALE_60x40"/>
 *     &lt;enumeration value="SCALE_60x60"/>
 *     &lt;enumeration value="SCALE_73x73"/>
 *     &lt;enumeration value="SCALE_118x118"/>
 *     &lt;enumeration value="SCALE_155x40"/>
 *     &lt;enumeration value="SCALE_200x200"/>
 *     &lt;enumeration value="SCALE_210x210"/>
 *     &lt;enumeration value="SCALE_300x300"/>
 *     &lt;enumeration value="SCALE_400x300"/>
 *     &lt;enumeration value="SCALE_540x540"/>
 *     &lt;enumeration value="SCALE_1000x1000"/>
 *     &lt;enumeration value="SCALE_AND_CROP"/>
 *     &lt;enumeration value="SCALE"/>
 *     &lt;enumeration value="WHITE_FILLING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PictureScaleType")
@XmlEnum
public enum PictureScaleType {


    /**
     * Bildgröße 60 x 40
     * 
     */
    @XmlEnumValue("SCALE_60x40")
    SCALE_60_X_40("SCALE_60x40"),

    /**
     * Bildgröße 60 x 60
     * 
     */
    @XmlEnumValue("SCALE_60x60")
    SCALE_60_X_60("SCALE_60x60"),

    /**
     * Bildgröße 73 x 73
     * 
     */
    @XmlEnumValue("SCALE_73x73")
    SCALE_73_X_73("SCALE_73x73"),

    /**
     * Bildgröße 118 x 118
     * 
     */
    @XmlEnumValue("SCALE_118x118")
    SCALE_118_X_118("SCALE_118x118"),

    /**
     * Bildgröße 155 x 40
     * 
     */
    @XmlEnumValue("SCALE_155x40")
    SCALE_155_X_40("SCALE_155x40"),

    /**
     * Bildgröße 200 x 200
     * 
     */
    @XmlEnumValue("SCALE_200x200")
    SCALE_200_X_200("SCALE_200x200"),

    /**
     * Bildgröße 210 x 210
     * 
     */
    @XmlEnumValue("SCALE_210x210")
    SCALE_210_X_210("SCALE_210x210"),

    /**
     * Bildgröße 300 x 300
     * 
     */
    @XmlEnumValue("SCALE_300x300")
    SCALE_300_X_300("SCALE_300x300"),

    /**
     * Bildgröße 400 x 300
     * 
     */
    @XmlEnumValue("SCALE_400x300")
    SCALE_400_X_300("SCALE_400x300"),

    /**
     * Bildgröße 540 x 540
     * 
     */
    @XmlEnumValue("SCALE_540x540")
    SCALE_540_X_540("SCALE_540x540"),

    /**
     * Bildgröße 1000 x 1000
     * 
     */
    @XmlEnumValue("SCALE_1000x1000")
    SCALE_1000_X_1000("SCALE_1000x1000"),

    /**
     * Template für Scaling und Cropping
     * 
     */
    SCALE_AND_CROP("SCALE_AND_CROP"),

    /**
     * Template für Scaling
     * 
     */
    SCALE("SCALE"),

    /**
     * Template für White filling
     * 
     */
    WHITE_FILLING("WHITE_FILLING");
    private final String value;

    PictureScaleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureScaleType fromValue(String v) {
        for (PictureScaleType c: PictureScaleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
