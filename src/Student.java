import java.util.List;

public class Student implements HasLevel, Nameable{
    //Declaring variables
    private String studentName;
    private Level studentLevel;
    private List<Double> studentGrades;
    public double totalGrade;

    public Student(String studentName,  Level studentLevel, List<Double> studentGrades) {
        this.studentName = studentName;
        this.studentLevel = studentLevel;
        this.studentGrades = studentGrades;

    }

    @Override
    public String getName() {

        return studentName;
    }

    @Override
    public Level getLevel() {
        return studentLevel;
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
