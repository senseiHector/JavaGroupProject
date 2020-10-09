import java.util.LinkedList;

public class BagOfStudents {

    private LinkedList<Student> bag= new LinkedList<>();

    public void add(Student student){
        bag.add(student);
    }
    public void remove(Student student){
        bag.remove(student);
    }

    public void clear(){
        for(Student student : bag)
            bag.remove(student);
    }

}
