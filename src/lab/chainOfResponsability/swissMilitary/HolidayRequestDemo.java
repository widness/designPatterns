package lab.chainOfResponsability.swissMilitary;

import lab.chainOfResponsability.swissMilitary.handler.Capitaine;
import lab.chainOfResponsability.swissMilitary.handler.Lieutenant;
import lab.chainOfResponsability.swissMilitary.handler.SergentMajor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HolidayRequestDemo {
    public static void main(String[] args) {
        // Init power
        Lieutenant lieutenant = new Lieutenant();
        SergentMajor sergentMajor = new SergentMajor();
        Capitaine capitaine = new Capitaine();

        // Init chain of responsability
        lieutenant.setSuccessor(sergentMajor);
        sergentMajor.setSuccessor(capitaine);


        //Use ctrl+c to terminate the process.
        try {
            while (true) {
                System.out.println("How many days are you needed for you holiday");
                System.out.print(">");
                int d = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                lieutenant.processRequest(new HolidayRequest(d));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
