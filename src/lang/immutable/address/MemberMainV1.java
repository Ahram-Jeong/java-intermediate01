package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("몬트리올");

        MemberV1 memberA = new MemberV1("김정수", address);
        MemberV1 memberB = new MemberV1("조승연", address);
        
        // memberA, memberB -> 초기 주소 모두 몬트리올
        System.out.println("memberA = " + memberA); // 몬트리올
        System.out.println("memberB = " + memberB); // 몬트리올
        
        // memberB의 주소를 시그투나로 변경해야 함
        memberB.getAddress().setValue("시그투나");
        System.out.println("시그투나 -> memberB.address");
        System.out.println("memberA = " + memberA); // 시그투나
        System.out.println("memberB = " + memberB); // 시그투나
    }
}
