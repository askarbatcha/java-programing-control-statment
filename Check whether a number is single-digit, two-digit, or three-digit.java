import java.util.Scanner;

class DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        if (num < 10)
            System.out.println("Single-digit number");
        else if (num < 100)
            System.out.println("Two-digit number");
        else if (num < 1000)
            System.out.println("Three-digit number");
        else
            System.out.println("More than three digits");
    }
}
