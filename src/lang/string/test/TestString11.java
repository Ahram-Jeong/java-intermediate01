package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "My heart's in Calico";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reverseStr = " + reversed);
    }
}
