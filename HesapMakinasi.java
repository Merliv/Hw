package ödevler;


import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int number1,number2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        number1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        number2 = input.nextInt();
        System.out.print("toplama icin 1 cikarma icin 2 carpma icin 3 bolme icin 4 u tuslayin: ");
        select = input.nextInt();
        switch (select){
            case (1):
                System.out.println("toplama isleminizin sonucu = "+ (number1+number2));
                break;
            case (2):
                System.out.println("cikarma isleminizin sonucu = "+ (number1-number2));
                break;
            case (3):
                System.out.println("carpma isleminizin sonucu = "+ (number1*number2));
                break;
            case (4):
                switch(number2){
                    case(0):
                        System.out.println("bolen 0 olamaz");
                        break;
                    default:
                        System.out.println("bolme isleminizin sonucu = "+ (number1/number2));
                        break;


                }


        }
    }





}
