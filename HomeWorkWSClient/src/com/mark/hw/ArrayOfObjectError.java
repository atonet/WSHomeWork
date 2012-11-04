
package com.mark.hw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfObjectError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfObjectError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectError" type="{http://validation.springframework.org}ObjectError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjectError", namespace = "http://validation.springframework.org", propOrder = {
    "objectError"
})
public class ArrayOfObjectError {

    @XmlElement(name = "ObjectError", nillable = true)
    protected List<ObjectError> objectError;

    /**
     * Gets the value of the objectError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectError }
     * 
     * 
     */
    public List<ObjectError> getObjectError() {
        if (objectError == null) {
            objectError = new ArrayList<ObjectError>();
        }
        return this.objectError;
    }

}
