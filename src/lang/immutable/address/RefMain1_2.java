package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("스톡홀름"); // x001
        Address b = new Address("스톡홀름"); // x002
        
        System.out.println("a = " + a); // a = Address{value='스톡홀름'}
        System.out.println("b = " + b); // b = Address{value='스톡홀름'}
        
        b.setValue("코펜하겐");
        System.out.println("스톡홀름 -> 코펜하겐");
        System.out.println("a = " + a); // a = Address{value='스톡홀름'}
        System.out.println("b = " + b); // b = Address{value='코펜하겐'}
    }
}
