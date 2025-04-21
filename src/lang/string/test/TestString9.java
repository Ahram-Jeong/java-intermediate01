package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "user01@gmail.com";
        String[] split = email.split("@");
        System.out.println("ID = " + split[0]); // user01
        System.out.println("Domain = " + split[1]); // gmail.com
    }
}
