import java.util.Scanner;

public class AddingUpIntegers {
    public static void main(String[] args) {
        int inputLimit, inputNumber, i = 1, sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers will be added:");
        inputLimit = scan.nextInt();

        while(i <= inputLimit){
            System.out.println("Enter an integer:");
            inputNumber = scan.nextInt();
            sum += inputNumber;
            i++;
        }
        System.out.println("The sum is " + sum);
        scan.close();
    }
}
