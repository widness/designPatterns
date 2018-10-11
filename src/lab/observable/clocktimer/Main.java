package lab.observable.clocktimer;

import lab.observable.clocktimer.clock.AnalogClock;
import lab.observable.clocktimer.clock.DigitalClock;
import lab.observable.clocktimer.timer.MyTimer;

public class Main {


    public static void main(String[] args) {
        MyTimer clockTimer = new MyTimer();

        new AnalogClock(clockTimer);
        new DigitalClock(clockTimer);
    }
}