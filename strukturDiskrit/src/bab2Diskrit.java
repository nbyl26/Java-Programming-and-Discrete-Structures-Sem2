/**
 * Course   : Discrete Structure
 * Lecturer : Syamsuryadi, S.Si., M.Kom., Ph.D.
 * Group    : 8
 * Class    : TI Reg L1
 * Name     : - Nabil Pasha (NIM 09021282328062)
 *            - Andi Muhammad Al-faridzi (NIM 09021282328041)
 **/


import java.util.Scanner;
public class bab2Diskrit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lecturer\t: Syamsuryadi, S.Si., M.Kom., Ph.D.\n" +
                        "Course/MK\t: Struktur Diskrit\n" +
                        "Coded by\t: Nabil Pasha & Andi Muhammad Al-faridzi\n" +
                        "Class\t\t: Teknik Informatika Reg L1\n\n" +
                        "Please enter the number of choice [1..3]:\n" +
                         "\t1. Decimal Int To Biner\n" +
                         "\t2. Decimal Fraction To Biner\n" +
                         "\t3. Exit\n" +
                         "Your choice: ");
        int choice = input.nextInt();
                        
        System.out.println();
        switch (choice) {
            case 1:
            System.out.print("Masukkan bilangan desimal : ");
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
            break;

            case 2:
            System.out.println("Masukkan bilangan pecahan: ");
            double decimal = input.nextDouble();
            int integerPart, digit;
            double fractionalPart;
            String binaryIntegerPart;
  
            integerPart = (int) decimal;
            fractionalPart = decimal - integerPart;
            binaryIntegerPart = Integer.toBinaryString(integerPart);

            System.out.print("Binary equivalent: " + binaryIntegerPart + ".");

            for (int i = 0; i < 5; i++) {
                fractionalPart *= 2;
                digit = (int) fractionalPart;
                System.out.print(digit);
                fractionalPart -= digit;
            }
            break;
            
            case 3:
            System.out.println("Exiting...");
            break;

            default:
            System.out.println("Invalid choice, please try again.");
            break;
        }
        input.close();
    }
}