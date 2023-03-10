package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student adam = new Student("Adam");
        adam.addGrade(100);
        adam.addGrade(90);
        adam.addGrade(95);
        Student john = new Student("John");
        adam.addGrade(100);
        adam.addGrade(90);
        adam.addGrade(95);
        Student sorina = new Student("Sorina");
        adam.addGrade(100);
        adam.addGrade(90);
        adam.addGrade(95);
        Student javier = new Student("Javier");
        adam.addGrade(100);
        adam.addGrade(90);
        adam.addGrade(95);
//        System.out.println(adam.getGradeAverage());
//        System.out.println(john.getGradeAverage());
//        System.out.println(sorina.getGradeAverage());
//        System.out.println(javier.getGradeAverage());

        students.put("AtomAdam", adam);
        students.put("ANDHISNAMEISJOHNFINNEGAN", john);
        students.put("MoonCat_98", sorina);
        students.put("", adam);

        Input in = new Input();
        runApp(students, in);
    }

    public static void runApp(HashMap<String, Student> students, Input in) {
        System.out.println("Hello, and welcome to CGA-CLI!\nHere is the list of available students:");
        String usernameList = "";
        for (HashMap.Entry<String, Student> student : students.entrySet()) {
//            usernameList += "|" + student.getKey() + "| ";
            usernameList = String.format("%s| %s | ", usernameList, student.getKey());
        }
        System.out.println(usernameList);
        System.out.println("Which student would you like information about?");
        String studentUN = in.getString();
        try {
            System.out.printf("Student Name: \"%s\";%nStudent GitHub Username: \"%s\";%nStudent Grade Average: %.2f;%n", students.get(studentUN).getName(), studentUN, students.get(studentUN).getGradeAverage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("I'm sorry, but that username is not valid.");
        } catch (Exception e) {
            System.out.println("I'm sorry, but something has gone wrong.");
        } finally {
            System.out.println("Do you wish to continue to use the CGA-CLI?");
            boolean resp = in.yesNo();
            if (resp) {
                runApp(students, in);
            }
        }
    }
}