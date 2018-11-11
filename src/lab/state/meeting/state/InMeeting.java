package lab.state.meeting.state;

import lab.state.meeting.SkypeGroup;

public class InMeeting implements State {

    SkypeGroup skypeGroup;

    public InMeeting(SkypeGroup skypeGroup) {
        this.skypeGroup = skypeGroup;
    }

    @Override
    public void leave() {
        skypeGroup.setState(skypeGroup.getRegistred());
    }

    @Override
    public void over() {
        System.out.println("Action not allowed");
    }

    @Override
    public void ask() {
        skypeGroup.setState(skypeGroup.getWaitingToSpeak());
    }

    @Override
    public void handOver() {
        System.out.println("Action not allowed");
    }

    @Override
    public void enter() {
        System.out.println("Action not allowed");
    }

    @Override
    public String toString() {
        return "In meeting";
    }
}
