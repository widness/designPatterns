package lab.state.meeting;

public class SkypeDemo {
    public static void main(String[] args) {
        SkypeGroup room1 = new SkypeGroup();

        System.out.println("connect");

        System.out.println(room1);

        room1.enter();

        System.out.println(room1);

        room1.ask();

        System.out.println(room1);

        room1.handOver();

        System.out.println(room1);

        room1.leave();

        System.out.println(room1);
    }
}
