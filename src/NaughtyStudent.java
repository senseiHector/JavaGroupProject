public class NaughtyStudent extends Student{

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
