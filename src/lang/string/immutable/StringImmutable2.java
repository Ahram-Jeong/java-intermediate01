package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "Xdinary";
        String str2 = str1.concat(" Heroes");
        System.out.println("str1 = " + str1); // Xdinary
        System.out.println("str2 = " + str2); // Xdinary Heroes
    }
}
