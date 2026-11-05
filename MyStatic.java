class Car {

    public static int x;
    int y;
    int z;
}

public class MyStatic {
    public static void main(String args[]) {
        Car.x = 50;
        System.out.println("the value of x is:" + Car.x);

        // creating the object of the class

        Car c = new Car();
        c.y = 30;
        c.z = 40;
        System.out.println("the value of y is:" + c.y);
        System.out.println("the value of z is:" + c.z);

    }
}