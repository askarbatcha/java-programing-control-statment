import java.util.Scanner;

class SameLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (Math.abs(a) % 10 == Math.abs(b) % 10)
            System.out.println("Both numbers have the same last digit.");
        else
            System.out.println("Both numbers do not have the same last digit.");
    }
}
