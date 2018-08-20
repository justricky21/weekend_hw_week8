import models.Adventurer;
import models.Specialty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AdventurerTest {

    private Adventurer adventurer;

    @Before
    public void before(){
        adventurer = new Adventurer("Thomas", Specialty.FORESTER, 4);
    }

    @Test
    public void adventurerHasName(){
        assertEquals("Thomas", adventurer.getName());
    }

    @Test
    public void adventurerHasSpecialty(){
        assertEquals(Specialty.FORESTER, adventurer.getSpecialty());
    }

    @Test
    public void adventurerHasYearsOfExperience(){
        assertEquals(4, adventurer.getYearsOfExperience());
    }
}
