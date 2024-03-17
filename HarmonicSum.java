
import java.util.Scanner;

public class HarmonicSum{
    public static void main(String[] args) {
        int n, i = 1;
        double sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        n = scan.nextInt();

        while (i <= n){
            sum += 1.0/i;
            i++; 
        }
        System.out.println("\n" + sum);
        scan.close();
    }
}