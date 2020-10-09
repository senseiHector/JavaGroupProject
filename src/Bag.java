import java.util.HashSet;

public class Bag<T> {

    private HashSet<T> bag = new HashSet<>();

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
