package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "woodz.txt";
        String ext = ".txt";

        int idx = str.indexOf(ext);
        String filename = str.substring(0, idx);
//        String extName = str.substring(idx, str.length());
        String extName = str.substring(idx);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
