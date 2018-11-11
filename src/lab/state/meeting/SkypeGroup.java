package lab.state.meeting;

import lab.state.meeting.state.*;

public class SkypeGroup {
    State registred;
    State inMeeting;
    State waitingToSpeak;
    State speaking;

    State state;

    public SkypeGroup() {
        registred = new Registered(this);
        inMeeting = new InMeeting(this);
        waitingToSpeak = new WaitingToSpeak(this);
        speaking = new Speaking(this);
        state = registred;
    }

    public void leave() {
        state.leave();
    }

    public void over() {
        state.over();
    }

    public void ask() {
        state.ask();
    }

    public void handOver() {
        state.handOver();
    }

    public void enter() {
        state.enter();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getRegistred() {
        return registred;
    }

    public State getInMeeting() {
        return inMeeting;
    }

    public State getWaitingToSpeak() {
        return waitingToSpeak;
    }

    public State getSpeaking() {
        return speaking;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
