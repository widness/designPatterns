package lab.observable.clocktimer.timer;

public interface ClockTimer {
    int getHour();
    int getMinute();
    int getSecond();
    void tick();
}