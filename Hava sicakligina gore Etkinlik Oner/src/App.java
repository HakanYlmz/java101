import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Haca sicakligini giriniz:  ");
        int heat = input.nextInt();

        boolean kayak = (heat<5)? true:false;
        boolean sinema = ((heat>5)&&(heat<15))? true:false;
        boolean piknik = ((heat>10)&&(heat<25))? true:false;
        boolean yüzme = (heat>25)? true:false;

        if(kayak){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(sinema){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(piknik){
            System.out.println("Piknik yapmaya gidebilirsiniz");
        }
        else if(yüzme){
            System.out.println("Sahile yüzmeye gidebilirsiniz");
        }
        
        
        
    }
}
