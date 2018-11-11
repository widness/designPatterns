package lab.chainOfResponsability.swissMilitary.handler;

import lab.chainOfResponsability.swissMilitary.HolidayRequest;

public class Lieutenant extends ArmyPower {
    private final double ALLOWABLE = 1;

    @Override
    public void processRequest(HolidayRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Lieutenant accepted your request");
        } else {
            armySuccessor.processRequest(request);
        }
    }
}