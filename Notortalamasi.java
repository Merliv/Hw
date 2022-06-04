package ödevler;
import java.util.Scanner;

public class Notortalamasi {
    public static void main(String[] args) {
        int mat,tur,kim,muz,fiz,tar;
        Scanner input = new Scanner(System.in);
        System.out.print("Kimya Notunuz:");
        kim = input.nextInt();
        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        System.out.print("Turkce Notunuz:");
        tur = input.nextInt();
        System.out.print("Muzik Notunuz:");
        muz = input.nextInt();
        System.out.print("Tarih Notunuz:");
        tar = input.nextInt();
        System.out.print("Fizik Notunuz:");
        fiz = input.nextInt();

        float ort = (kim + mat + tur + muz + fiz + tar)/6;
        String b ;
        b = (ort >= 60) ? "Gecti":"Kaldi";
        System.out.println(b);

        System.out.println("Ortalamanız: "+ort);



    }
}
