package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있음
        ImmutableAddress a = new ImmutableAddress("스톡홀름");
        ImmutableAddress b = a; // 참조 값 대입을 막을 수 있는 방법은 없음
        
        System.out.println("a = " + a); // a = Address{value='스톡홀름'}
        System.out.println("b = " + b); // b = Address{value='스톡홀름'}
        
//        b.setValue("코펜하겐"); 오류
        b = new ImmutableAddress("코펜하겐");
        System.out.println("스톡홀름 -> 코펜하겐");
        System.out.println("a = " + a); // a = Address{value='스톡홀름'}
        System.out.println("b = " + b); // b = Address{value='코펜하겐'}
    }
}
