package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        // DiscountService 제거 가능
        System.out.println("BASIC 할인 금액 = " + Grade.BASIC.discount(price));
        System.out.println("GOLD 할인 금액 = " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 할인 금액 = " + Grade.DIAMOND.discount(price));
    }
}
