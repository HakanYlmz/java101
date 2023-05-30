import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,aci;
        double alan,cevre,pi = 3.14;
        System.out.print("Yaricapini giriniz");
        r = input.nextInt();
        alan = pi *r*r;
        cevre = 2 * pi * r;
        System.out.println("Ucgenin çevresi : " + cevre);
        System.out.println("Toplama Alan : " + alan);

        System.out.print("Alamak istediğiniz alanın açı değerini giriniz : ");
        aci = input.nextInt();
        alan = (pi * (r*r)* aci)/360;
        System.out.println("Daire diliminin alani " + alan);
    }
}