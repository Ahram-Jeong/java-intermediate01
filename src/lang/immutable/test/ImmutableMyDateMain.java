package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2025, 5, 5); // x001
        ImmutableMyDate date2 = date1; // x001

        System.out.println("date1 = " + date1); // 2025-5-5
        System.out.println("date2 = " + date2); // 2025-5-5

        System.out.println("2026 -> date1");
        date1 = date1.withYear(2026);
        System.out.println("date1 = " + date1); // x002, 2026-5-5
        System.out.println("date2 = " + date2); // x001, 2025-5-5
    }
}
