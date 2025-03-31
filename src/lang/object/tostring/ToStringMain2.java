package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model X");
        Dog dog1 = new Dog("정수", 1);
        Dog dog2 = new Dog("승연", 2);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString()); // lang.object.tostring.Car@4e50df2e
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car); // lang.object.tostring.Car@4e50df2e
        System.out.println(dog1); // Dog{dogName='정수', age=1}
        System.out.println(dog2); // Dog{dogName='승연', age=2}
        
        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i); // 참조값, int

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue); // 16진수

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue = " + refValue2); // 16진수
    }
}
