package student_management.model.repository;

import student_management.model.entity.Student;

public class StudentRepository {
    Student[] studentList = new Student[100];

    public Student[] getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }

    public void editStudent(Student student) {

    }

    public void deleteStudent(String studentID) {

    }


}
