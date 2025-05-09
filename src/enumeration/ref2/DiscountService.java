package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {

        // 할인 금액
        return price * grade.getDiscountPercent() / 100;
    }
}
