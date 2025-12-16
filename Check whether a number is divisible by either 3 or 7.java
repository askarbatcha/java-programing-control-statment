import java.util.Scanner;

class DivisibleBy3Or7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 7 == 0)
            System.out.println("The number is divisible by 3 or 7.");
        else
            System.out.println("The number is not divisible by 3 or 7.");
    }
}
