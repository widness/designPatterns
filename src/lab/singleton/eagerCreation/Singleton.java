package lab.singleton.eagerCreation;

import lab.singleton.SimpleSingleton.SingleObject;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    // Il est static

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
