import Buildings.StudentFlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentFlatTest {
    private StudentFlat studentFlat;


    @BeforeEach
    public void setUp() {
        studentFlat = new StudentFlat(5, "04/10/2018", true) {


            @Override
            public String StudentFlatLocation() {
                return null;
            }

            @Override
            public String dateOfConstruction() {
                return null;
            }

            @Test

            public void canShowNumberOfRooms() {
                int expected = 5;
                int actual = studentFlat.getNumberOfRooms();
                assertEquals(actual, expected);

            }

            @Test
            public void canShowDateOfConstruction() {
                String expected = "04/10/2018";
                String actual = studentFlat.getDateOfConstruction();
                assertEquals(actual, expected);
            }

            @Test
            public void isPartyFriendly() {
                String expected = "true";
                String actual = String.valueOf(studentFlat.getPartyFriendly());
                assertEquals(actual, expected);

            }


