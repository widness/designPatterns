package lab.chainOfResponsability.swissMilitary.handler;

import lab.chainOfResponsability.swissMilitary.HolidayRequest;

public abstract class ArmyPower {
    protected ArmyPower armySuccessor;

    abstract public void processRequest(HolidayRequest request);

    public void setSuccessor(ArmyPower successor) {
        armySuccessor = successor;
    }
}
