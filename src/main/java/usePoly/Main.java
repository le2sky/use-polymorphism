package usePoly;

import usePoly.legacy.LegacyEmployeeType;
import usePoly.legacy.LegacyMoneyCalculator;
import usePoly.legacy.LegacyEmployee;
import usePoly.legacy.LegacyMoney;

public class Main {
    public static void main(String[] args) {
        LegacyEmployee legacyEmployee = new LegacyEmployee(LegacyEmployeeType.SALARIED, "le2sky");
        LegacyMoneyCalculator legacyMoneyCalculator = new LegacyMoneyCalculator();
        LegacyMoney legacyMoney = legacyMoneyCalculator.calculatePay(legacyEmployee);
        System.out.println(legacyMoney.getAmount());

    }
}