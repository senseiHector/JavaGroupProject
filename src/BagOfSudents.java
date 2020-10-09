import java.util.LinkedList;

public class BagOfSudents {

    private LinkedList<Student> bag= new LinkedList<>();

    public void add(Student student){
        add(student);
    }
    public void remove(Student student){
        add(student);
    }

    public void clear(){
        for(Student student : bag)
            bag.remove(student);
    }

}
