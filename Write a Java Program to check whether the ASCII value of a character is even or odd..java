import java.util.Scanner;
public class c6{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        char c = obj.next().charAt(0);
        System.out.println((int)c);
    
     if(c%2==0){
         System.out.println("even");
     }
     else
         {
        System.out.println("odd");
     }
}
}
