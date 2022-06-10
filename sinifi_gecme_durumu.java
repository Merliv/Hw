package ödevler;
import java.util.Scanner;

public class sinifi_gecme_durumu {
    public static void main(String[] args) {
        int turk,mat,fiz,kim,muz;
        Scanner input = new Scanner(System.in);
        System.out.print("turkce notunuz : ");
        turk = input.nextInt();
        if (turk < 0 || turk > 100){
            turk = 0;}
        System.out.print("matematik notunuz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100){
            mat = 0;}
        System.out.print("muzik notunuz : ");
        muz = input.nextInt();
        if (muz < 0 || muz > 100){
            muz = 0;}
        System.out.print("kimya notunuz : ");
        kim = input.nextInt();
        if (kim < 0 || kim > 100){
            kim = 0;}
        System.out.print("fizik notunuz : ");
        fiz = input.nextInt();
        if (fiz < 0 || fiz > 100){
            fiz = 0;}
        double average = (fiz + kim + mat+turk+muz)/5;
        if (average<55){
            System.out.println("kaldiniz");
        }
        else{
            System.out.println("gectiniz");
        }
        System.out.println("ortalamaniz: "+average);
    }
}
