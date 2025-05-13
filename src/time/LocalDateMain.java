package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        // now() : 현재 시간을 기준으로 생성
        LocalDate nowDate = LocalDate.now();
        // of(...) : 특정 날짜를 기준으로 생성
        LocalDate ofDate = LocalDate.of(2001, 6, 26);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산 (불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + plusDays);
    }
}
