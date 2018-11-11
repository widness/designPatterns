package lab.command.car;

public class Client {
    public static void main(String[] args) {
        Invoker game = new Invoker();
        Car receiver = new Car();

        game.setCommand(0, new ForwardCommand(receiver));
        game.setCommand(1, new BackwardCommand(receiver));
        game.setCommand(2, new LeftCommand(receiver));
        game.setCommand(3, new RightCommand(receiver));

        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        game.undo();
    }
}
