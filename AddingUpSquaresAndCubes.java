
import java.util.Scanner;
public class AddingUpSquaresAndCubes {
    public static void main(String[] args) {
        int i = 1, n, sumOfSquare = 0, sumOfCubes = 0, formulaSquareSum = 0, formulaCubeSum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter upper limit: ");
        n = scan.nextInt();

        while(i <= n){
            sumOfSquare += Math.pow(i, 2);
            sumOfCubes += Math.pow(i, 3);
            i++;
        }
        
        formulaSquareSum = n * (n+1) * (2 * n+1)/6;
        formulaCubeSum = (n * n) * (int)Math.pow(n + 1, 2)/4;

        System.out.println("Explicit summation of square is: " +sumOfSquare);
        System.out.println("Explicit summation of cube is: " +sumOfCubes);
        System.out.println("Formula summation of square is: " +formulaSquareSum);
        System.out.println("Formula summation of cube is: " +formulaCubeSum);
        scan.close();
    }
}
