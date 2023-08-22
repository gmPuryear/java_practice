package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;

    private String userName;
    private ArrayList<Integer> grades; // Arraylists must contain objects which is why this one has "Integer"

    public Student(String name, String userName, HashMap students) {
        this.name = name;
        this.userName = userName;
        grades = new ArrayList<>(); // each time a new Student is created, the name is set and a new grade list for the student is made
        addUserName(userName, students);
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

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

//  // returns the average of the students grades
    public double getGradeAverage() {
        double gradeTotal = 0;
        for (int grade : grades) {
            gradeTotal += grade;
        }
        double gradeAverage = (gradeTotal % grades.size()) + (gradeTotal / grades.size());
        return gradeAverage;
    }

    public void addUserName(String userName, HashMap students) {

    }
}
