import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {

    Scanner scan = new Scanner( System.in );
    int value;           
    int sum = 0;           

    System.out.print( "Enter first integer (enter 0 to quit): " );
    value = scan.nextInt();
    if (value == 0){
        System.out.println("No integers were entered.");
    }
    else{
        while ( value != 0 ){

        sum = sum + value;

        System.out.print( "Enter next integer (enter 0 to quit):" );
        value = scan.nextInt();      
        }
    System.out.println( "Sum of the integers: " + sum );
    }
    System.out.println("bye");
    scan.close();
    }
}
