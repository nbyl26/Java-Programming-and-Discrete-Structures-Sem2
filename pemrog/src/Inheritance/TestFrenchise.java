package Inheritance;

public class TestFrenchise {
    public static void main(String[] args) {
        Pegawai[] pegawais = {new Manager("Sifa", 1),new Kasir("Aldi", 2),new Koki("Reza", 3),new Pelayan("Dean", 4),new Satpam("Andi", 5)};
        System.out.println("Menampilkan nama, id pegawai, gaji, dan tugas");
        System.out.println("-------------------------------------------------------");
        for(Pegawai i : pegawais){
            i.displayInfo();
        }
    }
}

