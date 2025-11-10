
import java.util.Scanner; 
public class conversion {   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez un nombre entier :");
        int nombre = sc.nextInt();
        String ch = String.valueOf(nombre);
        System.out.println("Chaîne convertie : " + ch);
        sc.close();
    
}
    
}
