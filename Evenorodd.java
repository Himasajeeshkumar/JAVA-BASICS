import java.util.*;
public class  Evenorodd{
    public static void main(String[]args){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("It is an even number");
        }else{
            System.out.println("It is an odd number");
        }
    }
}