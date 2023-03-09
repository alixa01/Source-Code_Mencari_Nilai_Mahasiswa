/* Program Menentukan Nilai Mahasiswa
   Kelompok 3 :
   1. Nicholas Ryan Jonathan - 21343033
   2. Rani Nabilla Putri - 21343034
   3. Alixa Arifya Tofer - 21343040
*/

package cariNilai;
import java.util.Scanner;

public class NilaiMHS extends IdentitasMHS {
    SimpanNilai nilai = new SimpanNilai(0, 0, 0, 0, "");
    
    @Override
    public void isiData(){
        float[] tugas = new float[3]; //membuat array untuk beberapa nilai tugas
        float nTugas, nUTS, nUAS, nAkhir;
        int i;
        final int n=3; //membuat konstanta untuk nilai n
        String nHuruf;
        Scanner in = new Scanner(System.in);
        
        for(i=0; i<n; i++){
            System.out.print("Nilai Tugas "+(i+1)+" \t: "); //mengisi nilai tugas satu per satu 
            tugas[i] = in.nextFloat();     //mengisi array tugas dengan indeks ke-i                   
        }                                                    
        System.out.print("Nilai UTS \t: ");
        nUTS = in.nextFloat();  //mengisi variabel nUTS
        System.out.print("Nilai UAS \t: ");
        nUAS = in.nextFloat(); //mengisi variabel nUAS
        nTugas = cariNTugas(tugas, n); //mengisi variabel nTugas dengan menggunakan method ini dan parameter tugas dan n 
        nAkhir = cariNAkhir(nTugas, nUTS, nUAS); //mengisi variabel nAkhir dengan menggunakan method ini dan parameter nTugas, nUTS, dan nUAS
        nHuruf = cariNHuruf(nAkhir); //mengisi variabel nHuruf dengan menggunakan method ini dan parameter nAkhir
        //kode di bawah untuk mengisi variabel tertentu dengan 
        //parameter tertentu melalui method tertentu di class SimpanNIlai
        nilai.setNilaiTugas(nTugas); 
        nilai.setNilaiUTS(nUTS);
        nilai.setNilaiUAS(nUAS);
        nilai.setNilaiAkhir(nAkhir);
        nilai.setNilaiHuruf(nHuruf);
    }
    
    public float cariNTugas(float[] tugas, int n){
        float rerataTGS=0;
        int i;
        
        for(i=0; i<n; i++){
            rerataTGS += tugas[i]; //menjumlahkan nilai semua tugas di array tugas
        }
        rerataTGS = rerataTGS/n; //membagi nilai tugas dengan jumlah tugas (n)
        
        return rerataTGS; //mengembalikan nilai rerataTGS ke yang memanggil
    }
    public float cariNAkhir(float i, float j, float k){
        float Akhir;
        //i = nTUgas, j = nUTS, k = nUAS
        Akhir = (i + j + k) / 3; //menentukan nilai Akhir dengan cara ini
        return Akhir;
    }
    
    public String cariNHuruf(float nAkhir){
        //mencari nilai huruf dengan mengembalikan hruuf yang sesuai dengan kondisi
        if ((nAkhir >= 90.0) && (nAkhir <= 100.0)){
            return "A";
        }
        else if ((nAkhir >= 80.0) && (nAkhir < 90.0)){
            return "B";
        }
        else if ((nAkhir >= 70.0) && (nAkhir < 80.0)){
            return "C";
        }
        else if ((nAkhir >= 60.0) && (nAkhir < 70.0)){
            return "D";
        }
        else if ((nAkhir >= 0.0) && (nAkhir < 60.0)){
            return "E";
        }
        else{
            return null;
        }
    }

    @Override
    public void tampilData(){
        //menampilkan masing-masing data dengan method get yang sesuai
        System.out.println("Nilai Tugas\t: "+ nilai.getNilaiTugas());
        System.out.println("Nilai UTS\t: "+ nilai.getNilaiUTS());
        System.out.println("Nilai UAS\t: "+ nilai.getNilaiUAS());
        System.out.println("Nilai Akhir\t: "+ nilai.getNilaiAkhir());
        System.out.println("Nilai huruf\t: "+ nilai.getNilaiHuruf());
    }
}