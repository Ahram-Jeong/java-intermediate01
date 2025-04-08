package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("몬트리올");

        MemberV2 memberA = new MemberV2("김정수", address);
        MemberV2 memberB = new MemberV2("조승연", address);
        
        // memberA, memberB -> 초기 주소 모두 몬트리올
        System.out.println("memberA = " + memberA); // 몬트리올
        System.out.println("memberB = " + memberB); // 몬트리올
        
        // memberB의 주소를 시그투나로 변경해야 함
        memberB.setAddress(new ImmutableAddress("시그투나")); // 새로운 객체 생성!
        
        System.out.println("시그투나 -> memberB.address");
        System.out.println("memberA = " + memberA); // 몬트리올
        System.out.println("memberB = " + memberB); // 시그투나
    }
}
