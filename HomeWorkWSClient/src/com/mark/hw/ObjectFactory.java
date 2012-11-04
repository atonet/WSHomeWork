
package com.mark.hw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mark.hw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CourseScoreStudent_QNAME = new QName("http://homeworkwsserver", "student");
    private final static QName _CourseScoreId_QNAME = new QName("http://homeworkwsserver", "id");
    private final static QName _CourseScoreCourse_QNAME = new QName("http://homeworkwsserver", "course");
    private final static QName _CourseScoreErrors_QNAME = new QName("http://homeworkwsserver", "errors");
    private final static QName _CourseScoreVersion_QNAME = new QName("http://homeworkwsserver", "version");
    private final static QName _CourseScoreScore_QNAME = new QName("http://homeworkwsserver", "score");
    private final static QName _CourseScoreProperties_QNAME = new QName("http://homeworkwsserver", "properties");
    private final static QName _CourseName_QNAME = new QName("http://homeworkwsserver", "name");
    private final static QName _CourseNo_QNAME = new QName("http://homeworkwsserver", "no");
    private final static QName _CourseTeacher_QNAME = new QName("http://homeworkwsserver", "teacher");
    private final static QName _ObjectErrorCodes_QNAME = new QName("http://validation.springframework.org", "codes");
    private final static QName _ObjectErrorCode_QNAME = new QName("http://validation.springframework.org", "code");
    private final static QName _ObjectErrorObjectName_QNAME = new QName("http://validation.springframework.org", "objectName");
    private final static QName _ObjectErrorDefaultMessage_QNAME = new QName("http://validation.springframework.org", "defaultMessage");
    private final static QName _ObjectErrorArguments_QNAME = new QName("http://validation.springframework.org", "arguments");
    private final static QName _ErrorsFieldError_QNAME = new QName("http://validation.springframework.org", "fieldError");
    private final static QName _ErrorsAllErrors_QNAME = new QName("http://validation.springframework.org", "allErrors");
    private final static QName _ErrorsNestedPath_QNAME = new QName("http://validation.springframework.org", "nestedPath");
    private final static QName _ErrorsFieldErrors_QNAME = new QName("http://validation.springframework.org", "fieldErrors");
    private final static QName _ErrorsGlobalErrors_QNAME = new QName("http://validation.springframework.org", "globalErrors");
    private final static QName _ErrorsGlobalError_QNAME = new QName("http://validation.springframework.org", "globalError");
    private final static QName _StudentAddress_QNAME = new QName("http://homeworkwsserver", "address");
    private final static QName _StudentTel_QNAME = new QName("http://homeworkwsserver", "tel");
    private final static QName _FieldErrorRejectedValue_QNAME = new QName("http://validation.springframework.org", "rejectedValue");
    private final static QName _FieldErrorField_QNAME = new QName("http://validation.springframework.org", "field");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mark.hw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnyType2AnyTypeMap }
     * 
     */
    public AnyType2AnyTypeMap createAnyType2AnyTypeMap() {
        return new AnyType2AnyTypeMap();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link ArrayOfFieldError }
     * 
     */
    public ArrayOfFieldError createArrayOfFieldError() {
        return new ArrayOfFieldError();
    }

    /**
     * Create an instance of {@link ObjectError }
     * 
     */
    public ObjectError createObjectError() {
        return new ObjectError();
    }

    /**
     * Create an instance of {@link FieldError }
     * 
     */
    public FieldError createFieldError() {
        return new FieldError();
    }

    /**
     * Create an instance of {@link ArrayOfObjectError }
     * 
     */
    public ArrayOfObjectError createArrayOfObjectError() {
        return new ArrayOfObjectError();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link GetScoresByStudentNoResponse }
     * 
     */
    public GetScoresByStudentNoResponse createGetScoresByStudentNoResponse() {
        return new GetScoresByStudentNoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCourseScore }
     * 
     */
    public ArrayOfCourseScore createArrayOfCourseScore() {
        return new ArrayOfCourseScore();
    }

    /**
     * Create an instance of {@link GetScoresByStudentNo }
     * 
     */
    public GetScoresByStudentNo createGetScoresByStudentNo() {
        return new GetScoresByStudentNo();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link CourseScore }
     * 
     */
    public CourseScore createCourseScore() {
        return new CourseScore();
    }

    /**
     * Create an instance of {@link Course }
     * 
     */
    public Course createCourse() {
        return new Course();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link AnyType2AnyTypeMap.Entry }
     * 
     */
    public AnyType2AnyTypeMap.Entry createAnyType2AnyTypeMapEntry() {
        return new AnyType2AnyTypeMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "student", scope = CourseScore.class)
    public JAXBElement<Student> createCourseScoreStudent(Student value) {
        return new JAXBElement<Student>(_CourseScoreStudent_QNAME, Student.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "id", scope = CourseScore.class)
    public JAXBElement<Long> createCourseScoreId(Long value) {
        return new JAXBElement<Long>(_CourseScoreId_QNAME, Long.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Course }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "course", scope = CourseScore.class)
    public JAXBElement<Course> createCourseScoreCourse(Course value) {
        return new JAXBElement<Course>(_CourseScoreCourse_QNAME, Course.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "errors", scope = CourseScore.class)
    public JAXBElement<Errors> createCourseScoreErrors(Errors value) {
        return new JAXBElement<Errors>(_CourseScoreErrors_QNAME, Errors.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "version", scope = CourseScore.class)
    public JAXBElement<Long> createCourseScoreVersion(Long value) {
        return new JAXBElement<Long>(_CourseScoreVersion_QNAME, Long.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "score", scope = CourseScore.class)
    public JAXBElement<Integer> createCourseScoreScore(Integer value) {
        return new JAXBElement<Integer>(_CourseScoreScore_QNAME, Integer.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType2AnyTypeMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "properties", scope = CourseScore.class)
    public JAXBElement<AnyType2AnyTypeMap> createCourseScoreProperties(AnyType2AnyTypeMap value) {
        return new JAXBElement<AnyType2AnyTypeMap>(_CourseScoreProperties_QNAME, AnyType2AnyTypeMap.class, CourseScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "name", scope = Course.class)
    public JAXBElement<String> createCourseName(String value) {
        return new JAXBElement<String>(_CourseName_QNAME, String.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "no", scope = Course.class)
    public JAXBElement<String> createCourseNo(String value) {
        return new JAXBElement<String>(_CourseNo_QNAME, String.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "id", scope = Course.class)
    public JAXBElement<Long> createCourseId(Long value) {
        return new JAXBElement<Long>(_CourseScoreId_QNAME, Long.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "errors", scope = Course.class)
    public JAXBElement<Errors> createCourseErrors(Errors value) {
        return new JAXBElement<Errors>(_CourseScoreErrors_QNAME, Errors.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "teacher", scope = Course.class)
    public JAXBElement<String> createCourseTeacher(String value) {
        return new JAXBElement<String>(_CourseTeacher_QNAME, String.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "version", scope = Course.class)
    public JAXBElement<Long> createCourseVersion(Long value) {
        return new JAXBElement<Long>(_CourseScoreVersion_QNAME, Long.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType2AnyTypeMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "properties", scope = Course.class)
    public JAXBElement<AnyType2AnyTypeMap> createCourseProperties(AnyType2AnyTypeMap value) {
        return new JAXBElement<AnyType2AnyTypeMap>(_CourseScoreProperties_QNAME, AnyType2AnyTypeMap.class, Course.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "codes", scope = ObjectError.class)
    public JAXBElement<ArrayOfString> createObjectErrorCodes(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ObjectErrorCodes_QNAME, ArrayOfString.class, ObjectError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "code", scope = ObjectError.class)
    public JAXBElement<String> createObjectErrorCode(String value) {
        return new JAXBElement<String>(_ObjectErrorCode_QNAME, String.class, ObjectError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "objectName", scope = ObjectError.class)
    public JAXBElement<String> createObjectErrorObjectName(String value) {
        return new JAXBElement<String>(_ObjectErrorObjectName_QNAME, String.class, ObjectError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "defaultMessage", scope = ObjectError.class)
    public JAXBElement<String> createObjectErrorDefaultMessage(String value) {
        return new JAXBElement<String>(_ObjectErrorDefaultMessage_QNAME, String.class, ObjectError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "arguments", scope = ObjectError.class)
    public JAXBElement<ArrayOfAnyType> createObjectErrorArguments(ArrayOfAnyType value) {
        return new JAXBElement<ArrayOfAnyType>(_ObjectErrorArguments_QNAME, ArrayOfAnyType.class, ObjectError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "fieldError", scope = Errors.class)
    public JAXBElement<FieldError> createErrorsFieldError(FieldError value) {
        return new JAXBElement<FieldError>(_ErrorsFieldError_QNAME, FieldError.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "allErrors", scope = Errors.class)
    public JAXBElement<ArrayOfObjectError> createErrorsAllErrors(ArrayOfObjectError value) {
        return new JAXBElement<ArrayOfObjectError>(_ErrorsAllErrors_QNAME, ArrayOfObjectError.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "nestedPath", scope = Errors.class)
    public JAXBElement<String> createErrorsNestedPath(String value) {
        return new JAXBElement<String>(_ErrorsNestedPath_QNAME, String.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFieldError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "fieldErrors", scope = Errors.class)
    public JAXBElement<ArrayOfFieldError> createErrorsFieldErrors(ArrayOfFieldError value) {
        return new JAXBElement<ArrayOfFieldError>(_ErrorsFieldErrors_QNAME, ArrayOfFieldError.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "objectName", scope = Errors.class)
    public JAXBElement<String> createErrorsObjectName(String value) {
        return new JAXBElement<String>(_ObjectErrorObjectName_QNAME, String.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObjectError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "globalErrors", scope = Errors.class)
    public JAXBElement<ArrayOfObjectError> createErrorsGlobalErrors(ArrayOfObjectError value) {
        return new JAXBElement<ArrayOfObjectError>(_ErrorsGlobalErrors_QNAME, ArrayOfObjectError.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "globalError", scope = Errors.class)
    public JAXBElement<ObjectError> createErrorsGlobalError(ObjectError value) {
        return new JAXBElement<ObjectError>(_ErrorsGlobalError_QNAME, ObjectError.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "address", scope = Student.class)
    public JAXBElement<String> createStudentAddress(String value) {
        return new JAXBElement<String>(_StudentAddress_QNAME, String.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "tel", scope = Student.class)
    public JAXBElement<String> createStudentTel(String value) {
        return new JAXBElement<String>(_StudentTel_QNAME, String.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "name", scope = Student.class)
    public JAXBElement<String> createStudentName(String value) {
        return new JAXBElement<String>(_CourseName_QNAME, String.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "no", scope = Student.class)
    public JAXBElement<String> createStudentNo(String value) {
        return new JAXBElement<String>(_CourseNo_QNAME, String.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "id", scope = Student.class)
    public JAXBElement<Long> createStudentId(Long value) {
        return new JAXBElement<Long>(_CourseScoreId_QNAME, Long.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "errors", scope = Student.class)
    public JAXBElement<Errors> createStudentErrors(Errors value) {
        return new JAXBElement<Errors>(_CourseScoreErrors_QNAME, Errors.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "version", scope = Student.class)
    public JAXBElement<Long> createStudentVersion(Long value) {
        return new JAXBElement<Long>(_CourseScoreVersion_QNAME, Long.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType2AnyTypeMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://homeworkwsserver", name = "properties", scope = Student.class)
    public JAXBElement<AnyType2AnyTypeMap> createStudentProperties(AnyType2AnyTypeMap value) {
        return new JAXBElement<AnyType2AnyTypeMap>(_CourseScoreProperties_QNAME, AnyType2AnyTypeMap.class, Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "codes", scope = FieldError.class)
    public JAXBElement<ArrayOfString> createFieldErrorCodes(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ObjectErrorCodes_QNAME, ArrayOfString.class, FieldError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "code", scope = FieldError.class)
    public JAXBElement<String> createFieldErrorCode(String value) {
        return new JAXBElement<String>(_ObjectErrorCode_QNAME, String.class, FieldError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "objectName", scope = FieldError.class)
    public JAXBElement<String> createFieldErrorObjectName(String value) {
        return new JAXBElement<String>(_ObjectErrorObjectName_QNAME, String.class, FieldError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "rejectedValue", scope = FieldError.class)
    public JAXBElement<Object> createFieldErrorRejectedValue(Object value) {
        return new JAXBElement<Object>(_FieldErrorRejectedValue_QNAME, Object.class, FieldError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "field", scope = FieldError.class)
    public JAXBElement<String> createFieldErrorField(String value) {
        return new JAXBElement<String>(_FieldErrorField_QNAME, String.class, FieldError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "defaultMessage", scope = FieldError.class)
    public JAXBElement<String> createFieldErrorDefaultMessage(String value) {
        return new JAXBElement<String>(_ObjectErrorDefaultMessage_QNAME, String.class, FieldError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validation.springframework.org", name = "arguments", scope = FieldError.class)
    public JAXBElement<ArrayOfAnyType> createFieldErrorArguments(ArrayOfAnyType value) {
        return new JAXBElement<ArrayOfAnyType>(_ObjectErrorArguments_QNAME, ArrayOfAnyType.class, FieldError.class, value);
    }

}
