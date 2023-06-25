import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String userName = "patika";
        String password = "java123";
        Scanner input = new Scanner(System.in);
        
        System.out.print("UserName giriniz:  ");
        String inputUserName = input.nextLine();

        System.out.print("Password giriniz:  ");
        String inputPassword = input.nextLine();

        if(userName.equals(inputUserName)){
            if(password.equals(inputPassword)){
                System.out.println("Hosgeldin"); 
            }
            else {
                System.out.println("Sifreniz yanlis değistirmek istiyorsaniz 1 istermiyorsaniz 2 giriniz");
                String choose = input.nextLine();
                if(choose.equals("1")){
                     System.out.println("Degistirmek istediginiz sifreyi giriniz");
                     String newPassword = input.nextLine();
                     if(newPassword.equals(password)){
                        System.out.println("Daha once kullanmadiginiz bir sifre seciniz");
                     }
                     else{
                        password = newPassword;
                        System.out.println("Yeni sifreniz " + " "+password);
                     }

                }
                
            }
        }
        else{
            System.out.println("UserName yanlis");
        }
        

    }
}
