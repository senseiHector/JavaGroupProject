import java.util.List;
import java.io.*;

public class Student implements HasLevel, Nameable{
    //Declaring variables
    private String studentName;
    private Level studentLevel;
    private List<Double> studentGrades;
    public double totalGrade;

    public Student() {
        studentLevel = null;
        studentGrades = null;
        studentName = null;
    }
    public Student(String studentName,  Level studentLevel, List<Double> studentGrades) {
        this.studentName = studentName;
        this.studentLevel = studentLevel;
        this.studentGrades = studentGrades;

    }

    @Override
    public String getName() {

        return studentName;
    }
    public void getGrade() {

        try (PrintStream pw = new PrintStream(System.out, true)) {
            for (double d : studentGrades)
                pw.println(d);
        }
    }

    @Override
    public Level getLevel() {
        return studentLevel;
    }

    public void printGrade() {
        PrintStream ps = new PrintStream(System.out);
        for(double grade : studentGrades) {
            ps.print(grade);
            ps.println();;
        }
    }

    public double getTotalGrades() {
        totalGrade = 0;
        for(double score : studentGrades)
        {totalGrade += score;
        }
        return totalGrade;
    }
    public double getAverageGrades(){
        return getTotalGrades()/studentGrades.size();
    }
}
