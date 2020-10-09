import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getHackedGrades() {
        List<Double> grades = new ArrayList<>(Arrays.asList(5.0,10.0,15.0));
        NaughtyStudent nStudent = new NaughtyStudent("Hector", Level.LEVEL_300,grades);
        assertFalse(nStudent.getAverageGrades() == nStudent.getHackedGrades());
        assertEquals(11.0,nStudent.getHackedGrades());
    }
}