package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student studentA = new Student("Frank Hank");
        studentA.addGrade(87);
        studentA.addGrade(51);
        studentA.addGrade(86);
        studentA.addGrade(95);

        Student studentB = new Student("Bob Whalen");
        studentB.addGrade(89);
        studentB.addGrade(95);
        studentB.addGrade(75);
        studentB.addGrade(65);

        System.out.println("The average for " + studentA.getName() + " is " + studentA.getGradeAverage() + ".");
        System.out.println("The average for " + studentB.getName() + " is " + studentB.getGradeAverage() + ".");
        System.out.println(studentA.getGrades());
        System.out.println(studentB.getGrades());

    }

}
