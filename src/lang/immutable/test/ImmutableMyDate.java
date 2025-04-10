package lang.immutable.test;

/**
 * 참고 : withXxx()
 * 불변 객체에서 값을 변경하는 경우, withYear() 처럼 "with"로 시작하는 경우가 많음
 * 이는 원래의 상태를 변경하여 새로운 변형을 만다는 것을 의미
 * 즉, 불변 객체의 메소드가 "with"로 작명 된 경우, 그 메소드가 지정된 수정 사항을 포함하는 객체의 새 인스턴스를 반환한다는 뜻
 * 정리하면 "with"는 관례처럼 사용되는데, 원본 객체의 상태가 그대로 유지 됨을 장조하면서 변경사항을 새 족사본에 포함하는 과정을 간결하게 표현
 */
public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
