import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpeditionTest {
    private Expedition expedition;
    private Leader leader;
    private Adventurer adventurer;
    private Patron patron;


    @Before
    public void before(){
        patron = new Patron("Paul");
        adventurer = new Adventurer("Thomas", Specialty.FORESTER, 4);
        leader = new Leader("Markus", Specialty.FORESTER, 6, 2);
        expedition = new Expedition("Seventh Sea Voyage", "Red sea", leader, patron);
    }

    @Test
    public void expeditionHasLeader(){
        assertEquals(leader, expedition.getLeader());
    }

    @Test
    public void expeditionHasTitle(){
        assertEquals("Seventh Sea Voyage", expedition.getTitle());
    }

    @Test
    public void expeditionCanHaveAdventurer(){
        expedition.addAdventurerToParty(adventurer);
        assertEquals(1, expedition.getParty().size());
    }

    @Test
    public void expeditionHasLocation(){
        assertEquals("Red sea", expedition.getLocation());
    }
}
