import java.util.Scanner;
public class main {
    public  static void main(String[] args){
        int kdv,kdvsizFiyat;
        double fiyat,vergi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen KDVsiz miktarı girin");
        kdvsizFiyat = inp.nextInt();
        kdv = kdvsizFiyat>999 ? 8 : 18;
        vergi = (kdvsizFiyat*kdv)/100;
        fiyat = kdvsizFiyat+vergi;

        System.out.println("Kdvsiz Fiyat : " + kdvsizFiyat +"\n" + "Vergi Miktarı : " +  "%" +kdv + "\n" +"Kdv : " + vergi + "\n" + "Fiyat : " + fiyat );

    }

}
