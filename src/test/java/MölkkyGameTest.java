import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MölkkyGameTest {

    @Test
    public void canKnockOutPin() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(4);

        assertEquals(game.score(), 4);
    }

    @Test
    public void canKnockOutThe5thPin() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(5);

        assertEquals(game.score(), 5);
    }

    @Test
    public void canKnockOut3Pins() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(2, 3, 5);

        assertEquals(game.score(), 3);

    }

    @Test
    public void canKnockOutTwice() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(2, 3, 5);
        game.knockOut(2, 3, 5);

        assertEquals(game.score(), 6);

    }

    @Test
    public void canKnockOutTwice2() {
        MölkkyGame game = new MölkkyGame();

        game.knockOut(2);
        game.knockOut(2);

        assertEquals(game.score(), 4);

    }
}
