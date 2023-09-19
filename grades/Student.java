package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;

    private String userName;
    private ArrayList<Integer> grades; // Arraylists must contain objects which is why this one has "Integer"

    public Student(String name, String userName) {
        this.name = name;
        this.userName = userName;
        // each time a new Student is created, the name is set and a new grade list for the student is made
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList getGrades() {
        return grades;
    }

    // adds the given grade to the grades array list
    public void addGrade(int grade) {
        grades.add(grade);
    }

//  returns the rounded average of the students grades
    public double getGradeAverage() {
        double gradeTotal = 0;
        for (int grade : grades) {
            gradeTotal += grade;
        }
        double gradeAverage = Math.round((gradeTotal / grades.size()));
        return gradeAverage;
    }
}
