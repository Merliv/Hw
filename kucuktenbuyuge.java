package ödevler;
import java.util.Scanner;

public class kucuktenbuyuge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("a degeri : ");
        a = input.nextInt();
        System.out.print("b degeri : ");
        b = input.nextInt();
        System.out.print("c degeri : ");
        c = input.nextInt();
        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c " + a + "," + b + "," + c);
            } else {
                System.out.println("a<c<b " + a + "," + c + "," + b);
            }

        }
        else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c " + b + "," + a + "," + c);
            } else {
                System.out.println("b<c<a " + b + "," + c + "," + a);
            }
        }
        else if ((c < a) && (c < b)) {
                if (a < b) {
                    System.out.println("c<a<b " + c + "," + a + "," + b);
                } else {
                    System.out.println("c<b<a " + c + "," + b + "," + a);
                }
            }


    }
}
