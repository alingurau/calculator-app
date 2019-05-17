import java.util.Scanner;

public class KeyReceiver {

    final static Scanner in = new Scanner(System.in);
    private int a;
    private int b;
    private int answer;

    public KeyReceiver() {

    }

    public void getNumbers() {

        System.out.println("First Number:");
        a = in.nextInt();
        System.out.println("Second Number:");
        b = in.nextInt();
    }

    void addition() {
        answer = a + b;
        System.out.println("The addition of " + a + " and " + b + " is: " + answer);
    }

    void subtraction() {
        answer = a - b;
        System.out.println("The subtraction of " + a + " and " + b + " is: " + answer);
    }

    void multiply() {
        answer = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is: " + answer);
    }

    void division() {
        answer = a / b;
        System.out.println("The division of " + a + " and " + b + " is: " + answer);
    }

}
