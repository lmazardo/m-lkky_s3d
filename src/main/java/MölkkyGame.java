-public class MölkkyGame {
    public void knockOut(int... pins) {

        score += manypinsAreFallen(pins) ? numberOf(pins) : value(pins[0]);
    }

    private boolean manypinsAreFallen(int[] pins) {
        return pins.length != 1;
    }

    private int numberOf(int[] pins) {
        return pins.length;
    }

    private int value(int pin) {
        return pin;
    }

    public int score() {
        return score;
    }

    private int score;
}
