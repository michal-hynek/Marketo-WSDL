
package com.marketo.mktows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTypeAttrib complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTypeAttrib">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeAttrib" type="{http://www.marketo.com/mktows/}TypeAttrib" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTypeAttrib", propOrder = {
    "typeAttrib"
})
public class ArrayOfTypeAttrib {

    protected List<TypeAttrib> typeAttrib;

    /**
     * Gets the value of the typeAttrib property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeAttrib property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeAttrib().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAttrib }
     * 
     * 
     */
    public List<TypeAttrib> getTypeAttrib() {
        if (typeAttrib == null) {
            typeAttrib = new ArrayList<TypeAttrib>();
        }
        return this.typeAttrib;
    }

}
