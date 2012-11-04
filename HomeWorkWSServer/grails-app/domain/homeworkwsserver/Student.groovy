package homeworkwsserver

class Student implements Serializable {
    String no
    String name
    String address
    String tel
    Date dateCreated
    Date lastUpdated
    static constraints = {
        no()
        name()
        address()
        tel()
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
