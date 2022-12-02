package usePoly.refactoring;

import java.time.LocalDateTime;

public class EmployeeRecord {

    private final String name;
    private final EmployeeType type;
    private final LocalDateTime hireDate;

    public EmployeeRecord(EmployeeType type, String name) {
        this.type = type;
        this.name = name;
        this.hireDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public EmployeeType getType() {
        return type;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }
}
