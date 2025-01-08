package Observer.objectObserver;

import java.util.Observer;

public interface ObjectObserverInterface {
    void attach (Observer observer);
    void detach (Observer observer);
    void notify (Observer observer);
}
