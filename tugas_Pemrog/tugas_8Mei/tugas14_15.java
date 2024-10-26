import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class tugas14_15{
    public static void main(String[] args) throws IOException{
        File file = new File("Exercise14_15.txt");

        if(!file.exists()){
                file.createNewFile();
                try {
                    PrintWriter write = new PrintWriter(file);
                    for(int i = 0; i < 100; i++){
                        write.print((int) (Math.random() * 100) + " ");
                    }
                    write.close();
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }
        }
        try {    
            Scanner data = new Scanner(file);
            int[] arrayOfData = new int[100];
            int index = 0; 
            while (data.hasNext()) {
                arrayOfData[index] = data.nextInt();
                index++;
            }
            data.close();
            Arrays.sort(arrayOfData);
    
            for (int value : arrayOfData){
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
       
        
    }
}