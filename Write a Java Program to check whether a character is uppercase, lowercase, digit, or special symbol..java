import java.util.Scanner;
public class c6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println((int)c);
    
     if(c=='A'||c=='Z'){
              System.out.println("Uppercase");
     }else if
         ( c=='a'||c=='z'){
        System.out.println("Lowercase");
     }
     else if
      (c=='1'||c=='9'){
        System.out.println("Digit");
}
    else 
    {
        System.out.println("Special symbol");
    }
}
}
