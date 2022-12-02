package usePoly.refactoring.employee;

import usePoly.refactoring.Money;

public abstract class Employee {

    public abstract boolean isPayday();

    public abstract Money calculatePay();

    public abstract void deliveryPay(Money money);
}
