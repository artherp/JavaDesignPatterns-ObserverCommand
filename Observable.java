import java.util.HashSet;
import java.util.Set;

public class Observable {
    private final Set<Observer> observers = new HashSet();
    private boolean changed = false;
    /**
     * Adds an observer to the set of observers for this object, provided that
     * it is not the same as some observer already in the set.
     *
     * @param o
     */
    public void addObserver (Observer o) {
        observers.add(o);
    }
    
    /**
     * Deletes an observer from the set of observers of this object.
     * @param o 
     */
    public void deleteObserver (Observer o) {
        observers.remove(o);
    }

    protected boolean hasChanged() {
        return changed;
    }
    
    protected void setChanged() {
        this.changed = true;
    }
    
    protected void clearChanged() {
        this.changed = false;
    }
    
    /**
     * If this object has changed, as indicated by the hasChanged method, then
     * notify all of its observers and then call the clearChanged method to
     * indicate that this object has no longer changed.
     */
    public void notifyObservers() {
        if(hasChanged()) {
            for (Observer o: observers) {
                o.update(this, o);
            }
            clearChanged();
        }  
    }
}
