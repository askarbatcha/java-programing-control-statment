import java.util.Scanner;
class SmallestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b)
            System.out.println("Smallest: " + a);
        else
            System.out.println("Smallest: " + b);
    }
}
