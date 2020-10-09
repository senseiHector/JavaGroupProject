import java.util.HashMap;

public class Lecture {
    private String lectureId;
    private String name;
    HashMap<Student, Double> students = new HashMap<>();

    void Enter(Student student) {
        students.put(student,student.getAverageGrades());
    }

    double highestAverageGrade() {
        double grade = 0;
        for (Student i : students.keySet())
            grade += students.get(i);
        return grade/students.size();

    }

}
