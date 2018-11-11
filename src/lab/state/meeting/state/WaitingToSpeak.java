package lab.state.meeting.state;

import lab.state.meeting.SkypeGroup;

public class WaitingToSpeak implements State {

    SkypeGroup skypeGroup;

    public WaitingToSpeak(SkypeGroup skypeGroup) {
        this.skypeGroup = skypeGroup;
    }

    @Override
    public void leave() {
        skypeGroup.setState(skypeGroup.getSpeaking());
    }

    @Override
    public void over() {
        System.out.println("Action not allowed");
    }

    @Override
    public void ask() {
        System.out.println("Action not allowed");
    }

    @Override
    public void handOver() {
        skypeGroup.setState(skypeGroup.getSpeaking());
    }

    @Override
    public void enter() {
        System.out.println("Action not allowed");
    }

    @Override
    public String toString() {
        return "Waiting to speak";
    }
}
