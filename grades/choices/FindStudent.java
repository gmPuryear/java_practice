package grades.choices;

import grades.Student;

import java.util.HashMap;
import java.util.Scanner;

import static grades.GradesApplication.scanner;

public class FindStudent {

    public static void findStudent(HashMap<String, Student> students) {
        System.out.println("Please enter students first and last name (e.g.\"Jane Doe\"): ");
        String studentName = scanner.nextLine();
        validateUsername(studentName);

    }

    public static boolean validateUsername(String studentName) {
        String splitStudentName[] = (studentName.split(" ")); // student name split on whitespace and assigned as an array
        if (splitStudentName.length != 2) {
            System.out.println("Please enter a valid name (e.g.\"Jane Doe\"): ");
        }
        return true;
    }


}
