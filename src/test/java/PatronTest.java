import models.Expedition;
import models.Leader;
import models.Patron;
import models.Specialty;
import models.Tools.DivingBelt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PatronTest {
    private Patron patron;
    private Leader leader;
    private Expedition expedition;
    private DivingBelt divingBelt;

    @Before
    public void before(){
        divingBelt = new DivingBelt();
        leader = new Leader("Markus", Specialty.FORESTER, 6, 2, divingBelt);
        expedition = new Expedition("Seventh Sea Voyage", "Red sea", leader);
        patron = new Patron("Elizabeth");
    }

    @Test
    public void patronHasName(){
        assertEquals("Elizabeth", patron.getName());
    }

    @Test
    public void patronCanAddExpedition(){
        patron.addExpeditionToMyExpeditions(expedition);
        assertEquals(1, patron.getExpeditions().size());
    }

    @Test
    public void patronCanHaveCurrentExpedition(){
        patron.addExpeditionToMyExpeditions(expedition);
        assertEquals(expedition, patron.getCurrentExpedition());
    }


}
