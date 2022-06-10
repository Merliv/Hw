package ödevler;
import java.util.Scanner;

public class etkinlik_öneri {
    public static void main(String[] args) {
        int derece;
        Scanner input = new Scanner(System.in);
        System.out.print("Dereceyi giriniz : ");
        derece = input.nextInt();
        switch (derece){
            case(5):
                System.out.println("kayak veya sinema git");
                break;
            case(15):
                System.out.println("sinema veya piknik git");
                break;
            case(25):
                System.out.println("piknik veya yüzme git");
                break;
            default:
                if (derece<5){
                    System.out.println("kayaga git");
                }
                else {
                    if (derece >25 ){
                        System.out.println("yuzmeye git");
                    }
                    else {
                        if (derece <10) {
                            System.out.println("sinemaya git");
                        }
                        else {
                            System.out.println("piknige git");
                        }

                    }

                }

        }


        }

    }

