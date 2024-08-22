package swiggy_pro.assesment;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class AppTest {
    @Test
    public void testFight() {
        Player player_A = new Player(50, 5, 10);
        Player player_B = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(player_A, player_B);
        arena.fight();

        assertFalse(player_A.isAlive() && player_B.isAlive()); // Either playerA or playerB should be dead after the fight
    }
}