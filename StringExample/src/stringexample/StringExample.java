package stringexample;
import java.util.Scanner;
public class StringExample {

    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(); //patern
        //String; StringBuilder; StringBuffer
        //Length of line
        System.out.println("Ну привет, " + name);
        int n = name.length();
        int numLastChar = n - 1;
        //Reading of given symbol-letter
        for(int i = numLastChar; i >= 0 ; i--)
        {
            System.out.println(name.charAt(i));
        }
        //Taking a part
        if(n >= 4){
            String newString = name.substring(1, 3);
            // 0 - first
            // 1 - second
            // 3 - 4th
            System.out.println(newString);
        }
        //Spliting
        String[] words = name.split(" ");
        int M = words.length;//M - number of words
        String firstName = words[0];
        String lastName = words[1];
        System.out.printf("You entered %d words, this is name - %s and lastname - %s \n"
                + "", M, firstName, lastName);
        //Does one line fit into another
        boolean res = name.contains(lastName);
        if (res == true){
            System.out.println("Line - " + name + " contains line - " + lastName);
        }
    }
    
}
