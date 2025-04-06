package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address a = new Address("스톡홀름");
        Address b = a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "코펜하겐");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값 변경 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
