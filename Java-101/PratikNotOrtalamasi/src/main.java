import java.util.Scanner;
public class main {
    public  static  void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girini : ");
        mat = inp.nextInt();


        System.out.print("Fizik Notunuzu Girini : ");
        fizik = inp.nextInt();


        System.out.print("Kimya Notunuzu Girini : ");
        kimya = inp.nextInt();


        System.out.print("Türkçe Notunuzu Girini : ");
        turkce = inp.nextInt();


        System.out.print("Tarih Notunuzu Girini : ");
        tarih = inp.nextInt();


        System.out.print("Müzik Notunuzu Girini : ");
        muzik = inp.nextInt();


        double ortalama = ( mat + fizik + kimya + turkce + tarih + muzik)/6;

        System.out.println(ortalama > 60 ? "Sınıfı geçti" : "Sınıfta kaldı");

    }
}
