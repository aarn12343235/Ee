import java.util.Scanner;
public class JetLagCalculator {
    public static void main(String[] args) {
        double hours, zones, depart, arrive, recoveryTime;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of ours travled:");
        hours = scan.nextDouble();
        System.out.println("Enter number of time zones crossed:");
        zones = scan.nextDouble();
        System.out.println("Enter departure time: ");
        depart = scan.nextDouble();
        
        if(depart > 8 && depart < 12)
            depart = 0;
        else if (depart > 12 && depart < 18)
            depart = 1;
        else if (depart > 18 && depart < 22)
            depart = 3;
        else if (depart > 22 && depart < 1)
            depart = 4;
        else if (depart > 1 && depart < 8)
            depart = 5;

        System.out.println("Enter arrival time:");
        arrive = scan.nextInt();
        if(arrive > 8 && arrive < 12)
            arrive = 4;
        else if (arrive > 12 && arrive < 18)
            arrive = 2;
        else if (arrive > 18 && arrive < 22)
            arrive = 0;
        else if (arrive > 22 && arrive < 1)
            arrive = 1;
        else if (arrive > 1 && arrive < 8)
            arrive = 3;

        recoveryTime = (hours/2 + (zones-3) + depart + arrive)/10;
        System.out.println("Number of days needed for recovery is: " + recoveryTime + " days");
        scan.close();
    }
}
