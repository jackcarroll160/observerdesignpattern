package observerdesignpattern;

/**
 * HoleScoreDisplay class implementing Observer class
 * @author Jackson Carroll
 */
public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Takes in a subject golfer then register's observer
     * @param golfer
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the strokes and par and displays the current score
     * @author Jackson Carroll
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * Displays the message for the golfers current hole stats
     * @author Jackson Carroll
     */
    private void displayCurrentScore() {
        System.out.println("\nCurrent Hole stats:\nPar: " + this.par + "\nStrokes: " + this.strokes);

        int difference = strokes - par;
        if(difference < 0) {
            System.out.println(Math.abs(difference) + " under par");
        }
        else if(difference > 0) {
            System.out.println(Math.abs(difference) + " over par");
        }
        else {
            System.out.println("Made par");
        }
        
    }

}
