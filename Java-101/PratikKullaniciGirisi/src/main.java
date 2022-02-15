import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String kullaniciadi, password;
        int a;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        kullaniciadi = inp.nextLine();

        System.out.print("Lütfen Şifrenizi giriniz : ");
        password = inp.nextLine();

        System.out.println(" first pass"+password);
        if(kullaniciadi.equals("java101") && password.equals("123456")){
            System.out.print("Sisteme giriş başarılı ...");

        }else {
            System.out.print("Kullanıcı Adı veya Şifre yanlış ..");
            System.out.println("Şifreyi sıfırlamak için 1 girişi yapınız");
            a = inp.nextInt();
            if( a == 1){
                System.out.print("Yeni şifreinizi giriniz : ");
                password = inp.nextLine();
                System.out.println("  pass"+password);
                if(password.equals("123456")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    password = inp.nextLine();
                }else{
                    System.out.println("Şifre oluşturuldu .");

                }
            }

        }
        System.out.println(" last pass"+password);
    }

}
