/* Program Menentukan Nilai Mahasiswa
   Kelompok 3 :
   1. Nicholas Ryan Jonathan - 21343033
   2. Rani Nabilla Putri - 21343034
   3. Alixa Arifya Tofer - 21343040
*/
package cariNilai;

import java.util.Scanner; //mengimport scanner

/**
 *
 * @author User
 */
public class IdentitasMHS implements OlahData { //mengimplementasikan interface OlahData
    SimpanIdentitas id = new SimpanIdentitas("", ""); //membuat objek dari kelas SimpanIdentitas
    
    @Override
    public void isiData(){ //meng-override method abstrak isiData dan menggantinya untuk mengisi nama mahasiswa dan nim
        Scanner in = new Scanner(System.in);
              
        System.out.print("Nama Mahasiswa \t: ");
        String nama = in.nextLine(); //mengisi variabel nama dengan scanner
        System.out.print("NIM\t\t: ");
        String nim = in.nextLine(); //mengisi variabel nim dengan scanner
        id.setNamaMahasiswa(nama); //memanggil method untuk mengisi nama mahasiswa dengan modifier private di class SimpanIdentitas
        id.setNIM(nim); //memanggil method untuk mengisi nim dengan modifier private di class SimpanIdentitas
    }
    
    @Override
    public void tampilData(){
       //menampilkan masing-masing data dengan method get yang sesuai
       System.out.println("Nama Mahasiswa \t: " + id.getNamaMahasiswa());
       System.out.println("NIM\t\t: " + id.getNIM()); 
    }
}
