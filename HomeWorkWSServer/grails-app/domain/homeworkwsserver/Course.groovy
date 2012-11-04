package homeworkwsserver

class Course implements Serializable {
    String no
    String name
    String teacher
    Date dateCreated
    Date lastUpdated
    static constraints = {
        no()
        name()
        teacher()
        dateCreated()
        lastUpdated()
    }
    static mapping = {
        sort lastUpdated: "asc"
    }
    String toString() {
        no + "," + name
    }
}
