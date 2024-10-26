import java.util.Scanner;
public class example1_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        int[] binaryArray = new int[10]; 

        int i = 0;
        while (n != 0 && n > 0) {
            System.out.println(n % 2);
            binaryArray[i++] = n % 2;
            n /= 2;
        }

        System.out.print("Binary nya adalah: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArray[j]);
        }

        input.close();
    }
}
