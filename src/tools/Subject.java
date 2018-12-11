package tools;

/**
 * Observable
 */
public interface Subject {
    void attach(Observers o);
    void detach(Observers o);
    void notifyObservers(Object o);
}
