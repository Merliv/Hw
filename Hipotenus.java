package ödevler;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int kenar1,kenar2;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk kenari giriniz:");
        kenar1 = input.nextInt();
        System.out.print("ikinci kenari giriniz:");
        kenar2 = input.nextInt();
        double hipo = Math.pow(kenar1*kenar1+kenar2*kenar2,0.5);
        double u = (hipo+kenar1+kenar2)/2;
        double alan = Math.pow(u*(u-kenar1)*(u-kenar2)*(u-hipo),0.5);
        System.out.println(alan);


    }
}
