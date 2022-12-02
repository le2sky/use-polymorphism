package usePoly.refactoring.factory;

import usePoly.refactoring.EmployeeRecord;
import usePoly.refactoring.employee.Employee;

public interface EmployeeFactory {

    public Employee makeEmployee(EmployeeRecord r) throws IllegalArgumentException;

}
