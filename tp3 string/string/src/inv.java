import java.util.Scanner;

public class inv {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        String inverted = "";
        
        
        for (int i = word.length() - 1; i >= 0; i--) {
            inverted += word.charAt(i);
        }
        if (word.equals(inverted)){
            System.out.println("palindrome");
        }
        System.out.println( inverted);
        System.out.println();

    
}
}
