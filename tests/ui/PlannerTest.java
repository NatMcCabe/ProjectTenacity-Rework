package ui;

import junit.framework.TestCase;
import logic.Player;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlannerTest extends TestCase {
    public void testGetPlayerXp() {
        Planner planner = new Planner();
        Player p = new Player("Maikeru", "Mainscape");
        planner.getPlayerXp(p);
        int skillsMapSize = p.getXp().size();
        assertEquals(29, skillsMapSize);
    }

    public void testGetPlayerQuests() {
        Planner planner = new Planner();
        Player p = new Player("Maikeru", "Mainscape");
        planner.getPlayerQuests(p);
        int questListSize = p.getQualities().size();
        assertTrue(questListSize >= 262);
    }
}
