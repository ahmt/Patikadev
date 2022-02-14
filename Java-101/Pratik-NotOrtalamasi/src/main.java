import  java.util.Scanner;
public class main {
    public static  void main(String[] args){
        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner imp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girini :");
        matematik = imp.nextInt();
        System.out.println(matematik);

        System.out.print("Fizik Notunuzu Girini :");
        fizik = imp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuzu Girini :");
        kimya = imp.nextInt();
        System.out.println(kimya);

        System.out.print("Türkçe Notunuzu Girini :");
        turkce = imp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuzu Girini :");
        tarih = imp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik Notunuzu Girini :");
        muzik = imp.nextInt();
        System.out.println(muzik);

        double sonuc = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print(sonuc >60 ? "Sınıfı geçti"  : "Sınıfı kaldı");
    }
}
