
package com.mark.hw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Errors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Errors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allErrors" type="{http://validation.springframework.org}ArrayOfObjectError" minOccurs="0"/>
 *         &lt;element name="errorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldError" type="{http://validation.springframework.org}FieldError" minOccurs="0"/>
 *         &lt;element name="fieldErrorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fieldErrors" type="{http://validation.springframework.org}ArrayOfFieldError" minOccurs="0"/>
 *         &lt;element name="globalError" type="{http://validation.springframework.org}ObjectError" minOccurs="0"/>
 *         &lt;element name="globalErrorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="globalErrors" type="{http://validation.springframework.org}ArrayOfObjectError" minOccurs="0"/>
 *         &lt;element name="nestedPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Errors", namespace = "http://validation.springframework.org", propOrder = {
    "allErrors",
    "errorCount",
    "fieldError",
    "fieldErrorCount",
    "fieldErrors",
    "globalError",
    "globalErrorCount",
    "globalErrors",
    "nestedPath",
    "objectName"
})
public class Errors {

    @XmlElementRef(name = "allErrors", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfObjectError> allErrors;
    protected Integer errorCount;
    @XmlElementRef(name = "fieldError", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<FieldError> fieldError;
    protected Integer fieldErrorCount;
    @XmlElementRef(name = "fieldErrors", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFieldError> fieldErrors;
    @XmlElementRef(name = "globalError", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ObjectError> globalError;
    protected Integer globalErrorCount;
    @XmlElementRef(name = "globalErrors", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfObjectError> globalErrors;
    @XmlElementRef(name = "nestedPath", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nestedPath;
    @XmlElementRef(name = "objectName", namespace = "http://validation.springframework.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectName;

    /**
     * Gets the value of the allErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObjectError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfObjectError> getAllErrors() {
        return allErrors;
    }

    /**
     * Sets the value of the allErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObjectError }{@code >}
     *     
     */
    public void setAllErrors(JAXBElement<ArrayOfObjectError> value) {
        this.allErrors = value;
    }

    /**
     * Gets the value of the errorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

    /**
     * Gets the value of the fieldError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FieldError }{@code >}
     *     
     */
    public JAXBElement<FieldError> getFieldError() {
        return fieldError;
    }

    /**
     * Sets the value of the fieldError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FieldError }{@code >}
     *     
     */
    public void setFieldError(JAXBElement<FieldError> value) {
        this.fieldError = value;
    }

    /**
     * Gets the value of the fieldErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFieldErrorCount() {
        return fieldErrorCount;
    }

    /**
     * Sets the value of the fieldErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFieldErrorCount(Integer value) {
        this.fieldErrorCount = value;
    }

    /**
     * Gets the value of the fieldErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFieldError> getFieldErrors() {
        return fieldErrors;
    }

    /**
     * Sets the value of the fieldErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFieldError }{@code >}
     *     
     */
    public void setFieldErrors(JAXBElement<ArrayOfFieldError> value) {
        this.fieldErrors = value;
    }

    /**
     * Gets the value of the globalError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ObjectError }{@code >}
     *     
     */
    public JAXBElement<ObjectError> getGlobalError() {
        return globalError;
    }

    /**
     * Sets the value of the globalError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ObjectError }{@code >}
     *     
     */
    public void setGlobalError(JAXBElement<ObjectError> value) {
        this.globalError = value;
    }

    /**
     * Gets the value of the globalErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalErrorCount() {
        return globalErrorCount;
    }

    /**
     * Sets the value of the globalErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalErrorCount(Integer value) {
        this.globalErrorCount = value;
    }

    /**
     * Gets the value of the globalErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObjectError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfObjectError> getGlobalErrors() {
        return globalErrors;
    }

    /**
     * Sets the value of the globalErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfObjectError }{@code >}
     *     
     */
    public void setGlobalErrors(JAXBElement<ArrayOfObjectError> value) {
        this.globalErrors = value;
    }

    /**
     * Gets the value of the nestedPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNestedPath() {
        return nestedPath;
    }

    /**
     * Sets the value of the nestedPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNestedPath(JAXBElement<String> value) {
        this.nestedPath = value;
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
