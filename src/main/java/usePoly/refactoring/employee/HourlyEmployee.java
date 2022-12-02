package usePoly.refactoring.employee;

import usePoly.refactoring.EmployeeRecord;
import usePoly.refactoring.Money;

public class HourlyEmployee extends Employee {

    private final EmployeeRecord record;

    public HourlyEmployee(EmployeeRecord r) {
        this.record = r;
    }

    @Override
    public boolean isPayday() {
        //..기획에 따라서, payday를 결정한다.
        return true;
    }

    @Override
    public Money calculatePay() {
        return new Money(100);
    }

    @Override
    public void deliveryPay(Money money) {
        //..이 부분은 뭐지? 입금하는 건가
    }
}
