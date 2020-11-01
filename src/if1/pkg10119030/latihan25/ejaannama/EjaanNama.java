package if1.pkg10119030.latihan25.ejaannama;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class EjaanNama{
    static final Scanner scan = new Scanner(System.in);
    String nama;

    private void masukkanNamaDepan(){
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
    }

    private void tampilEjaanNama(){
        System.out.println("\n Ejaan untuk \""+nama+"\" adalah : ");
        int num = 1;
        for (char ejaan : nama.toCharArray()){
            System.out.println("Huruf ke-"+(num++)+" : "+ejaan);
        }
    }

    public static void EjaanNama(String[] args) {
        EjaanNama data = new EjaanNama();
        data.masukkanNamaDepan();
        data.tampilEjaanNama();
        System.out.println("Developed by : Rendy Dermawan");
    }
}
