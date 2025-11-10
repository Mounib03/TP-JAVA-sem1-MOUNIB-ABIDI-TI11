import java.util.Scanner;

public class Exercice3 {
    
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static int calculeSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme = somme +i * i;
        }
        return somme;
    }
    
    public static void main(String[] args) {
        int n = lectureN();
        System.out.println("Somme des " + n + " premiers carrés = " + calculeSomme(n));
    }
}