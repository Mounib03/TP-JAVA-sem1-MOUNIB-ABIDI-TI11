import java.util.Scanner;
import java.util.StringTokenizer;

public class DebugTPFinal {
    public static void main(String[] args) {
       System.out.println("Entrez une phrase :");
       Scanner sc=new Scanner(System.in);
        String phrase = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(phrase);
        int m = tokenizer.countTokens();
        
        int voy = 0;
        String v = "aeiouyAEIOUY";
        for (int i = 1; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (v.indexOf(c)!= -1) {
                voy++;
            }
            String larger = "";
        tokenizer = new StringTokenizer(phrase); 
        while (tokenizer.hasMoreTokens()) {
            String mot = tokenizer.nextToken();
            if (mot.length() >= larger.length()) {
                larger = mot;
            }
        }
         System.out.println("Nombre de mots : " + m);
        System.out.println("Nombre de voyelles : " + voy);
        System.out.println("Mot le plus long : " + larger);
    }
}



        }

