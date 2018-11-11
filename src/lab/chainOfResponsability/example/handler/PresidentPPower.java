package lab.chainOfResponsability.example.handler;

import lab.chainOfResponsability.example.request.PurchaseRequest;

/**
 * Lab Chain of Responsibility Pattern
 *
 * @author egs
 */
public class PresidentPPower extends PurchasePower {
    private final double ALLOWABLE = 60 * base;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println("Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}