package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간 (millisecond)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간 (nanosecond)
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수 : System.getenv() 메소드를 사용하여 OS에서 설정한 환경 변수의 값을 얻을 수 있음
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성 : System.getProperties() 메소드를 사용하여 현재 시스템 속성을 얻거나 System.getProperties(String key)로 특정 속성을 얻을 수 있음
        // 시스템 속성은 자바에서 사용하는 설정 값
        System.out.println("getProperties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] originalArray = {'w', 'o', 'o', 'd', 'z'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray); // [C@506e1b77
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray)); // [w, o, o, d, z]

        // 프로그램 종료 -> 가급적이면 사용을 권장하지 않음
        System.exit(0); // 0 -> 정상 종료
        System.out.println("김정수"); // 출력 안됨
    }
}