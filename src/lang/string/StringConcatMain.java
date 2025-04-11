package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "Xdinary ";
        String b = "Heroes";

        String result1 = a.concat(b);
        String result2 = a + b; // String 클래스만 + 연산 가능, 원칙적으로는 불가

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
