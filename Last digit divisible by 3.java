import java.util.Scanner;
class LastDigitDivBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = Math.abs(n % 10);
        if (last % 3 == 0)
            System.out.println("Divisible by 3");
        else
            System.out.println("Not divisible by 3");
    }
}
