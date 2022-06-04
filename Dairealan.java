package ödevler;
import java.util.Scanner;

public class Dairealan {
    public static void main(String[] args) {
        double aci,yaricap,dilim;
        Scanner input = new Scanner(System.in);
        System.out.print("Aciyi girin:");
        aci = input.nextFloat();
        System.out.print("Yaricapi girin:");
        yaricap = input.nextFloat();
        dilim = (3.14 * yaricap * yaricap * aci)/360;
        System.out.println("dilim:"+ dilim);

    }
}
