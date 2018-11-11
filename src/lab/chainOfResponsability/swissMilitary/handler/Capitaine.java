package lab.chainOfResponsability.swissMilitary.handler;

import lab.chainOfResponsability.swissMilitary.HolidayRequest;

public class Capitaine extends ArmyPower {
    private final double ALLOWABLE = 5;

    @Override
    public void processRequest(HolidayRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Capitaine accepted your request");
        } else {
            System.out.println("Your request was refused");
        }
    }
}
