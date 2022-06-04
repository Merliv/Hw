package ödevler;
import java.util.Scanner;

public class boykiloindeks {
    public static void main(String[] args) {
        float boy,kilo,indeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz metre cinsinden:");
        boy = input.nextFloat();
        System.out.println("kilonuzu giriniz kilogram cinsinden cinsinden:");
        kilo = input.nextFloat();
        indeks = kilo/(boy*boy);
        System.out.println("boy kilo indeksiniz:"+indeks);


    }


}
