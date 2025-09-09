import java.util.Scanner;

public class Largestfromthree {
       public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        System.out.println("Enter your third number");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("The greatest number is: " +a);
        } else if (b >= a && b >= c) {
            System.out.println("The greatest number is: " +b);
        } else {
            System.out.println("The greatest number is: " +c);
        }
    }
}

    
