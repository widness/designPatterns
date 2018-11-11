package lab.chainOfResponsability.swissMilitary.handler;

import lab.chainOfResponsability.swissMilitary.HolidayRequest;

public class SergentMajor extends ArmyPower {
    private final double ALLOWABLE = 3;

    @Override
    public void processRequest(HolidayRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("SergentMajor accepted your request");
        } else {
            armySuccessor.processRequest(request);
        }
    }
}