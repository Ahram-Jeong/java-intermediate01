package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String str = "       조승연 김정수 황미현 박성호    ";
//        String trimmed = str.trim();
//        System.out.println("trimmed = " + "-" + trimmed + "-");

        String trimmed = str.strip();
        System.out.println("trimmed = " + "-" + trimmed + "-");
    }
}
