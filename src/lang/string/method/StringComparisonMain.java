package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello World!"; // 대소문자
        String str2 = "hello world!"; // 모두 소문자
        String str3 = "Hello Java!";

        System.out.println("str1 equals str2 : " + str1.equals(str2)); // false
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2)); // true

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // 1
        System.out.println("'b' compareTo 'a' : " + "a".compareTo("b")); // -1
        System.out.println("'c' compareTo 'a' : " + "c".compareTo("a")); // 2
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3)); // 13
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2)); // 0

        System.out.println("str1 startsWith 'Hello' : " + str1.startsWith("Hello")); // true
        System.out.println("str1 endsWith 'Hello' : " + str1.endsWith("World!")); // true
    }
}
