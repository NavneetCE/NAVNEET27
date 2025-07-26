import java.util.Scanner;

class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        data = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is full (Overflow)!");
        } else {
            data[++top] = value;
            System.out.println("Value " + value + " pushed to stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty (Underflow)!");
        } else {
            System.out.println("Value " + data[top--] + " popped from stack.");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top value: " + data[top]);
        }
    }

    public void show() {
        if (top == -1) {
            System.out.println("Stack is currently empty.");
        } else {
            System.out.print("Stack contents (Top → Bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Stackimp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Set stack size: ");
        int size = input.nextInt();
        Stack stack = new Stack(size);

        int option;
        do {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.show();
                    break;
                case 5:
                    System.out.println("Exiting... Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (option != 5);

        input.close();
    }
}
