package observerdesignpattern;

/**
 * Class for the round score display implementing Observer interface
 * @author Jackson Carroll
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Constructor for the class that takes in a subject golfer and registers them
     * @author Jackson Carroll
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the total strokes and par and displays the round score
     * @author Jackson Carroll
     */
    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

    /**
     * Displays the round stats based on making the par, x over par, or x under par
     * @author Jackson Carroll
     */
    private void displayRoundScore() {
        System.out.println("\nRound stats:\nPar: " + this.parTotal + "\nStrokes: " + this.strokesTotal);

        int difference = strokesTotal - parTotal;
        if(difference > 0) {
            System.out.println(Math.abs(difference) + " over par");
        }
        else if(difference < 0) {
            System.out.println(Math.abs(difference) + " under par");
        }
        else {
            System.out.println("Making par");
        }
    }
}
