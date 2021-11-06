package stringwordstester;
import java.util.Scanner;
public class StringWordsTester {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.split(" ");
        int M = words.length;
        for (int i = 0; i < M; i++)
        {
            if (words[i].trim().length() > 0)
            {
                System.out.println(words[i].trim());
            }
        }
    }
}
