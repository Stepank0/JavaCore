package Homework.Ninth;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;

    List<Course> studentList;

    public Student(String name, List<Course> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentList(List<Course> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student student = (Student) o;
//        return getName().equals(student.getName()) && getStudentList().equals(student.getStudentList());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getStudentList());
//    }
}
