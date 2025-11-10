import java.util.Scanner;

public class Exercice5 {
    
    public static double puissance(double x, int n) {
        double resultat = 1;
        for (int i = 0; i < n; i++) {
            resultat=resultat * x;
        }
        return resultat;
    }
    
    public static double lectureX() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la base x (nombre réel) : ");
        return sc.nextDouble();
    }
 
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez l'exposant n (entier strictement positif) : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("L'exposant doit être strictement positif !");
            }
        } while (n <= 0);
        return n;
    }
    
    public static void main(String[] args) {
        double x = lectureX();
        int n = lectureN();
        double resultat = puissance(x, n);
        System.out.println("Résultat : " + x + "^" + n + " = " + resultat);
    }
}
