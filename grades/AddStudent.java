package grades;

import grades.choices.ExitProgram;

import java.util.HashMap;

import static grades.GradesApplication.scanner;

public class AddStudent {
    public static void addStudent(HashMap<String, Student> students) {
        System.out.println("Please enter a the following student's information");
        System.out.println("Name: ");
        String studentName = scanner.nextLine();
        System.out.println(studentName);
        System.out.println("Username: ");
        String studentUsername = scanner.nextLine();
        System.out.println(studentUsername);
        Student newStudent = new Student(studentName, studentUsername, students);
        addNewStudentsGrade(newStudent, students, studentName);
    }


    public static void addNewStudentsGrade(Student newStudent, HashMap<String, Student> students, String studentName) {
        System.out.println("Please enter student's grade: ");
        int studentGrade = scanner.nextInt();
        newStudent.addGrade(studentGrade);
        System.out.println("Would you like to add another grade for " + studentName + "(y/n) ?");
        System.out.println(newStudent.getGrades());
        String addAnotherGrade = scanner.next();
        if (addAnotherGrade.equalsIgnoreCase("y")) {
            System.out.println(newStudent.getName() + "'s GPA is: " + newStudent.getGradeAverage());
            addNewStudentsGrade(newStudent, students, studentName);
            System.out.println(newStudent.getGradeAverage());
        } else if (addAnotherGrade.equalsIgnoreCase("n")) {
            System.out.println("Would you like to go back to menu? \"y\" to go to menu. \"n\" to exit.");
            scanner.nextLine();
                String goBackToMenu = scanner.nextLine();
                if (goBackToMenu.equalsIgnoreCase("y")) {
                    UserSelection.userSelection(students);
                } else {
                    System.exit(0);
                }
            }
        }
    }


