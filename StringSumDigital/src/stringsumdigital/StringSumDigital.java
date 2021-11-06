package stringsumdigital;
import java.util.Scanner;
public class StringSumDigital {

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String l = newScanner.nextLine();
        int n = l.length();
        boolean d = true;
        for(int i = n ; i > 0 ; i--)
        {
            if (l.charAt(i - 1) > '9'){
                d = false;
            }
        }
        for(int i = n ; i > 0 ; i--)
        {
            if (d == false)
            {
                System.out.println("You entered not only numbers");
                break;
            }
            System.out.print(l.charAt(i - 1));   
        }
        System.out.println();
        if (d == true)
        {
            System.out.println(Integer.parseInt(l)+1);
            
        }
        
    }
    
}
