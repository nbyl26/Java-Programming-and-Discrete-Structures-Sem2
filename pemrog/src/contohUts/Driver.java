package contohUts;

public class Driver {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Sifa", 1);
        Pegawai pegawai2 = new Pegawai("Aldi", 2);
        Pegawai pegawai3 = new Pegawai("Reza", 3);
        Pegawai pegawai4 = new Pegawai("Dean", 4);
        Pegawai pegawai5 = new Pegawai("Andi", 5);
        System.out.println("Menampilkan nama, id pegawai, gaji dan tugas");
        System.out.println("--------------------------------------------");
        System.out.println(pegawai1);
        System.out.println(pegawai2);
        System.out.println(pegawai3);
        System.out.println(pegawai4);
        System.out.println(pegawai5);
    }
}

