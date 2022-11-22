import Buildings.Apartment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApartmentTest {

    private Apartment apartment;

    @BeforeEach
    public void setUp(){
        apartment = new Apartment(4,"07/11/2008", 5);
    }
    @Test

    public void canShowNumberOfLevels(){
        int expected = 5;
        int actual = apartment.getNumberOfLevels();

        assertEquals(actual,expected);
    }
    @Test
    public void canShowNumberOfRooms(){
        int expected = 4;
        int actual = apartment.getNumberOfRooms();
        assertEquals(actual,expected);

    }
    @Test
    public void canShowDateOfConstruction(){
        String expected = "07/11/2008";
        String actual = apartment.getDateOfConstruction();
        assertEquals(actual,expected);
    }

}
