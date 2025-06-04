package student_management.view;

import student_management.config.AppFactory;
import student_management.model.entity.Student;
import student_management.model.service.StudentService;

import java.util.Scanner;

public class StudentView {
    private StudentService studentService;
    private Scanner scanner;

    public StudentView(StudentService studentService, Scanner scanner) {
        this.studentService = studentService;
        this.scanner = scanner;
    }

    public void displayStudents() {
        Student[] studentList = studentService.getAllStudents();
        System.out.println("Customer list:");
        int length = studentList.length;

        for (int i = 0; i < length; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i] + "\n");
            }
        }
    }

    public void addStudent() {
        System.out.println("Enter the student's ID: ");
        String studentId = scanner.nextLine();
        System.out.println("Enter the student's name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter the student's class: ");
        String studentClass = scanner.nextLine();
        System.out.println("Enter the student's address: ");
        String studentAddress = scanner.nextLine();
        Student student = studentService.createStudent(studentId, studentName, studentClass, studentAddress);
        studentService.addStudent(student);
    }

    public void editStudent() {
        System.out.println("Enter the ID of student");
        String studentId = scanner.nextLine();
        if (studentService.isExistStudent(studentId)) {
            System.out.println("Enter a new student name");
            String studentName = scanner.nextLine();
            System.out.println("Enter a new student class");
            String studentClass = scanner.nextLine();
            System.out.println("Enter a new student address");
            String studentAddress = scanner.nextLine();
            studentService.updateStudent(studentId, studentName, studentClass, studentAddress);
        } else {
            System.out.println("Student ID " + studentId + " is not exist. Please check again.");
        }
    }

    public void deleteStudent() {
        System.out.println("Enter the ID of student");
        String studentId = scanner.nextLine();
        if (studentService.isExistStudent(studentId)) {
            studentService.deleteStudent(studentId);
        } else {
            System.out.println("Student ID " + studentId + " is not exist. Please check again.");
        }
    }
}
