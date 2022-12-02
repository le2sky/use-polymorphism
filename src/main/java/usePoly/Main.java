package usePoly;

import usePoly.legacy.LegacyEmployeeType;
import usePoly.legacy.LegacyMoneyCalculator;
import usePoly.legacy.LegacyEmployee;
import usePoly.legacy.LegacyMoney;
import usePoly.refactoring.EmployeeRecord;
import usePoly.refactoring.EmployeeType;
import usePoly.refactoring.employee.Employee;
import usePoly.refactoring.factory.EmployeeFactory;
import usePoly.refactoring.factory.EmployeeFactoryImpl;

public class Main {

    public static void main(String[] args) {
        LegacyEmployee legacyEmployee = new LegacyEmployee(LegacyEmployeeType.SALARIED, "le2sky");
        LegacyMoneyCalculator legacyMoneyCalculator = new LegacyMoneyCalculator();
        LegacyMoney legacyMoney = legacyMoneyCalculator.calculatePay(legacyEmployee);
        System.out.println(legacyMoney.getAmount());


        //refactoring
        EmployeeRecord record = new EmployeeRecord(EmployeeType.SALARIED, "le2sky");
        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
        Employee employee = employeeFactory.makeEmployee(record);
        System.out.println(employee.calculatePay().getAmount()); // 일단, 편의상 getAmount!
    }
}