package usePoly.legacy;

public class LegacyEmployee {

    private final LegacyEmployeeType type;
    private final String name;

    public LegacyEmployee(LegacyEmployeeType type, String name) {
        this.type = type;
        this.name = name;
    }

    public LegacyEmployeeType getType() {
        return type;
    }

    public void work() {
        System.out.println("열일 열일");
    }

    public void introduce() {
        System.out.println("제 이름은 " + name + "입니다. 잘 부탁 드립니다.");
    }
}
