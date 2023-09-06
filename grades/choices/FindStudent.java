package grades.choices;

import grades.Student;

import java.util.HashMap;

import static grades.GradesApplication.scanner;

public class FindStudent {

    public static void findStudent(HashMap<String, Student> students) {
        System.out.println("Please enter students first and last name (e.g.\"Jane Doe\"): ");
        String studentName = scanner.nextLine();
//        checkNameIsTwoWords(studentName);
//        checkNameForNums(studentName);
        if (checkNameIsTwoWords(studentName) && checkNameForNums(studentName)) {
            System.out.println("Name is good!");
        } else {
            System.out.println("name is bad!");
        }
    }

    public static boolean checkNameIsTwoWords(String studentName) {
        String splitStudentName[] = (studentName.split(" ")); // student name split on whitespace and assigned as an array
        if (splitStudentName.length != 2) {
            return false;
        } else {
            return true;
        }
    }

//    public static boolean checkNameForNums(String studentName) {
//        char[] splitStudentCharArr = studentName.toCharArray();
//        boolean nameHasNoNums = true;
//        while (nameHasNoNums)
//            for (int i = 0; i < splitStudentCharArr.length; i++) {
//                if (Character.isDigit(splitStudentCharArr[i])) {
//                    nameHasNoNums = false;
//                    break;
//                }
//            }
//        return nameHasNoNums;
//    }

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