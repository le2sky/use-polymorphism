package usePoly.refactoring.factory;

import usePoly.refactoring.EmployeeRecord;
import usePoly.refactoring.employee.CommissionedEmployee;
import usePoly.refactoring.employee.Employee;
import usePoly.refactoring.employee.HourlyEmployee;
import usePoly.refactoring.employee.SalariedEmployee;

public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public Employee makeEmployee(EmployeeRecord r) throws IllegalArgumentException {
        switch (r.getType()) {
            case COMMISSIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmployee(r);
            default:
                throw new IllegalArgumentException(r.getType() + "은(는) 존재하지 않는 타입입니다.");
        }
    }
}
