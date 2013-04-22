
package com.marketo.mktows;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsSyncMultipleLeads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsSyncMultipleLeads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadRecordList" type="{http://www.marketo.com/mktows/}ArrayOfLeadRecord"/>
 *         &lt;element name="dedupEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsSyncMultipleLeads", propOrder = {
    "leadRecordList",
    "dedupEnabled"
})
public class ParamsSyncMultipleLeads {

    @XmlElement(required = true)
    protected ArrayOfLeadRecord leadRecordList;
    @XmlElementRef(name = "dedupEnabled", type = JAXBElement.class)
    protected JAXBElement<Boolean> dedupEnabled;

    /**
     * Gets the value of the leadRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLeadRecord }
     *     
     */
    public ArrayOfLeadRecord getLeadRecordList() {
        return leadRecordList;
    }

    /**
     * Sets the value of the leadRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLeadRecord }
     *     
     */
    public void setLeadRecordList(ArrayOfLeadRecord value) {
        this.leadRecordList = value;
    }

    /**
     * Gets the value of the dedupEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDedupEnabled() {
        return dedupEnabled;
    }

    /**
     * Sets the value of the dedupEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDedupEnabled(JAXBElement<Boolean> value) {
        this.dedupEnabled = ((JAXBElement<Boolean> ) value);
    }

}
