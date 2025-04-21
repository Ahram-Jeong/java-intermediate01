package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String str = "황민현, 조승연, 김정수, 박성호";
        String[] split = str.split(", ");

        // 분리
        for (String s : split) {
            System.out.println(s);
        }

        // 결합
        String joinedStr = String.join(" -> ", split);
        System.out.println("joinedStr = " + joinedStr);
    }
}
