import java.util.Scanner;

public class Exercice4 {
    
    
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static boolean estArmstrong(int n) {
        int original = n;
        int somme = 0;
        while (n > 0) {
            int x = n % 10;
            somme = somme+ x * x * x;
            n=n/ 10;
        }
        return somme == original;
    }
    
    public static void main(String[] args) {
        
        int n = lectureN();
        System.out.println("Vérification : " + n + " est Armstrong ? " + estArmstrong(n));
        
        
        System.out.println("Nombres d'Armstrong < 1000 :");
        for (int i = 1; i < 1000; i++) {
            if (estArmstrong(i)) {
                System.out.println(i);
                
            }
        }
    }
}