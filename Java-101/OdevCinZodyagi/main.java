import  java.util.Scanner;
public class cinzdyaki {
    public static void main(String[] args){
        int yil;
        Scanner inp = new Scanner(System.in);

        System.out.print("LÜtfen doğum yılınızı giriniz : ");
        yil = inp.nextInt();

        if (yil%12 == 0){
            System.out.println("Çin zodyağı burcunuz Maymun");

        }else if (yil%12 == 1){
            System.out.println("Çin zodyağı burcunuz Horoz");

        }else if (yil%12 == 2){
            System.out.println("Çin zodyağı burcunuz Köpek");

        }else if (yil%12 == 3){
            System.out.println("Çin zodyağı burcunuz Domuz");

        }else if (yil%12 == 4){
            System.out.println("Çin zodyağı burcunuz Fare");

        }else if (yil%12 == 5){
            System.out.println("Çin zodyağı burcunuz Öküz");

        }else if (yil%12 == 6){
            System.out.println("Çin zodyağı burcunuz Kaplan");

        }else if (yil%12 == 7){
            System.out.println("Çin zodyağı burcunuz Tavşan");

        }else if (yil%12 == 8){
            System.out.println("Çin zodyağı burcunuz Ejderha");

        }else if (yil%12 == 9){
            System.out.println("Çin zodyağı burcunuz Yılan");

        }else if (yil%12 == 10){
            System.out.println("Çin zodyağı burcunuz At");
        }else if (yil%12 == 11){
            System.out.println("Çin zodyağı burcunuz Koyun");
        }else{
            System.out.println("Lütfen geçerli bir yıl giriniz ...");
        }
    }
}
