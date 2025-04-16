package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "황민현, 조승연, 김정수, 박성호";
        
        // split()
        String[] splitStr = str.split(", ");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // 문자열 연결을 그냥 진행 할 경우..
//        String joinStr = "";
//        for (int i = 0; i < splitStr.length; i++) {
//            String s = splitStr[i];
//            joinStr += s;
//            if(i != splitStr.length-1) {
//                joinStr += "-";
//            }
//        }
//        System.out.println(joinStr);

        // join()
        String joinedStr = String.join("-", "황민현", "조승연", "김정수");
        System.out.println("joinedStr = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
