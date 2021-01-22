package observerdesignpattern;

import java.util.ArrayList;

/**
 * Class for Golfer implementing Subject
 * @author Jackson Carroll
 */
public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Constructor for Golfer taking in a Golfer's name and creating a new ArrayList
     * @param Golfer
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Adds an observer to the ArrayList
     * @author Jackson Carroll
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the ArrayList
     * @author Jackson Carroll
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Loops to update strokes and par of the observer
     * @author Jackson Carroll
     */
    public void notifyObservers(int strokes, int par) {
        for(Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * Takes in strokes and par and puts it into notifyObservers method
     * @author Jackson Carroll
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }

    /**
     * Returns the name of the Golfer
     * @return name of golfer
     * @author Jackson Carroll
     */
    public String getName() {
        return this.name;
    }
}
