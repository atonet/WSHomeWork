package com.mark.homework;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 12-10-29
 * Time: 下午9:59
 * To change this template use File | Settings | File Templates.
 */
public class CourseScoreBean implements Serializable {
    private String studentName;
    private String courseName;
    private String score;



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
