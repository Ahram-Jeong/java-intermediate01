package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("WOODZ");
        String str2 = new String("WOODZ");
        System.out.println("메소드 호출 비교 1 : " + isSame(str1, str2)); // true

        String str3 = "WOODZ";
        String str4 = "WOODZ";
        System.out.println("메소드 호출 비교 2 : " + isSame(str3, str4)); // true
    }

    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y); // 문자열 비교는 항상 equals()를 사용해서 동등성 비교를 해야 함
    }
}
