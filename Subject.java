/**
 * Interface for Subject extending Observer
 */
public interface Subject extends Observer {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
