import  java.util.Scanner;
public class main {
    public  static void main(String[] args){
        double armutKg = 2.14 , elmaKg =3.67 , domatesKg = 1.1, muzKg = 0.95, patlicanKg = 5.00;
        double armut, elma, domates ,muz, patlican, toplam;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        armut = inp.nextDouble();

        System.out.print("Elma kaç kilo : ");
        elma = inp.nextDouble();

        System.out.print("Domates kaç kilo : ");
        domates = inp.nextDouble();

        System.out.print("Muz kaç kilo : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        patlican = inp.nextDouble();

        toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);

        System.out.print("Manav Sepeteiniz \n" + "Armut : "+ armut +" kg \n" + "Elma : " + elma +" kg \n" +
                "Domates : " + domates + " kg \n" + "Patlıcan : " + patlican + " kg \n" + "Toplam tutar : " + toplam + " Türk Lirası");

    }
}
