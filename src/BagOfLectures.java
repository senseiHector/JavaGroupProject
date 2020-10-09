import java.util.LinkedList;

public class BagOfLectures {

    private LinkedList<Lecture> bag = new LinkedList<>();

    public void add(Lecture lecture){
        bag.add(lecture);
    }
    public void remove(Lecture lecture){
        bag.add(lecture);
    }

    public void clear(){
        for (Lecture lecture : bag)
            bag.remove();
    }
}
