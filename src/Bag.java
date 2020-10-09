import java.util.LinkedList;

public class Bag<T> {

    private LinkedList<T> bag = new LinkedList<>();

    public void add(T person){
        bag.add(person);
    }
    public  void remove(T person){
        bag.remove(person);
    }

    public void clear(){
        for (T e : bag)
            bag.remove(e);
    }
}
