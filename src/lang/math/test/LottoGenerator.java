package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate() {
        lottoNumbers = new int[6];
        cnt = 0;

        while(cnt < 6) {
            // 1 ~ 45 사이의 난수 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열 추가
            if (isUnique(number)) {
                lottoNumbers[cnt] = number;
                cnt++;
            }
        }
        return lottoNumbers;
    }

    // 중복 번호 검사 메소드
    private boolean isUnique(int number) {
        for (int i = 0; i < cnt; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
