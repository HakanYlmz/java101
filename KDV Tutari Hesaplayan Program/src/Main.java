import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvOran, kdvTutari,kdvliFiyat;
        int kdvsizFiyat;

        System.out.print("Ücret tutarını giriniz : ");
        kdvsizFiyat = input.nextInt();
        kdvOran = (kdvsizFiyat<=1000 & kdvsizFiyat>0) ? 0.18 : 0.08;
        
        kdvTutari = kdvsizFiyat * kdvOran;
        System.out.println("Kdv Tutari : " + kdvTutari);
        kdvliFiyat = kdvTutari + kdvsizFiyat;
        System.out.println("Kdvli fiyati"+kdvliFiyat);



    }
}