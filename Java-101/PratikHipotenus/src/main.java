import java.util.Scanner;
public class main {
    public static  void main (String[] args){
        int aKenari,bKenari;
        double hipotenus,cevre,alan;
        Scanner inp = new Scanner(System.in);
        System.out.print("A kenarını giriniz : ");
        aKenari = inp.nextInt();
        System.out.print("B kenarını giriniz : ");
        bKenari = inp.nextInt();
        hipotenus = Math.sqrt((aKenari*aKenari)+(bKenari*bKenari));
        alan = (aKenari*bKenari)/2;
        cevre = aKenari+bKenari+hipotenus;
        System.out.print( "Girilen Üçgenin \n" + "Hipotenüsü : " +hipotenus +"\n" + "Alanı : " + alan + "\n" + "Çevresi : " + cevre);


    }
}
