import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2 , select ;
        System.out.print("ilk sayiyi giriniz:  ");
        number1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz:  ");
        number2 = input.nextInt();
        System.out.println("1- Toplama \n 2- Cikarma \n 3- Bolme \n 4- Carpma");
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("iki rakamin toplami" + (number1 + number2));
                break;
            case 2:
                System.out.println("iki rakamin farki " + (number1 - number2));
                break;
            case 3:
                if(number2 == 0){
                    System.out.println("Sayı sifira bolunemez");
                }
                else {
                    System.out.println("iki rakamin bolumu" +((float)number1 / (float)number2));
                }
                break;
            case 4:
                System.out.println("iki rakamin carpimi " + (number1 * number2));
                break;
            default:
                System.out.println("Yanlis secim yaptiniz tekrar deneyin");
        }



    }
}