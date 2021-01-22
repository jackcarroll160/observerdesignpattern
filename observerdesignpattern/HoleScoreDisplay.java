package observerdesignpattern;

public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

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
