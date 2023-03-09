/* Program Menentukan Nilai Mahasiswa
   Kelompok 3 :
   1. Nicholas Ryan Jonathan - 21343033
   2. Rani Nabilla Putri - 21343034
   3. Alixa Arifya Tofer - 21343040
*/

package cariNilai;

public class SimpanIdentitas {
    private String namaMahasiswa;
    private String NIM;
    
    public SimpanIdentitas(String namaMahasiswa, String NIM){
        this.namaMahasiswa = namaMahasiswa;
        this.NIM = NIM;
    }
    
    public void setNamaMahasiswa(String namaMahasiswa){
        this.namaMahasiswa = namaMahasiswa;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public String getNamaMahasiswa(){
        return namaMahasiswa;
    }
    public String getNIM(){
        return NIM;
    }  
}