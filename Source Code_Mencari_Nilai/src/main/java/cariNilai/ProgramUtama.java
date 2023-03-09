/* Program Menentukan Nilai Mahasiswa
   Kelompok 3 :
   1. Nicholas Ryan Jonathan - 21343033
   2. Rani Nabilla Putri - 21343034
   3. Alixa Arifya Tofer - 21343040
*/

package cariNilai;
import java.util.Scanner;
public class ProgramUtama {
    public static void main(String[] args) {
        int i, n;
        Scanner in = new Scanner(System.in);
        
        //membuat masing-masing objek dari kelas berikut
        ProgramUtama prog = new ProgramUtama();
        IdentitasMHS id = new IdentitasMHS();
        NilaiMHS nilai = new NilaiMHS();
        
        prog.namaProgram(); //memanggil method ini dari objek ini
        System.out.print("Jumlah mahasiswa ? ");
        n = in.nextInt(); //mengisi nilai n
        
        for(i=0; i<n; i++){
            System.out.println("==================================================");
            id.isiData(); //memanggil method ini dari objek ini
            nilai.isiData(); //memanggil method ini dari objek ini
            System.out.println("==================================================");
            id.tampilData(); //memanggil method ini dari objek ini
            nilai.tampilData(); //memanggil method ini dari objek ini
        }
        prog.akhirProgram(); //memanggil method ini dari objek ini
    }
    public void namaProgram(){
        System.out.println("==================================================");
        System.out.println("\tProgram Menentukan Nilai Mahasiswa\t");
        System.out.println("==================================================");
        System.out.println("Kelompok 3 :");
        System.out.println("1. Nicholas Ryan Jonathan - 21343033");
        System.out.println("2. Rani Nabilla Putri - 21343034");
        System.out.println("3. Alixa Arifya Tofer - 21343040");
        System.out.println("==================================================");
     }
    public void akhirProgram(){
        System.out.println("==================================================");
        System.out.println("Terima Kasih !!!");
    }
}