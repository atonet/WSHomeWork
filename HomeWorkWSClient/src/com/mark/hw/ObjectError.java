
package com.mark.hw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arguments" type="{http://www.w3.org/2001/XMLSchema}ArrayOfAnyType" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codes" type="{http://homeworkwsserver}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="defaultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectError", namespace = "http://validation.springframework.org", propOrder = {
    "arguments",
    "code",
    "codes",
    "defaultMessage",
    "objectName"
})
public class ObjectError {

    @XmlElementRef(name = "arguments", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAnyType> arguments;
    @XmlElementRef(name = "code", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "codes", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> codes;
    @XmlElementRef(name = "defaultMessage", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultMessage;
    @XmlElementRef(name = "objectName", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectName;

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAnyType> getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnyType }{@code >}
     *     
     */
    public void setArguments(JAXBElement<ArrayOfAnyType> value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setCodes(JAXBElement<ArrayOfString> value) {
        this.codes = value;
    }

    /**
     * Gets the value of the defaultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * Sets the value of the defaultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultMessage(JAXBElement<String> value) {
        this.defaultMessage = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectName(JAXBElement<String> value) {
        this.objectName = value;
    }

}
