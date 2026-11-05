class Number {
    private int x;

    void fun1(int a) {
        x = a;
    }

    void display() {
        System.out.println("the value of x is:" + x);
    }

}

public class PrivateMemberExample {
    public static void main(String[] args) {

        Number n = new Number();

        n.fun1(10);  //set the x value
        n.display();  // call the display method

    }

}
