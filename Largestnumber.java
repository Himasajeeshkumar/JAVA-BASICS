import java.util.*;

public class Largestnumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The greatest number is "+ a);
        }else{
            System.out.println("The greatest number is "+ b);
        }
    }
}
