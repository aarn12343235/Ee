
public class PineTree{
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10){
            int j = i;
            while (j <= 10){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while  (k < i){
                System.out.print("* ");
                k++;
            }
            int l = 1;
            while (l <= i){
                System.out.print("* ");
                l++;
            }
            System.out.println();
            i++;
        }
        
        int a = 1;
        while(a <= 4){
            int b = 1;
            while (b <= 8){
                System.out.print("  ");
                b++;
            }
            int c = 1;
            while (c <= 5){
                System.out.print("* ");
                c++;
            }
            System.out.println();
            a++;
        }
    }
}