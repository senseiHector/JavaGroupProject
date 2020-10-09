import java.util.HashMap;

public class Lecture {
    private String lectureId;
    private String name;
    private HashMap<Student, Double> students;

    public Lecture(String lectureId, String name) {
        this.lectureId = lectureId;
        this.name = name;
        this.students = new HashMap<>();
    }


    void Enter(Student student) {
        students.put(student,student.getAverageGrades());
    }

    double getHighestAverageGrade() {
        double highest = 0;
        for (Student i : students.keySet()){
            highest = (highest < students.get(i) ? students.get(i) : highest);
        }
        return highest;
    }

}
