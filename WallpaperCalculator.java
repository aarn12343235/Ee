
import java.util.Scanner;
public class WallpaperCalculator {
    public static void main(String[] args) {
        final int wallPaperWidth = 27;
        final double wallPaperLength = 4.5;
        int roomWidth, roomLength, numberOfopenings, openingWidth, openingLength, areaOfOpening, totalAreaOfOpenings = 0, roomWallArea, excessStrip = 0;
        int areaOfRoomToBeCovered = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter room width:");
        roomWidth = scan.nextInt();
        System.out.println("Enter room length:");
        roomLength = scan.nextInt();

        roomWallArea = roomLength * roomWidth;

        System.out.println("Enter number of openings: ");
        numberOfopenings = scan.nextInt();
        int i = 1;
        while(i <= numberOfopenings){
            System.out.printf("Enter the width of %d opening:", i);
            openingWidth = scan.nextInt();
            System.out.printf("Enter the length of %d opening: ", i);
            openingLength = scan.nextInt();
            
            areaOfOpening = (openingWidth * openingLength) * 4;
            totalAreaOfOpenings += areaOfOpening;
            i++;
        }
        System.out.println("The total area of your walls are:  " + roomWallArea + " sq.m");
        System.out.println("Total area of openings are: " + totalAreaOfOpenings + " sq.m");

        areaOfRoomToBeCovered = (roomWallArea - totalAreaOfOpenings) / (int)(wallPaperWidth * wallPaperLength);

        System.out.println("Full rolls of wallpaper need to cover the room are: "+ areaOfRoomToBeCovered);

        excessStrip = (roomWidth * 4) / wallPaperWidth;

        System.out.println("Excess strips includes: " + excessStrip + " inches of wallpapers");
        scan.close();
    }   
}
