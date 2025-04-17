package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // StringBuilder : 가변 String
        StringBuilder sb = new StringBuilder();
        sb.append("W");
        sb.append("O");
        sb.append("O");
        sb.append("D");
        sb.append("Z");
        System.out.println("sb = " + sb);

        sb.insert(5, " MOODZ");
        System.out.println("insert = " + sb);

        sb.delete(5, 11);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb); // ZDOOW

        // StringBuilder (가변) -> String (불변)
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
