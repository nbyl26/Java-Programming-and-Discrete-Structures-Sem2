package persamaan;
import java.util.Scanner;

public class testPersamaanKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        persamaanKuadrat persamaan = new persamaanKuadrat(a, b, c);

        double x = persamaan.getDiscriminant();

        if (x > 0){
            System.out.println("akar pertama: " + persamaan.getRoot1());
            System.out.println("akar kedua: " + persamaan.getRoot2());
        }
        else if(x == 0){
            System.out.println("akar: " + persamaan.getRoot1());
        }
        else{
            System.out.println("Persamaan ini tidak memiliki akar");
        }
        input.close();
    }
}
