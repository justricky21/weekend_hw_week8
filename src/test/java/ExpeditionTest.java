import models.Adventurer;
import models.Expedition;
import models.Leader;
import models.Specialty;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpeditionTest {
    private Expedition expedition;
    private Leader leader;
    private Adventurer adventurer;

    @Before
    public void before(){
        adventurer = new Adventurer("Thomas", Specialty.FORESTER, 4);
        leader = new Leader("Markus", Specialty.FORESTER, 6, 2);
        expedition = new Expedition("Seventh Sea Voyage", "Red sea", leader);
    }

    @Test
    public void expeditionHasLeader(){
        assertEquals(leader, expedition.getExpeditionLeader());
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
