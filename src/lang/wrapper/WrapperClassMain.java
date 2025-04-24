package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // Deprecated 예정, 대신에 valueOf() 사용
        Integer integerObj = Integer.valueOf(10); // 불변, valueOf() : 자주 사용하는 -128 ~ 127 범위의 Integer 클래스를 미리 생성하여 반환, 재사용 (성능 최적화)
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기"); // 언박싱 : 래퍼 클래스에 들어있는 기본형 값을 다시 꺼내는 메소드
        int i = integerObj.intValue();
        System.out.println("i = " + i);
        long l = longObj.longValue();
        System.out.println("l = " + l);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj)); // false, 다른 참조를 가리키고 있음
        System.out.println("equals : " + (newInteger.equals(integerObj))); // true, 내부 값 비교
    }
}
