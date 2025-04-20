package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello woodz, hello justice, hello minhyun";
        String key = "hello";

        int cnt = 0;
        int idx = str.indexOf(key); // 없는 문자열을 찾을 경우 -1 반환
        System.out.println("idx = " + idx);

        while (idx >= 0) {
            idx = str.indexOf(key, idx + 1);
            System.out.println("idx = " + idx);
            cnt++;
        }
        System.out.println("cnt = " + cnt);
    }
}
