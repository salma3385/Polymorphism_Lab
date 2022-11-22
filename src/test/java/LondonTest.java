import Location.London;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LondonTest {

    private London london;

            @BeforeEach
    public void setup(){
                london = new London("Apartment", "StudentFlat");}

                @Test
                public void canCountBuildings() {
                    int expected = 2;
                    int actual = london.countBuildings();
                    assertEquals(expected,actual);

                }



            }


