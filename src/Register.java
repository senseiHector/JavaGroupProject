import java.util.Comparator;
import java.util.List;
import  java.util.Collections;

public class Register {
    private List <Student> list_of_students;

    public Register(List<Student> list){
        this.list_of_students = list;
    }

    public  List <Student>getRegister(){
        return this.list_of_students;
    }

    public void getRegisterByLevel(Level level){

    }

    public List<Student> getStudentName(){
         throw new StudentNotFoundException("Student not found");
    }

    public String printReport(){
        return toString();
    }

    public List<Student> sort (){
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return  (Integer.valueOf(student1.getName()).compareTo(Integer.valueOf(student2.getName())));
            }
        };
        Collections.sort(this.list_of_students,comp);
        return this.list_of_students;
    }

}
