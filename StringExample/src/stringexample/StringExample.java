package stringexample;
import java.util.Scanner;
public class StringExample {

    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String name = input.next(); //patern
        //String; StringBuilder; StringBuffer
        System.out.println("Ну привет, " + name);
    }
    
}
