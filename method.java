package loops;

public class method {

    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();

        demo.wish();
        demo.greet();
        demo.multiply();
        demo.printSum(3, 6);
    }

}

class MethodDemo {

    public void greet() {
        System.out.println("hello");
    }

    public int printSum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    public int multiply() {
        int a = 10;
        int b = 20;
        System.out.println(a * b);
        return a * b;
    }

    public String wish() {
        return "hello bello";
    }
}
