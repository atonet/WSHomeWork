
package com.mark.hw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFieldError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFieldError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldError" type="{http://validation.springframework.org}FieldError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFieldError", namespace = "http://validation.springframework.org", propOrder = {
    "fieldError"
})
public class ArrayOfFieldError {

    @XmlElement(name = "FieldError", nillable = true)
    protected List<FieldError> fieldError;

    /**
     * Gets the value of the fieldError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldError }
     * 
     * 
     */
    public List<FieldError> getFieldError() {
        if (fieldError == null) {
            fieldError = new ArrayList<FieldError>();
        }
        return this.fieldError;
    }

}
