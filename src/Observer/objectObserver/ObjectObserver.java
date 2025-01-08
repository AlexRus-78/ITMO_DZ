package Observer.objectObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ObjectObserver implements ObjectObserverInterface {


    private List<Observer> observers;
    private String news;


    public ObjectObserver() {

        observers = new ArrayList<Observer>();

    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(Observer observer) {
       // for (Observer observer : observer) {
       //     observers.update(news);
       // }
    }
        public void setNews(String news) {
            this.news = news;
            notify();
        }
    }
