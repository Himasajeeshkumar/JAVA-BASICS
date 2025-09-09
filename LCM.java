import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int gcd = a, m = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int lcm = (a * m) / gcd;
        System.out.println("LCM is: " + lcm);
    }
}

