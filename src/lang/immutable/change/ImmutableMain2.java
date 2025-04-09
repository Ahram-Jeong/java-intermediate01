package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // 반환 값을 받지 않음

        // 실행 결과 아무것도 처리되지 않은 것 처럼 보임
        // 불변 객체에서 변경과 관련된 메소드들은 보통 객체를 새로 만들어서 반환하기 때문에
        // 꼭 반환 값을 받아야 함!
        System.out.println("obj1 = " + obj1.getValue());
    }
}
