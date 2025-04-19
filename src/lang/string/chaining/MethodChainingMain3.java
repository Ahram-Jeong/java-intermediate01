package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // 메소드 체이닝이 가능한 이유는 자기 자신의 참조 값을 반환하기 때문
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
