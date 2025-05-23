package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World.";

        System.out.println("문자열에 'Java'가 포함되어 있는지 : " + str.contains("Java")); // true
        System.out.println("'Java'의 첫 번째 인덱스 값 : " + str.indexOf("Java")); // 7
        System.out.println("인덱스 10부터 'Java'의 인덱스 값 : " + str.indexOf("Java", 10)); // 24
        System.out.println("'Java'의 마지막 인덱스 값 : " + str.lastIndexOf("Java")); // 24
    }
}
