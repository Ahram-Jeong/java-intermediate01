package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("WOODZ"); // x001
        String str2 = new String("WOODZ"); // x002
        System.out.println("new String() == 비교 : " + (str1 == str2)); // false
        System.out.println("new String() equals 비교 : " + (str1.equals(str2))); // true

        
        // 문자열 리터럴, 문자열 풀
        // 문자열 리터럴을 사용하는 경우, 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용
        // 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 생성
        // 이때 같은 문자열이 있으면 생성하지 않음
        String str3 = "WOODZ"; // x003
        String str4 = "WOODZ"; // x003
        System.out.println("리터럴 == 비교 : " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4))); // true
    }
}
