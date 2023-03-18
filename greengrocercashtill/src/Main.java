import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  double armut, elma, domates, muz, patlıcan;
  double armutP=2.14;
        double elmaP=3.67;
        double domatesP = 1.11;
        double muzP=0.95;
        double  patlıcanP=5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armut=scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma=scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates=scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz=scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlıcan=scanner.nextDouble();

        double total =(patlıcanP*patlıcan)+(armutP*armut)+(elmaP*elma)+(domatesP*domates)+(muzP*muz);
        System.out.println("Toplam Tutar :"+total);





    }
}