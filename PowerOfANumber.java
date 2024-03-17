
import java.util.Scanner;
public class PowerOfANumber {
    public static void main(String[] args) {
        double x, power = 1, i = 1, j = 1;
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        x = scan.nextDouble();
        System.out.println("Enter N: ");
        n = scan.nextInt();

        if(n < 0){
            System.out.println("N must be positive integer");
            System.exit(0);
        }
        else{
            while (i <= n){
                while (j <= i) {
                    power *= x;
                    j++;
                }
                i++; 
            }
            System.out.printf("%.2f raised to the power of %d is: %.5f", x, n, power);
        }
        scan.close();
    }
}
