package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address a = new Address("스톡홀름");
        Address b = a;
        
        System.out.println("a = " + a); // a = Address{value='스톡홀름'}
        System.out.println("b = " + b); // b = Address{value='스톡홀름'}
        
        b.setValue("코펜하겐");
        System.out.println("스톡홀름 -> 코펜하겐");
        System.out.println("a = " + a); // a = Address{value='코펜하겐'}
        System.out.println("b = " + b); // b = Address{value='코펜하겐'}
    }
}
