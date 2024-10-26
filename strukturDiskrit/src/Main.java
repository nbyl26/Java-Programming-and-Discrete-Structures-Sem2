import java.util.Scanner;
class Lingkaran { 
    double jariJari;
    public Lingkaran(double jariJari) { 
        this.jariJari = jariJari;
    }
    public double hitungLuas() { 
        return Math.PI * Math.pow(jariJari, 2);
    }
    public double hitungKeliling() { 
        return 2 * Math.PI * jariJari;

    }
}
public class Main {

    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan jari jari: "); 
        double jariJari = s.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jariJari); 

        System.out.println("Jari-jari = " + lingkaran.jariJari);
        System.out.println("Luas = " + lingkaran.hitungLuas()); 
        System.out.println("Keliling = " + lingkaran.hitungKeliling());

        s.close();
    }
}



