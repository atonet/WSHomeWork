package homeworkwsserver

class CourseScore implements Serializable {
    Student student
    Course course
    Integer score
    Date dateCreated
    Date lastUpdated
    static constraints = {
        student()
        course()
        score(nullable: false, range: 0..100)
        dateCreated()
        lastUpdated()
    }
    static mapping = {
        sort lastUpdated: "asc"
    }
    String toString() {
        score
    }
}
