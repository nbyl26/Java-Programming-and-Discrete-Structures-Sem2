package Inheritance;

public class Pegawai {
    private String nama;
    private Double gaji;
    private int idPegawai;
    private String tugas;

    protected Pegawai(String nama, Double gaji, int id, String tugas){
        this.nama = nama;
        this.gaji = gaji;
        this.idPegawai = id;
        this.tugas = tugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getGaji() {
        return gaji;
    }

    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public void tugas(){
        System.out.print(getTugas());
    }

    public void displayInfo(){
        System.out.print("Nama : " + nama + "\nId Pegawai: " + idPegawai + "\nGaji : " + gaji + " Juta" + "\nTugas : " + getTugas() + "\n-------------------------------------------------------\n");
    }
}

