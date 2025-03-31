package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString() 반환 값 출력
        System.out.println(string); // java.lang.Object@b4c966a -> 객체의 참조 값

        // object 직접 출력
        System.out.println(object); // java.lang.Object@b4c966a

    }
}
