package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println("문자열의 길이 : " + str.length()); // 12
        System.out.println("문자열의 비어있는가 : " + str.isEmpty()); // false
        System.out.println("문자열의 비어있거나 공백인가 : " + str.isBlank()); // false
        System.out.println("문자열의 비어있거나 공백인가 : " + "      ".isBlank()); // true
        System.out.println("문자열의 비어있거나 공백인가 : " + "".isBlank()); // true

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자 = " + c); // o
    }
}
