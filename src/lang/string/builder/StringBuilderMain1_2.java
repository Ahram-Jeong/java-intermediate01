package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("W").append("O").append("O").append("D").append("Z")
                .insert(5, " MOODZ")
                .delete(5, 11)
                .reverse()
                .toString();

        System.out.println("string = " + string);
    }
}
