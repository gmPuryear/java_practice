package grades;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class addStudent {

    public addStudent(HashMap<String, Student> students) {
        this.loadStockUsers(students);
        this.addNewStudent(students);
    }

    public void loadStockUsers(HashMap students) {
        Student Sanders = new Student("Berry Sanders");
        Sanders.addGrade(100);
        Sanders.addGrade(65);
        Sanders.addGrade(87);


        Student Aaron = new Student("Hank Aaron");
        Aaron.addGrade(85);
        Aaron.addGrade(74);
        Aaron.addGrade(69);


        Student Williams = new Student("Hank Williams");
        Williams.addGrade(90);
        Williams.addGrade(91);
        Williams.addGrade(82);

        Student Fields = new Student("Sally Fields");
        Fields.addGrade(99);
        Fields.addGrade(91);
        Fields.addGrade(94);

        students.put("TheSandersMan".toLowerCase(), Sanders);
        students.put("AaronTheGreat".toLowerCase(), Aaron);
        students.put("SirWilliamsWill".toLowerCase(), Williams);
        students.put("SallyOfFields".toLowerCase(),Fields);
    }
    public void addNewStudent(HashMap students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please add a student: ");
        String name = scanner.nextLine();
        Student student = new Student(name);
        System.out.println("Please enter a username you would like to be associated with " + name + ": ");
        String userName = scanner.nextLine();
        students.put(userName);
        addGrade(scanner, name, student);
    }

    public void addGrade(Scanner scanner, String name, Student student) {
        System.out.print("Enter " + name + "'s " + "grade: ");
        int grade = scanner.nextInt();
        student.addGrade(grade);
        System.out.print("Would you like to add another grade for " + student.getName() + "? Y/N: ");
        String addAnotherGrade = scanner.next();
        System.out.println(addAnotherGrade);
        if (addAnotherGrade.equalsIgnoreCase("y")) {
            addGrade(scanner, name, student);
        } else {
            System.out.println("Would you like to see " + name + "'s grades and average? ");
            String seeGrades = scanner.next();
            if (seeGrades.equalsIgnoreCase("y")) {
                System.out.println(student.getName() + "\nGrades: " +
                        student.getGrades() + "\nGrade Average: " + Math.round(student.getGradeAverage()));
            }
        }
    }
}
