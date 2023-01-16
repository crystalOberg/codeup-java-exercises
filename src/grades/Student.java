package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //RETURNS THE STUDENT'S NAME
    public String getName() {
        return name;
    }

    // ADDS THE GIVEN GRADE TO THE GRADES PROPERTY
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}
