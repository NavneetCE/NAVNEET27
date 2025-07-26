import java.util.Scanner;


public class operator {

    public static void arithmeticoperation(int a, int b) {
        System.out.println("result: " + (a + b));
    }

    public static void unaryoperation(int a) {
        System.out.println("result: " + (-a));
    }

    public static void assignmentoperation() {
        int x = 5;
        System.out.println("assigned value: " + x);
    }

    public static void relationaloperation(int a, int b) {
        System.out.println("result: " + (a > b));
    }

    public static void logicaloperation(boolean condition1, boolean condition2) {
        System.out.println("result: " + (condition1 && condition2));
    }

    public static void bitwiseoperation(int a, int b) {
        System.out.println("result: " + (a & b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose an operation:");
        System.out.println("1. arithmetic (+)");
        System.out.println("2. unary (-)");
        System.out.println("3. assignment (=)");
        System.out.println("4. relational (>)");
        System.out.println("5. logical (&&)");
        System.out.println("6. bitwise (&)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("enter two integers: ");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                arithmeticoperation(a1, b1);
                break;
            case 2:
                System.out.print("enter one integer: ");
                int a2 = sc.nextInt();
                unaryoperation(a2);
                break;
            case 3:
                assignmentoperation();
                break;
            case 4:
                System.out.print("enter two integers: ");
                int a4 = sc.nextInt();
                int b4 = sc.nextInt();
                relationaloperation(a4, b4);
                break;
            case 5:
                System.out.print("enter two boolean values (true/false): ");
                boolean condition1 = sc.nextBoolean();
                boolean condition2 = sc.nextBoolean();
                logicaloperation(condition1, condition2);
                break;
            case 6:
                System.out.print("enter two integers: ");
                int a6 = sc.nextInt();
                int b6 = sc.nextInt();
                bitwiseoperation(a6, b6);
                break;
            default:
                System.out.println("invalid choice.");
        }

        sc.close();
    }
}