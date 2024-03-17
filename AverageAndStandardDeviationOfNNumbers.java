
import java.util.Scanner;

public class AverageAndStandardDeviationOfNNumbers {
    public static void main(String[] args) {
        int i = 1, numberOfValues;
        double inputValues = 0, averageSum = 0, averageSquare = 0, avg, avgSquare, SD;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of values:");
        numberOfValues = scan.nextInt();

        while(i <= numberOfValues){
            System.out.print("Enter value: ");
            inputValues = scan.nextDouble();
            
            averageSum += inputValues;
            averageSquare += (inputValues * inputValues);
            i++;
        }
        
        System.out.println(averageSum + "\t" + averageSquare);
        avg = averageSum / 4.0;
        avg = avg * avg;
        avgSquare = averageSquare / 4.0;

        SD = Math.sqrt(avgSquare - avg);

        System.out.printf("Standard Deviation is: %.10f",  SD);

        scan.close();
    }
}
