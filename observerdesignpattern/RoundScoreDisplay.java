package observerdesignpattern;

public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

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
