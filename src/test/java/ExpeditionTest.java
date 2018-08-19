import models.Adventurer;
import models.Expedition;
import models.Leader;
import models.Specialty;
import models.Tools.DivingBelt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpeditionTest {
    private Expedition expedition;
    private Leader leader;
    private Adventurer adventurer;
    private DivingBelt divingBelt;


    @Before
    public void before(){
        divingBelt = new DivingBelt();
        adventurer = new Adventurer("Thomas", Specialty.FORESTER, 4, divingBelt);
        leader = new Leader("Markus", Specialty.FORESTER, 6, 2, divingBelt);
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
