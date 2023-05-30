import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik,toplam;
        double ort;
        System.out.println("Not girisine baslayin ");
        System.out.print("Matamatik : ");
        mat = input.nextInt();
        System.out.print("Fizik : ");
        fizik = input.nextInt();

        System.out.print("Kimya : ");
        kimya = input.nextInt();

        System.out.print("Turkce : ");
        turkce = input.nextInt();

        System.out.print("Tarih : ");
        tarih = input.nextInt();

        System.out.print("Muzik : ");
        muzik = input.nextInt();

        toplam = mat + fizik + kimya+ turkce + tarih + muzik;
        ort = toplam / 6;

        System.out.println("Not ortalamaniz : " + ort);
        System.out.println(ort > 60 ? "Sinifi Gecti" : "Sinifta Kaldı");




    }
}