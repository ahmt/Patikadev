import java.util.Scanner;
public class oneriler {
    public static  void main(String[] args){
        int sicaklik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen hava sıcaklığını giriniz : ");
        sicaklik = inp.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak yapmak güzel bir seçenek..");
        }else if(sicaklik >= 5 && sicaklik <15){
            System.out.println("Sinemaya  gidebilirsin ... ");
        }else if(sicaklik >= 15 && sicaklik<25){
            System.out.println("Pikniğe gidebilirsin ...");
        }else {
            System.out.println("Yüzmeye gidebilirsin ..");
        }
    }
}
