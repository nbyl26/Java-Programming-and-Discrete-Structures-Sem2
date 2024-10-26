import java.util.Scanner;
public class example1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        while (n != 0 && n > 0) {
            System.out.println(n % 2);
            n /= 2;
        }
        input.close();
    }
}