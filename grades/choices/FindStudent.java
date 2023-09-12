package grades.choices;

import grades.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static grades.GradesApplication.scanner;

public class FindStudent {

    public static void findStudent(Set<Map.Entry<String, Student>> entries) {
        System.out.println("Please enter student's first and last name (e.g.\"Jane Doe\"): ");
        String studentName = scanner.nextLine();
        if (checkNameIsTwoWords(studentName) && checkNameForNums(studentName)) {
            searchDatabaseForStudent(studentName, st);
        } else {
            System.out.println("Invalid entry");
            findStudent(entries);
        }
    }

    private static void searchDatabaseForStudent(String studentName, HashMap <String, Student> students) {

        students.forEach ((key, value) ->


//        Map.Entry<String, Student> stud : students) { // looping over hashmap
//            Student studentInfo = stud.getValue();
//            if (studentInfo.getName().equalsIgnoreCase(studentName)) {
//                System.out.println(
//                        "Name: " +  studentInfo.getName() +
//                                "\nUsername: " +  studentInfo.getUserName() +
//                                "\nGrades: " + studentInfo.getGrades() +
//                                "\nGrade Average: " + Math.round(studentInfo.getGradeAverage()) +
//                                "\n------------------------------------------");
//                ExitProgram.exitProgram(students);
//            } else {
//                continue;
//            }
//        }
    }

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



}