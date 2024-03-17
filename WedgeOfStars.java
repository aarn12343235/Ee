
import java.util.Scanner;
public class WedgeOfStars {
    public static void main(String[] args) {
        int i, initialStars;

        Scanner scan = new Scanner(System.in);

        System.out.print("Initial number of stars: ");
        initialStars = scan.nextInt();

        i = initialStars;
        while (i >= 1){
            int j = 1;
            while (j <= i) {
                int k = 1;
                while (k <= 10) {
                    System.out.print("*");
                    k++;
                }
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i--;
        }
        scan.close();
    }
}
