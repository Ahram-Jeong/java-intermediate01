package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String input = "Bonjour 승연 Hello 승연 Hola 승연";
        String replace = input.replace("승연", "정수");
        System.out.println("replace = " + replace);
    }
}
