/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InputStreamReader {
    public static void InputInFile(){
        PrintWriter output = null;
        BufferedReader input = new BufferedReader(new java.io.InputStreamReader(System.in) );
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
            System.out.println("No access to the file");
        }finally {
            output.close();
        }
    }
    public static String OutputFromFile(){
        String output;
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader("data.txt"));
            String strtmp2;
            strtmp2 = inputFile.readLine();
            inputFile.close();
            output = strtmp2;
        } catch (Exception e) {
            
        }
        return output;
    }
}
