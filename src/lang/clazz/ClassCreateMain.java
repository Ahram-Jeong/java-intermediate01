package lang.clazz;

/**
 * getDeclaredConstructor().newInstance()
 * getDeclaredConstructor() : 생성자를 선택
 * newInstance() : 선택 된 생성자를 기반으로 인스턴스를 생성
 */
public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class bonjourClass = Bonjour.class;
//        Class bonjourClass = Class.forName("lang.clazz.Bonjour");

        Bonjour bonjour = (Bonjour) bonjourClass.getDeclaredConstructor().newInstance();
        String result = bonjour.bonjour();

        System.out.println("bonjour = " + bonjour); // bonjour = lang.clazz.Bonjour@2f4d3709
        System.out.println("result = " + result); // result = Bonjour!
    }
}
