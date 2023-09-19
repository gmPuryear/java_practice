package grades.choices;

import grades.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static grades.GradesApplication.scanner;

public class FindStudent {

    public static boolean checkNameIsTwoWords(String studentName) {
        String splitStudentName[] = (studentName.split(" ")); // student name split on whitespace and assigned as an array
        if (splitStudentName.length != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkNameForNums(String studentName) {
        char[] splitStudentCharArr = studentName.toCharArray();
        for (int i = 0; i < splitStudentCharArr.length; i++) {
            if (Character.isDigit(splitStudentCharArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void findStudent(HashMap <String, Student> students ) {
        System.out.println("Please enter student's first and last name (e.g.\"Jane Doe\"): ");
        String studentName = scanner.nextLine();
        if (checkNameIsTwoWords(studentName) && checkNameForNums(studentName)) {
            searchDatabaseForStudent(studentName, students);
        } else {
            System.out.println("Invalid entry");
            findStudent(students);
        }
    }



    private static void searchDatabaseForStudent() {
        students.forEach((name, studentInfo) -> {
            if (name.equalsIgnoreCase(studentName)) {
                System.out.println(
                        "Name: " + studentInfo.getName() +
                                "\nUsername: " + studentInfo.getUserName() +
                                "\nGrades: " + studentInfo.getGrades() +
                                "\nGrade Average: " + Math.round(studentInfo.getGradeAverage()) +
                                "\n------------------------------------------");
                ExitProgram.exitProgram();
            }
        });
    }
}