import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;
public class main {
    public  static void main(String[] args){
        int sayi1,sayi2,control;
        float bolmeSonuc;


        Scanner inp = new Scanner(System.in);

        System.out.print("İlk Sayıyı Girini : ");
        sayi1 = inp.nextInt();

        System.out.print("İkinci Sayıyı Girini : ");
        sayi2 = inp.nextInt();

        System.out.print("Toplama için 1 \n  Çıkartma için 2  \n  Çarpma İçin 3 \n Bölme İçin 4 \n Sayısını giriniz..");
        control = inp.nextInt();
        bolmeSonuc =  (sayi1/sayi2);
        if ( sayi1 != 0 && sayi2 != 0){
        switch (control){
            case 1 : System.out.println("Sayıların toplamı : " + (sayi1+sayi2));
            break;
            case 2: System.out.println("Sayi1 - Sayı2 : " + (sayi1-sayi2));
            break;
            case 3: System.out.println("Sayıların çarpımı : " + sayi1*sayi2);
            break;
            case 4: System.out.println("Sayı1 Bölü Sayı2 : " + bolmeSonuc);
            break;
            default: System.out.println("Lütfen geçerli giriş yapınız..");


        }}
        else{
            System.out.println("Girdiler Geçersizdir .. .");
        }
    }
}
