package lab.chainOfResponsability.example.handler;

import lab.chainOfResponsability.example.request.PurchaseRequest;

/**
 * Lab Chain of Responsibility Pattern
 *
 * @author egs
 */
public abstract class PurchasePower {

    protected final double base = 500;
    /**
     * @uml.property name="mySuccessor"
     * @uml.associationEnd inverse="purchasePower1:PurchasePower"
     */
    protected PurchasePower mySuccessor;

    public void setSuccessor(PurchasePower successor) {
        mySuccessor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}