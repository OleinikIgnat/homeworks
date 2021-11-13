import java.util.Scanner;
public class String {
    public static String Spliting (){
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
        return ("You entered %d words, this is name - %s and lastname - %s \n"
                + "", M, firstName, lastName);
    }
     public static String WordsTester (){
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
    public static String WordsTester (){
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
