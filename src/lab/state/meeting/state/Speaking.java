package lab.state.meeting.state;

import lab.state.meeting.SkypeGroup;

public class Speaking implements State {

    SkypeGroup skypeGroup;

    public Speaking(SkypeGroup skypeGroup) {
        this.skypeGroup = skypeGroup;
    }

    @Override
    public void leave() {
        skypeGroup.setState(skypeGroup.getRegistred());
    }

    @Override
    public void over() {
        skypeGroup.setState(skypeGroup.getInMeeting());
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
        System.out.println("Action not allowed");
    }

    @Override
    public String toString() {
        return "Speaking";
    }
}
