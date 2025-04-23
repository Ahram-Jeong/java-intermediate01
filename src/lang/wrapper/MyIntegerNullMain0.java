package lang.wrapper;

/**
 * 기본형은 항상 값이 존재해야 함
 */
public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(finalValue(intArr, -1)); // -1
        System.out.println(finalValue(intArr, 0)); // 0
        System.out.println(finalValue(intArr, 1)); // 1
        System.out.println(finalValue(intArr, 100)); // -1
    }

    private static int finalValue(int[] intArr, int target) {
        for (int i : intArr) {
            if(i == target) {
                return i;
            }
        }
        return -1;
    }
}
