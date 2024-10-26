import java.util.Scanner;

public class soal231 {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan desimal : ");
        Scanner input = new Scanner(System.in);
        int desimal = input.nextInt();

        String biner = "";
        System.out.println("\nSteps:");
        System.out.println("2\t" + desimal);
        while (desimal > 0) {
            int sisaBagi = desimal % 2;
            desimal = desimal / 2;
            System.out.println("\t" + desimal + "\t" + sisaBagi);
            biner = sisaBagi + biner;
        }
        System.out.println("Representasi binernya adalah : " + biner);
        input.close();
    }
}