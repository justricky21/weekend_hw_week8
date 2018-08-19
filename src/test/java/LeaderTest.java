import models.ITool;
import models.Leader;
import models.Specialty;
import models.Tools.DivingBelt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeaderTest {
    private Leader leader;
    private DivingBelt divingBelt;

    @Before
    public void before(){
        leader = new Leader("Markus", Specialty.FORESTER, 6, 2, divingBelt);
        divingBelt = new DivingBelt();
    }

    @Test
    public void leaderHasName(){
        assertEquals("Markus", leader.getName());
    }

    @Test
    public void leaderHasSpecialty(){
        assertEquals(Specialty.FORESTER, leader.getSpecialty());
    }

    @Test
    public void leaderHasYearsOfExperience(){
        assertEquals(6, leader.getYearsOfExperience());
    }

    @Test
    public void leaderHasYearsAsLeader(){
        assertEquals(2, leader.getYearsAsLeader());
    }

    @Test
    public void leaderHasTool(){
        assertEquals(divingBelt,leader.getTool());
    }

    @Test
    public void leaderCanUseTool(){
        assertEquals("Dive!", leader.useTool());
    }
}
