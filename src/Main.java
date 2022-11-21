import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void largestNumber() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int largestNumber = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println(largestNumber+" is the Largest Number");
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("------------------ Menu ------------------");
            System.out.println("1. Find largest of 3 numbers");
            System.out.println("2. Find smallest of 3 numbers");
            System.out.println("3. Check prime or not");
            System.out.println("4. Check even or not");
            System.out.println("5. Find reverse of a number");
            System.out.println("6. Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Please select a choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    largestNumber();
            }
        }
    }
}