package student_management.config;

import student_management.model.entity.Student;
import student_management.model.repository.StudentRepository;
import student_management.model.service.StudentService;
import student_management.view.StudentView;
import vehicle_management.view.VehicleView;

import java.util.Scanner;

public class AppFactory {
    public static StudentView createStudentView() {
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        Scanner scanner = new Scanner(System.in);
        return new StudentView(studentService, scanner);
    }

    public static Scanner getInformation() {
        return new Scanner(System.in);
    }
}
