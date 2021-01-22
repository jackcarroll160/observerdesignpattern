package observerdesignpattern;

/**
 * Interface for Subject
 * @author Jackson Carroll
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
}
