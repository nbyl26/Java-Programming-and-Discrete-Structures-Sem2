/**
 * Course   : Discrete Structure
 * Lecturer : Syamsuryadi, S.Si., M.Kom., Ph.D.
 * Group    : 8
 * Class    : TI Reg L1
 * Name     : - Nabil Pasha (NIM 09021282328062)
 *            - Andi Muhammad Al-faridzi (NIM 09021282328041)
 **/

 import java.util.Scanner;

 public class recursiveTask {
     private int n, m, t;
 
     /* Example 7.1 First Algorithm Starts (Page 111) */
     // Outputs: 2, 4, 6, 8, ...
     void example71First() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter the number m: ");
             m = scanner.nextInt();
 
             // Non-recursive definition
             for (n = 1; n <= m; n++) {
                 t = 2 * n;
                 System.out.printf("%d ", t);
             }
 
         }
     }
     /* Example 7.1 First Algorithm Ends */
 
     /* Example 7.1 Second Algorithm Starts (Page 111) */
     // Outputs: 2, 4, 6, 7, ... (similar to example71First)
     void example71Second() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter the number m: ");
             m = scanner.nextInt();
 
             // Non-recursive definition
             t = 2;
             System.out.printf("%d ", t);
             for (n = 2; n <= m; n++) {
                 t += 2; // t = t + 2
                 System.out.printf("%d ", t);
             }
         }
     }
     /* Example 7.1 Second Algorithm Ends */
 
     /* Example 7.1.1 Starts (Page 112) */
     int example711Recursive(int n) {
         if (n == 1) {
             return 2; // t(1) = 2
         } else {
             return example711Recursive(n - 1) + 3; // t(n) = t(n - 1) + 3, n > 1
         }
     }
 
     // Outputs: 2, 5, 8, 11, 14, 17, ...
     void example711() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter the number m: ");
             m = scanner.nextInt();
 
             // Recursive definition
             t = example711Recursive(1); // t = example711Recursive(m) = the m-th element of the sequence
             for (n = 1; n <= m; n++) { // Using for loop to print all the elements of the sequence until the m-th
                                        // element
                 System.out.printf("%d ", t);
                 t = example711Recursive(n + 1);
             }
 
             System.out.println();
 
             // Non-recursive definition
             for (n = 1; n <= m; n++) {
                 t = 3 * n - 1; // t(n) = 3n - 1
                 System.out.printf("%d ", t);
             }
         }
     }
     /* Example 7.1.1 Ends */
 
     /* Example 7.1.2 Starts (Page 113) */
     int example712Recursive(int n) {
         if (n == 1) {
             return 3; // t(1) = 3
         } else {
             return 2 * example712Recursive(n - 1) + n; // t(n) = 2 * t(n - 1) + n, n > 1
         }
     }
 
     // Outputs: t(1) = 3, t(2) = 8, t(3) = 19, t(4) = 42, ...
     void example712() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("How many numbers: ");
             m = scanner.nextInt();
 
             // Recursive definition
             t = example712Recursive(1); // example712Recursive(m) = the m-th element of the sequence
             for (n = 1; n <= m; n++) { // Using for loop to print all the elements of the sequence until the m-th
                                        // element
                 System.out.printf("t(%d) = %d\n", n, t);
                 t = example712Recursive(n + 1);
             }
         }
     }
     /* Example 7.1.2 Ends */
 
     /* Example 7.1.3 Starts (Page 113) */
     // Outputs: t(1) = 3, t(2) = 8, t(3) = 19, t(4) = 42, ...
     void example713() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("How many numbers: ");
             m = scanner.nextInt();
 
             // Non-recursive definition
             t = 3; // t(1)
             System.out.printf("t(1) = %d\n", t);
             for (n = 2; n <= m; n++) {
                 t = 2 * t + n; // t <- 2t + n
                 System.out.printf("t(%d) = %d\n", n, t);
             }
         }
     }
     /* Example 7.1.3 Ends */
 
     /* Example 7.1 Third Algo (Evaluate Factorials) Starts (Page 115) */
 
     long example71ThirdRecursive(int n) {
         if (n == 0) {
             return 1; // 0! = 1
         } else {
             return n * example71ThirdRecursive(n - 1); // n! = n * (n - 1)!
         }
     }
 
     void example71Third() {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter the number n: ");
             n = scanner.nextInt();
 
             // Non-recursive / iterative definition
             long f = 1;
             for (int i = 1; i <= n; i++) {
                 f *= i; // f <- i * f
             }
             System.out.printf("%d! = %d\n", n, f);
 
             // Recursive definition
             f = example71ThirdRecursive(n);
             System.out.printf("%d! = %d\n", n, f);
         }
     }
 
     /* Example 7.1 Third Algo (Evaluate Factorials) Ends */
 
     public static void main(String[] args) {
         recursiveTask r = new recursiveTask();
         try (Scanner scanner = new Scanner(System.in)) {
             int choice;
             do {
                 System.out.print("[Recursive and Iterative Algorithm Implementation in Java]\n" +
                         "Lecturer\t: Syamsuryadi, S.Si., M.Kom., Ph.D.\n" +
                         "Course/MK\t: Discrete Structure/Struktur Diskrit\n" +
                         "Coded by\t: Nabil Pasha & Andi Muhammad Al-faridzi\n" +
                         "Class\t\t: Teknik Informatika Reg L1\n\n" +
                         "Please enter the number of choice [1..7]:\n" +
                         "\t1. Example 7.1 First Algorithm\n" +
                         "\t2. Example 7.1 Second Algorithm\n" +
                         "\t3. Example 7.1.1\n" +
                         "\t4. Example 7.1.2\n" +
                         "\t5. Example 7.1.3\n" +
                         "\t6. Example 7.1 Third Algorithm (Evaluate Factorials)\n" +
                         "\t7. Exit\n" +
                         "Your choice: ");
                 choice = scanner.nextInt();
                 System.out.println();
                 switch (choice) {
                     case 1:
                         r.example71First();
                         break;
                     case 2:
                         r.example71Second();
                         break;
                     case 3:
                         r.example711();
                         break;
                     case 4:
                         r.example712();
                         break;
                     case 5:
                         r.example713();
                         break;
                     case 6:
                         r.example71Third();
                         break;
                     case 7:
                         System.out.println("Exiting...");
                         break;
                     default:
                         System.out.println("Invalid choice, please try again.");
                         break;
                 }
             } while (choice < 0 && choice > 7);
         } catch (Exception e) {
             System.out.println("\nError: ");
             e.printStackTrace();
            }
        }
    }