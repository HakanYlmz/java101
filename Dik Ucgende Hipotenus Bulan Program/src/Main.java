import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        double c,alan, cevresi;
        Scanner input = new Scanner(System.in);
        System.out.println("A kenari giriniz : ");
        a = input.nextInt();
        System.out.println("B kenari giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("C kenari " + c);

        cevresi = a + b + c;
        System.out.println("Ucgen cevresi " + cevresi);
        cevresi = cevresi  /2;
        alan = Math.sqrt(cevresi * (cevresi - a)*(cevresi - b)*(cevresi - c));
        System.out.println("Ucgen alani : " + alan);


    }
}