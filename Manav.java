package ödevler;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double elma,armut,domates,muz,patlican,toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("alinan elma kilosu:");
        elma = input.nextFloat();
        System.out.print("alinan armut kilosu:");
        armut = input.nextFloat();
        System.out.print("alinan domates kilosu:");
        domates = input.nextFloat();
        System.out.print("alinan muz kilosu:");
        muz = input.nextFloat();
        System.out.print("alinan patlican kilosu:");
        patlican = input.nextFloat();
        toplam = armut*2.14 + elma*3.67 + domates*1.11 + muz*0.95 + patlican*5;
        System.out.print("Toplam odenecek tutar:"+ toplam + " Tl");

    }
}
