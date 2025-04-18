package lang.string.builder;

/**
 * 문자열을 합칠 때 대부분의 경우 최적화가 되므로 + 연산을 사용하면 됨
 * But, StringBuilder를 직접 사용하는 것이 더 좋은 경우
 * 1. 반복문에서 반복해서 문자를 연결할 때
 * 2. 조건문을 통해 동적으로 문자열을 조합할 때
 * 3. 복잡한 문자열의 특정 부분을 변경해야 할 때
 * 4. 매우 긴 대용량 문자열을 다룰 때
 *
 * 참고 : StringBuilder vs. StringBuffer
 * StringBuilder와 똑같은 기능을 수행하는 StringBuffer 클래스도 있음
 * StringBuffer는 내부에 동기화가 되어 있어, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능이 느림
 * StringBuilder는 멀티 스레드 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠름
 * 대부분의 경우에는 StringBuilder만 쓴다고 보면 됨 (특수한 경우 StringBuffer)
 */
public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("WOODZ");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
