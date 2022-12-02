package usePoly.legacy;

public enum LegacyEmployeeType {
    COMMISSIONED(100), HOURLY(100), SALARIED(1000);

    private final int pay;

    LegacyEmployeeType(int pay) {
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }
}
