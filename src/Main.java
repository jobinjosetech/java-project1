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

    static void smallestNumber() {
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int largestNumber = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        System.out.println(largestNumber+" is the smallest Number");
    }

    static void primeNumber() {
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        boolean temp = false;
        for(int i=2;i<num1;i++) {
            if(num1 % i == 0) {
                temp = true;
            }
        }
        if(temp) {
            System.out.println(num1+" is not a prime number");
        }else{
            System.out.println(num1+" is a prime number");
        }
    }

    static void evenNumber(){
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();

        if(num1%2==0){
            System.out.println(num1+" is an even number");
        }else {
            System.out.println(num1+" is not an even number");
        }
    }

    static void reverseNumber(){
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        int reverse = 0;
        while (num1!=0){
            int temp = num1%10;
            reverse = reverse*10+temp;
            num1 = num1/10;
        }
        System.out.println(reverse+" is the Reverse");
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
                case 2:
                    smallestNumber();
                case 3:
                    primeNumber();
                case 4:
                    evenNumber();
                case 5:
                    reverseNumber();
            }
        }
    }
}