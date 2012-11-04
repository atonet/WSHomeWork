
package com.mark.hw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCourseScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCourseScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseScore" type="{http://homeworkwsserver}CourseScore" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCourseScore", propOrder = {
    "courseScore"
})
public class ArrayOfCourseScore {

    @XmlElement(name = "CourseScore", nillable = true)
    protected List<CourseScore> courseScore;

    /**
     * Gets the value of the courseScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseScore }
     * 
     * 
     */
    public List<CourseScore> getCourseScore() {
        if (courseScore == null) {
            courseScore = new ArrayList<CourseScore>();
        }
        return this.courseScore;
    }

}
