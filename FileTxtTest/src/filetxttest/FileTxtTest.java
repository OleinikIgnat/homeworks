package filetxttest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileTxtTest {

    public static void main(String[] args) {
        PrintWriter output = null;
        System.out.println("digits.txt");
        int sum = 0;
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader("digits.txt"));
            String strtmp2;
            while ((strtmp2 = inputFile.readLine()) != null) {
                System.out.println(strtmp2);
                int d = Integer.parseInt(strtmp2);
                sum = sum + d;
            }
            System.out.println("Sum = " + sum);
            inputFile.close();
        } catch (Exception e) {
        }
    }
    
}
