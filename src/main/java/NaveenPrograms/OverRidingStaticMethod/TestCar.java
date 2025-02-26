package NaveenPrograms.OverRidingStaticMethod;

public class TestCar {

    public static void main(String[] args) {
        BMW b = new BMW();
        b.fuelType();
        b.wheel();
        System.out.println("*******************");
        Car c = new Car();
        c.fuelType();
        c.type();
        c.colour();


    }
}
