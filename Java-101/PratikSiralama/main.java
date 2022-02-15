import java.util.Scanner;
public class siralama {
    public static void main(String[] args){
        int sayi1 , sayi2 , sayi3, enbuyuk;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        sayi1 = inp.nextInt();

        System.out.print("Sayi giriniz : ");
        sayi2 = inp.nextInt();

        System.out.print("Sayi giriniz : ");
        sayi3 = inp.nextInt();
        if(sayi1>sayi2 && sayi1>sayi3){
            if(sayi2>sayi3){
                System.out.println(" Sayı1>Sayı2>Sayı3");
            }else{
                System.out.println(" Sayı1>Sayı2>Sayı3");
            }
        }else if (sayi2>sayi1 && sayi2>sayi3){
            if(sayi1>sayi3){
                System.out.println(" Sayı2>Sayı1>Sayı3");
            }else{
                System.out.println(" Sayı2>Sayı3>Sayı1");
            }
        }else{
            if(sayi1>sayi2){
                System.out.println(" Sayı3>Sayı1>Sayı2");
            }else{
                System.out.println(" Sayı3>Sayı2>Sayı1");
            }
        }
    }

}
