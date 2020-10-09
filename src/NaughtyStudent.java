public class NaughtyStudent extends Student{
    public double getHackedGrades(){
        return super.getAverageGrades() * 1.1;
    }
}
