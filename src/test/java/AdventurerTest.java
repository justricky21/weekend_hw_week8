import models.Adventurer;
import models.Specialty;
import models.Tools.DivingBelt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AdventurerTest {

    private Adventurer adventurer;
    private DivingBelt divingBelt;

    @Before
    public void before(){
        adventurer = new Adventurer("Thomas", Specialty.FORESTER, 4, divingBelt);
        divingBelt = new DivingBelt();
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

    @Test
    public void adventurerHasTool(){
        assertEquals(divingBelt,adventurer.getTool());
    }

    @Test
    public void adventurerCanUseTool(){
        assertEquals("Dive!", adventurer.useTool());
    }
}
