import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(String studentName,  Level studentLevel, List<Double> studentGrades){
        super(studentName,  studentLevel, studentGrades);
    }
    public String getName() {

        return super.getName();
    }

    public Level getLevel() {
        return super.getLevel();
    }

    public double getHackedGrades(){
        return super.getAverageGrades() * 1.1;
    }
}
