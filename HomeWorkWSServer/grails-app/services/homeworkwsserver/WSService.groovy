package homeworkwsserver

import com.mark.homework.CourseScoreBean

class WSService {
    static expose = ['xfire'] //声明这是一个web service

    CourseScore[] getScoresByStudentNo(String no) {
        CourseScore.findAllByStudent(Student.findByNo(no))  as CourseScore[]
    }

}
