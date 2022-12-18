import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ters üçgen kaç satır olcak yazınız");
        line = input.nextInt();

        for (int i = 0; i < line; i++) {
            for (int k=0 ;k<i;k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=(line*2-1-2*i);j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}