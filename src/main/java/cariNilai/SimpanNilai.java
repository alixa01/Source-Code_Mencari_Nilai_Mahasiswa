/* Program Menentukan Nilai Mahasiswa
   Kelompok 3 :
   1. Nicholas Ryan Jonathan - 21343033
   2. Rani Nabilla Putri - 21343034
   3. Alixa Arifya Tofer - 21343040
*/

package cariNilai;

public class SimpanNilai {
    private float nilaiTugas;
    private float nilaiUTS;
    private float nilaiUAS;
    private float nilaiAkhir;
    private String nilaiHuruf;
    
    public SimpanNilai(float nilaiTugas, float nilaiUTS, float nilaiUAS, float nilaiAkhir, String nilaiHuruf){
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = nilaiAkhir;
        this.nilaiHuruf = nilaiHuruf;
    }
    
    public void setNilaiTugas(float nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    public void setNilaiUTS(float nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }
    public void setNilaiUAS(float nilaiUAS){
        this.nilaiUAS = nilaiUAS;
    }
    public void setNilaiAkhir(float nilaiAkhir){
        this.nilaiAkhir = nilaiAkhir;
    }
    public void setNilaiHuruf(String nilaiHuruf){
        this.nilaiHuruf = nilaiHuruf;
    }
    public float getNilaiTugas(){
        return nilaiTugas;
    }    
    public float getNilaiUTS(){
        return nilaiUTS;
    }
    public float getNilaiUAS(){
        return nilaiUAS;
    }
    public float getNilaiAkhir(){
        return nilaiAkhir;
    }
    public String getNilaiHuruf(){
        return nilaiHuruf;
    }
}
