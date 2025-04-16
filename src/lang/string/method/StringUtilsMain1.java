package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, World!";

        // valueOf()
        String numStr = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numStr);
        String boolStr = String.valueOf(bool);
        System.out.println("boolean의 문자열 값 : " + boolStr);
        String objStr = String.valueOf(obj);
        System.out.println("객체의 문자열 값 : " + objStr); // java.lang.Object@4e50df2e

        // 문자 + x -> 문자
        String numStr2 = "" + num;
        System.out.println("빈 문자열 + num : " + numStr2);
        
        // toCharArray()
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);

        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
