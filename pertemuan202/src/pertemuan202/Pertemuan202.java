
package pertemuan202;
import javax.swing.JOptionPane;
/**
 *
 * @author INSTIKI
 */
public class Pertemuan202 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //deklarasi variabel
       Double pi,luas;
       int r = 0;
       String nilai="";
       //deskripsi
       pi =3.14;
       
       nilai = JOptionPane.showInputDialog("input nilai jari-jari:");
       r = Integer.parseInt(nilai);
       //proses
       luas = pi * r * r;
       
       //output
       System.out.println("luas lingkaran:"+luas);
    }
    
}
