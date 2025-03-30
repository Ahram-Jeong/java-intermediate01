package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object(); // Object 인스턴스도 생성 가능
        
        Object[] objects = { dog, car, obj };

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달 된 객체 수 : " + objects.length);
    }
}
