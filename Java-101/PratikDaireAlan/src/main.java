import java.util.Scanner;
public class main {
    public  static void main(String[] args){
        double PI=3.14,r,alan,alan2,cevre;
        int alfa;
        Scanner imp = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz : ");
        r = imp.nextInt();
        System.out.print(("İlgili açıyı giriniz : "));
        alfa = imp.nextInt();
        alan2 = (PI*(r*r)*alfa)/360;
        alan = PI * (r*r);
        cevre = 2*PI*r;
        System.out.print( "İlgili Üçgelenin \n" + "Yarıçap : " + r +"\n" +
                "Çevresi : " + cevre + "\n" +"Yarıçaptan gelen alan : " + alan + "\n" +alfa +" Açısına denk gelen alan : " + alan2);

    }
}
