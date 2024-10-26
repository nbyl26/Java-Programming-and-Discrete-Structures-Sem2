package contohUts;

public class Pegawai {
    private String nama;
    private int idPegawai;
    private String tugas;
    private double gaji;

    public Pegawai(String nama, int idPegawai ) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = getGaji();
        this.tugas = getTugas();
    }
    public int getIdPegawai() {
        return idPegawai;
    }
    public void setIdPegawai(int idPegawai){
        this.idPegawai = idPegawai;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    
    public double getGaji() {
        if(this.idPegawai == 1){
            return 7;
        } else if(this.idPegawai == 2){
            return 1;
        } else if(this.idPegawai == 3){
            return 2;
        } else if(this.idPegawai == 4) {
            return 1;
        } else{
            return 1;
        }
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public String getTugas() {
        if(this.idPegawai == 1){
            return "Melakukan manajemen untuk franchise";
        } else if(this.idPegawai == 2){
            return "Melakukan transaksi dengan pembeli";
        } else if(this.idPegawai == 3){
            return "Memasak makanan dan membuat minuman";
        } else if(this.idPegawai == 4) {
            return "Melayani dan menyajikan pesanan pembeli";
        } else{
            return "Menjaga keamanan didalam dan diluar frenchise";
        }
    }
    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    @Override
    public String toString(){
        return "Nama: " + this.nama + "\n Id Pegawai: " + this.idPegawai + "\n Gaji: " + this.gaji + "\n Tugas: " + this.tugas + "\n----------------------------------------------------";
    }
}

