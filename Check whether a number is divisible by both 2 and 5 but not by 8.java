import java.util.Scanner;

class DivisibleBy2And5Not8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 5 == 0 && num % 8 != 0)
            System.out.println("The number satisfies the condition.");
        else
            System.out.println("The number does not satisfy the condition.");
    }
}
