import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    List<Double> grades = new ArrayList<>(Arrays.asList(12.1,4.2, 4.5, 5.0));

    Student s = new Student("Adwoa" ,Level.LEVEL_400,grades);
    @Test
    void getAverageGrades() {
        assertEquals(6.45,s.getAverageGrades());
    }
}
