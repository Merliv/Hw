package ödevler;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password,kayitlipassword,yenisifre;
        int sifreonay;
        kayitlipassword = "Ase";
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        System.out.print("Kullanici adiniz : ");
        username = input.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        password = input.nextLine();


        if (username.equals("Sea") && password.equals(kayitlipassword)){
            System.out.println("giris yaptiniz ");

        }
        else {
            System.out.println("giris yapamadiniz");
            System.out.print("sifrenizi degistirmek isterseniz 1 e basiniz : ");
            sifreonay = input.nextInt();
            if (sifreonay == 1){
                System.out.print("yeni sifreyi girin: ");
                yenisifre = input1.nextLine();

                if (yenisifre.equals(kayitlipassword) || yenisifre.equals(password)){
                    System.out.print("baska sifre deneyiniz");

                }
                else {
                    System.out.println("sifre degistirme islemi basrili byyy");
                }
                }
            else {
                System.out.println("okay byyy");

            }


            }
    }
}
