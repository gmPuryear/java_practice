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
        addGrade(scanner, name, student);
    }

    public void addGrade(Scanner scanner, String name, Student student) {
        System.out.print("Enter " + name + "'s " + "grade:");
        int grade = scanner.nextInt();
        student.addGrade(grade);
        System.out.print("Would you like to add another grade for " + student.getName() + "? Y/N");
        String addAnotherGrade = scanner.nextLine();
        while (addAnotherGrade != "y" || addAnotherGrade != "Y") {
            addAnotherGrade = scanner.next();
            student.addGrade(grade);
            System.out.print("Would you like to add another grade for " + student.getName() + "? Y/N");
        }
        System.out.println(student.getName() + " " + student.getGrades());
    }
}
