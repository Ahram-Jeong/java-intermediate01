package lang.wrapper;

/**
 * 참조형은 null 사용 가능
 */
public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
        System.out.println(finalValue(intArr, -1)); // -1
        System.out.println(finalValue(intArr, 0)); // 0
        System.out.println(finalValue(intArr, 1)); // 1
        System.out.println(finalValue(intArr, 100)); // null
    }

    private static MyInteger finalValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if(myInteger.getValue() == target) {
                return myInteger; // MyInteger toString 출력
            }
        }
        return null;
    }
}
