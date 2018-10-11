package lab.observable.clocktimer.observer;

public interface Observer {
    void update(int hour, int minute, int second);
}
