import java.util.Scanner;
public class ucakbileti {
    public static void main(String[] args) {
        int km, yolculukTuru, yas;
        double fiyat, kmUcreti = 0.1, indirimliFiyat = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidiceğiniz yerin mesafesini kilometre türünden giriniz  : ");
        km = inp.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk türü : 1==> Gidiş 2==>Gidiş-dönüş");
        yolculukTuru = inp.nextInt();
        fiyat = km * kmUcreti;
        if (yolculukTuru == 1) {
            if (yas < 12) {
                fiyat = fiyat - (fiyat * (0.5));
            } else if (yas >= 12 && yas < 24) {
                fiyat = fiyat - (fiyat * (0.1));
            } else if (yas >= 65) {
                fiyat = fiyat - (fiyat * (0.5));
            }
            System.out.print("Ödemeniz gereken miktar : " + fiyat);

        } else if (yolculukTuru == 2) {
            if (yas < 12) {
                fiyat = fiyat - (fiyat * (0.5));
                indirimliFiyat = fiyat - (fiyat * (0.2));

            } else if (yas >= 12 && yas < 24) {
                fiyat = fiyat - (fiyat * (0.1));
                indirimliFiyat = fiyat - (fiyat * (0.2));
            } else if (yas >= 65) {
                fiyat = fiyat - (fiyat * (0.5));
                indirimliFiyat = fiyat - (fiyat * (0.2));
            }
            System.out.print("Ödemeniz gereken mikyar : " +(indirimliFiyat*2));
        } else {
            System.out.print("Geçerli Giriş yapılmadı...");

        }


    }
}
