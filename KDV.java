package ödevler;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyati giriniz: ");
        float fiyat = input.nextFloat();
        float sonfiyat = (fiyat> 0 && fiyat < 1000)? fiyat*118/100 : fiyat*108/100;
        System.out.println("Son fiyat: "+sonfiyat);

    }
}
