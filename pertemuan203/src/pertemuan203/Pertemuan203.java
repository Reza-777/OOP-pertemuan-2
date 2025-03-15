package pertemuan203;
import java.util.Scanner;
/**
 *
 * @author INSTIKI
 */
public class Pertemuan203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        //deklarasi variabel
        Double pi, luas;
        int r = 0;
        String nilai="";
        //deskripsi
        pi = 3.14;
        
        System.out.println("hitung luas lingkaran");
        System.out.println("Input nilai jari-jari:");
        nilai = dtain.nextLine();
        r = Integer.parseInt(nilai);
        //proses
        luas = pi * r * r ;
        
        //output
        System.out.println("luas lingkaran: "+luas);
        
    }
    
}
