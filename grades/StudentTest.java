package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student studentA = new Student("Frank Hank");
        studentA.addGrade(87);
        studentA.addGrade(51);
        studentA.addGrade(86);
        studentA.addGrade(95);

        System.out.println("The average for " + studentA.getName() + " is " + studentA.getGradeAverage() + ".");

    }

}
