
package pertemuan201;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Reza syarwani
 * TGL: 15 Maret 2025
 */
public class Pertemuan201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mhs = "Masrun";
        String nim = "2301010183";
        
        
        BufferedReader dtin = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("membaca input kaybord");
        try{
            System.out.print("input Nama: ");
            mhs =dtin.readLine();
            
             System.out.println("input Nim: ");
             nim =dtin.readLine();
             
        }catch(IOException e ){
            System.out.println("EROR");
        }
        System.out.printf("Mahasiswa dengan nama %s, Memiliki nim %s",mhs,nim);
    }
    
}
