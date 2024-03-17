import java.util.Scanner;

public class MilesPerGallon{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialMiles = 0, finalMiles, gallon;
        double milesPerGallon;

        System.out.println("Miles Per Gallon Program");
        while (initialMiles >= 0){
            System.out.println("Initial Miles:");
            initialMiles = scan.nextInt();
            if(initialMiles < 0){
                System.out.println("bye");
                System.exit(0);
            }
            System.out.println("Final Miles:");
            finalMiles = scan.nextInt();
            System.out.println("Gallons");
            gallon = scan.nextInt();

            milesPerGallon = (finalMiles - initialMiles) / gallon;

            System.out.println("Miles per gallon: " + milesPerGallon);
            System.out.println();
        }
       scan.close();
    }
}