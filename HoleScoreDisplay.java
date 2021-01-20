public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this.golfer);
    }

    public void update(int strokes, int par) {
        this.strokes += strokes;
        this.par += par;
    }

    private void displayCurrentScore() {
        System.out.print("Strokes: " + this.strokes + "\nPars: " + this.par);
    }

}
