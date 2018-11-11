package lab.state.meeting.state;

public interface State {
    void leave();

    void over();

    void ask();

    void handOver();

    void enter();
}
