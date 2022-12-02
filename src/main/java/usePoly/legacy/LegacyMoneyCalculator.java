package usePoly.legacy;

public class LegacyMoneyCalculator {

    /**
     * 함수를 딱 보면 뭔가 깔끔해 보이긴한다. 하지만, 위 함수는 총 다섯 가지의 문제가 있다. <br>
     *
     * <ol>
     *  <li>함수가 길다. 또한, 새 직원 유형을 추가하면 더 길어진다.</li>
     *  <li>한 가지 작업만 수행하지 않는다.</li>
     *  <li>SRP(Single Responsibility Principle)를 위반한다.</li>
     *  <li>OCP(Open Closed Principle)를 위반한다.</li>
     *  <li>위 함수와 구조가 동일한 함수가 무한정 존재할 수 있다. (isPayDay(Employee e, Date date), deliveryPay...)</li>
     * </ol>
     *
     * 마지막 이유가 가장 큰데, 직원의 유형별로 작업해야하는 모든 작업에 대해서 저 해로운 switch/case 문을 반복해서 사용해야된다는 뜻이다.
     *
     */
    public LegacyMoney calculatePay(LegacyEmployee e) throws IllegalArgumentException {
        switch (e.getType()) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPAY(e);
            default:
                throw new IllegalArgumentException(e.getType() + "은(는) 존재하지 않는 타입입니다.");
        }
    }

    private LegacyMoney calculateHourlyPay(LegacyEmployee e) {
        return new LegacyMoney(e.getType().getPay());
    }

    private LegacyMoney calculateSalariedPAY(LegacyEmployee e) {
        return new LegacyMoney(e.getType().getPay());
    }

    private LegacyMoney calculateCommissionedPay(LegacyEmployee e) {
        return new LegacyMoney(e.getType().getPay());
    }
}
