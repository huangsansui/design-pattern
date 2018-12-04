package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author: Huangqing
 * @Date: 2018/12/4
 * @since: JDK 1.8
 */
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();


    public  void addObserver(Observer observer) {
        observers.add(observer);
    }

    public  void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void noticeAll() {
        observers.stream().forEach(observer -> observer.update());
    }
}
