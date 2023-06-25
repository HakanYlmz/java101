import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        List<Integer> notlar = new ArrayList<Integer>();
        
        System.out.println("Matematik notunu girin");
        int mat = input.nextInt();
        if((mat>0) && (mat<100)){
            notlar.add(mat);
        }
        System.out.println(notlar.size());

        System.out.println("Fizik notunu girin");
        int fizik = input.nextInt();
        if((fizik>0) && (fizik<100)){
            notlar.add(fizik);
        }
       

        System.out.println("Turkce notunu girin");
        int turkce = input.nextInt();
        if((turkce>0) && (turkce<100)){
            notlar.add(turkce);
        }
        



        System.out.println("Kimya notunu girin");
        int kimya = input.nextInt();
        if((kimya>0) && (kimya<100)){
            notlar.add(mat);
        }
        


        System.out.println("Muzik notunu girin");
        int muzik = input.nextInt();
        if((muzik>0) && (muzik<100)){
            notlar.add(muzik);
        }
        
        
        int sum = 0;
        for(int i=0;i<notlar.size();i++){
            sum = sum + notlar.get(i);
        }
        double avg = sum/notlar.size();


        System.out.println("Ortalama puaniniz:  " + avg);
        String sonuc = (avg>55)? "Tebrikler sinifi gectiniz":"Malesef Kaldin";
        System.out.println(sonuc);


    }
}
