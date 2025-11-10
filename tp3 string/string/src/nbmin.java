import java.util.Scanner;

public class nbmin {
    public static void main(String[] args) {
        String ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir un texte");
        ch = sc.nextLine();
        while (ch.length() > 50) {
            ch = sc.nextLine();
        }
        
        int nb = 0;
        int i;
        
        for (i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            
            if (c >= 'a' & c <= 'z') {
                nb++;
            }
        }
        
        System.out.println("Nombre de lettres minuscules: " + nb);
        sc.close();
    }
}