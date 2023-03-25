package exp3;

/**
 * Simple Calculator
 *
 */
public class App {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.sum(1, 2));
        System.out.println(app.sub(1, 2));
        System.out.println(app.mul(1, 2));
        System.out.println(app.div(1, 2));
        System.out.println(app.mod(1, 2));
    }
}
