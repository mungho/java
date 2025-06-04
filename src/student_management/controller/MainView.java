package student_management.controller;

import student_management.config.AppFactory;
import student_management.view.StudentView;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        StudentView studentView = AppFactory.createStudentView();
        Scanner scanner = AppFactory.getInformation();
        final int DISPLAY = 1;
        final int ADD = 2;
        final int EDIT = 3;
        final int DELETE = 4;

        while (true) {
            System.out.println(
                    "-----------------------------------------" +
                            "\n Please enter a number to continue:" +
                            "\n 1. Display the student list" +
                            "\n 2. Add a new student" +
                            "\n 3. Edit a student" +
                            "\n 4. Delete a student" +
                            "\n -----------------------------------------");

            int actionNumber = Integer.parseInt(scanner.nextLine());

            switch (actionNumber) {
                case 1:
                    studentView.displayStudents();
                    break;
                case 2:
                    studentView.addStudent();
                    break;
                case 3:
                    studentView.editStudent();
                    break;
                case 4:
                    studentView.deleteStudent();
                    break;
                default:
                    System.out.println("Please check your number again");
            }
        }
    }
}
