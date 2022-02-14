import java.util.Scanner;
public class main {
    public  static  void main(String[] args){
        double kilo,boy,vki;
        Scanner imp = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = imp.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy = imp.nextDouble();

        vki = kilo/(boy*boy);
        System.out.print("Kilonuz : "+ kilo + "\n" +"Boyunuz : " + boy + "\n" + "Vücut Kile Endeksiniz : "+ vki);
    }
}
