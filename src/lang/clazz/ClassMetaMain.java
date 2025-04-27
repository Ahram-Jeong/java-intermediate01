package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Class 클래스의 주요 기능
 * getDeclaredFields() : 클래스의 모든 필드를 조회
 * getDeclaredMethods() : 클래스의 모든 메소드를 조회
 * getSuperclass() : 클래스의 부모 클래스를 조회
 * getInterfaces() : 클래스의 인터페이스들을 조회
 */
public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회 (String 클래스)
//        Class clazz = new String().getClass(); // 2. 인스턴스에서 조회
//        Class clazz = Class.forName("java.lang.String"); // 3. 문자열로 조회
        
        // String 클래스의 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
            System.out.println("field = " + field.getType() + ", " + field.getName());
            System.out.println("===");
        }

        // String 클래스의 모든 메소드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass : " + clazz.getSuperclass().getName()); // Superclass : java.lang.Object

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface = " + i);
        }
    }
}
