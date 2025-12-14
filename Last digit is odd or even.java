import java.util.Scanner;
class LastDigitOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = Math.abs(n % 10);
        if (last % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
