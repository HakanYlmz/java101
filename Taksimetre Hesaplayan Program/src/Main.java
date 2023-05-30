import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km,statPrice = 10;
        double perKm = 2.20 , total;
        Scanner input = new Scanner(System.in);
        System.out.println("Toplam gidilem mesafeyi Kn cinsinden giriniz");
        km = input.nextInt();
        total = perKm * km;
        total += statPrice;
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam ucretiniz : " + total);
    }
}