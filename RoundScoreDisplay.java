public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this.golfer);
    }

    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;

        displayRoundScore();
    }

    private void displayRoundScore() {
        System.out.println("Rounded Strokes TODO");
    }
}
