package lab.state.meeting.state;

import lab.state.meeting.SkypeGroup;

public class Registered implements State {

    SkypeGroup skypeGroup;

    public Registered(SkypeGroup skypeGroup) {
        this.skypeGroup = skypeGroup;
    }

    @Override
    public void leave() {
        System.out.println("Action not allowed");
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
        System.out.println("Action not allowed");
    }

    @Override
    public void enter() {
        skypeGroup.setState(skypeGroup.getInMeeting());
    }

    @Override
    public String toString() {
        return "Registered";
    }
}
