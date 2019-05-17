import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CalculatorInvoker invoker = new CalculatorInvoker();
        KeyReceiver key = new KeyReceiver();

        PlusCommand plusCommand = new PlusCommand(key);
        MinusCommand minusCommand = new MinusCommand(key);
        MultiplyCommand multiplyCommand = new MultiplyCommand(key);
        DivideCommand divideCommand = new DivideCommand(key);

        int choice;

        do {
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Exit\n\n");
            System.out.print("Enter Your Choice : ");

            Scanner scan = new Scanner(System.in);

            choice = scan.next().charAt(0);

            switch (choice) {
                case '1':
                    invoker.CallCommand(plusCommand);
                    break;
                case '2':
                    invoker.CallCommand(minusCommand);
                    break;
                case '3':
                    invoker.CallCommand(multiplyCommand);
                    break;
                case '4':
                    invoker.CallCommand(divideCommand);
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        } while (choice != 5);

    }
}

