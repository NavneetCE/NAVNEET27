import java.util.Scanner;

public class Relationalopp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\nChoose relational operator:");
        System.out.println("1. a > b");
        System.out.println("2. a < b");
        System.out.println("3. a == b");
        System.out.println("4. a != b");
        System.out.println("5. a >= b");
        System.out.println("6. a <= b");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("a > b: " + (a > b));
                break;
            case 2:
                System.out.println("a < b: " + (a < b));
                break;
            case 3:
               System.out.println("a == b: " + (a == b));
                break;
            case 4:
                System.out.println("a != b: " + (a != b));
                break;   
            case 5:
                System.out.println("a >= b: " + (a>= b));
                break;     
            case 6:
                System.out.println("a <= b: " + (a <= b));
                break;  
            default:
                System.out.println("invalid choice" );
                break;          
        }

        
    }
}
