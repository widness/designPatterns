package lab.chainOfResponsability.example;

import lab.chainOfResponsability.example.handler.DirectorPPower;
import lab.chainOfResponsability.example.handler.ManagerPPower;
import lab.chainOfResponsability.example.handler.PresidentPPower;
import lab.chainOfResponsability.example.handler.VicePresidentPPower;
import lab.chainOfResponsability.example.request.PurchaseRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Code taken from http://www.javacamp.org/designPattern/

/**
 * Lab Chain of Responsibility Pattern
 *
 * @author egs
 */
class CheckAuthority {
    public static void main(String[] args) {
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        //Use ctrl+c to terminate the process.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(0, d, "General"));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}