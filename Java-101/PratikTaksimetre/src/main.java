import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int km,acilis =10,minumum =20;
        double kmUcreti =2.2,total;
        Scanner imp = new Scanner(System.in);
        System.out.print("Gideceğiniz Km bilgisini giriniz : ");
        km = imp.nextInt();
        total = acilis+(km*kmUcreti);
        System.out.print("Toplam Ücret : " + (total >= minumum ? total : "20") + " Türk Lirası");

    }
}
