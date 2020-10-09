import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import  java.util.Collections;

public class Register {
    private List <Nameable> list_of_students;

    public Register(List<Nameable> list){
        this.list_of_students = list;
    }

    public  List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();
        for (Nameable student : list_of_students){
            studentNames.add(student.getName());
        }
        return studentNames;
    }

    public List<String> getRegisterByLevel(Level level){
        List<String> studentNames = new ArrayList<>();
        for (Nameable nameable : list_of_students){
            Student student = (Student)nameable;
            if(student.getLevel()==level){
                studentNames.add(student.getName());
            }
        }
        return studentNames;
    }

    public Student getStudentByName(String name) throws StudentNotFoundException{
        boolean found = false;
        Student foundStudent = new Student();
        for (Nameable student : list_of_students){
            if(student.getName().equals(name)){
                found = true;
                foundStudent  = (Student) student;
            }
        }
        if(!found) {
            throw new StudentNotFoundException("Student not found");
        }
        return foundStudent;
    }

    public String printReport(){
        return toString();
    }

    public List<Student> sort (){
        Comparator<Student> comp = new Comparator<>() {
            @Override
            public int compare(Student student1, Student student2) {
                return  (Integer.valueOf(student1.getName()).compareTo(Integer.valueOf(student2.getName())));
            }
        };
        List<Student> studentList = new ArrayList<>();
        for (Nameable name : list_of_students){
            Student student = (Student) name;
            studentList.add(student);
        }
        Collections.sort(studentList,comp);
        return studentList;
    }

}
