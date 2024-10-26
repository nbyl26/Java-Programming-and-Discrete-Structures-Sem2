import java.util.Random;
import java.util.Scanner;

public class tugas14_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan index array: ");
            int index = input.nextInt();

            System.out.println("Nilai dari index [" + index + "] adalah: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
    }
}