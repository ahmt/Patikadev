import java.util.Scanner;
public class artikyil {
    public static void main(String[] args){
        int yil;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        yil = inp.nextInt();

        if(yil%4 == 0){
            System.out.println(yil +" Yılı Artık yıldır.");
        }else{
            System.out.println(yil +" Yılı  Artık yıl değildir.");

        }

    }
}
