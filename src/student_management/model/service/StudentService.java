package student_management.model.service;

import student_management.model.entity.Student;
import student_management.model.repository.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student[] getAllStudents() {
        return this.studentRepository.getStudentList();
    }

    public void addStudent(Student student) {
        this.studentRepository.addStudent(student);
    }

    public Student createStudent(String studentId, String studentName, String studentClass, String studentAddress) {
        Student newstudent = new Student(studentId, studentName, studentClass, studentAddress);
        return newstudent;
    }

    public boolean isExistStudent(String studentId) {
        Student[] studentList = studentRepository.getStudentList();
        boolean checkExistStudent = false;

        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentId.equals(studentList[i].getStudentId())) {
                checkExistStudent = true;
            }
        }

        return checkExistStudent;
    }

    public void updateStudent (String studentId, String newName, String newClass, String newAddress) {
        Student[] studentList = studentRepository.getStudentList();

        for(int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentId.equals(studentList[i].getStudentId())) {
                studentList[i].setStudentName(newName);
                studentList[i].setStudentClass(newClass);
                studentList[i].setStudentAddress(newAddress);
            }
        }
    }

    public void deleteStudent(String studentId) {
        Student[] studentList = studentRepository.getStudentList();

        for(int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null && studentId.equals(studentList[i].getStudentId())) {
                studentList[i] = null;
            }
        }
    }
}
