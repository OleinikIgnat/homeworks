package stringcw1;
import java.io.BufferedReader;//* bites reader
import java.io.FileWriter;//* writer
import java.io.PrintWriter;//*
import java.io.IOException;
import java.io.InputStreamReader;//*
import java.io.FileReader;//* reader
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
public class StringCW1 {
    
    public static void main(String[] args) {
        PrintWriter output = null;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in) );
        try {
            output = new PrintWriter( new FileWriter("data.txt") );
            while(true)
            {
                String strtmp = input.readLine();
                if (strtmp.equals("stop"))
                    break;
                output.println(strtmp);
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Чтение файла, к которому нет доступа.");//TxtFileTester.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            output.close();
        }
        String text = "";
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader("data.txt"));
            String text1 = inputFile.readLine();
            text = text1;
            inputFile.close();
        } catch (Exception e) {
        }
        String[] words = text.split(" ");
        for(int i = words.length; i > 0 ; i--)
        {
            System.out.println(words[i - 1]);
        }
        //Argentina manit negra, a roza upala na lapu Azora
        int n = 0;
        for(int i = text.length() ; i > 0 ; i--)
        {
            if (text.charAt(i - 1) == ','){
                n++;
                text = text.replace(",", "");
            }
        }
        String myStr = "Argentina manit negra, a roza upala na lapu Azora";
        myStr = myStr + " ";
        System.out.println(n + " " + text);
        StringBuilder newWords = new StringBuilder();
        for (int i = 0; i < myStr.length() - l; i++){
            if (myStr.charAt(i) != ' ' && myStr.charAt(i + 1) == ' '){
                
            }
        }
    }
}
