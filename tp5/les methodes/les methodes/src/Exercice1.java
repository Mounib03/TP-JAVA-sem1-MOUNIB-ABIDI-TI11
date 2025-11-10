import java.util.Scanner;

public class Exercice1 {
    
    public static int lectureEntier() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Saisie de 10 entiers :");
        
        for (int i = 1; i <= 10; i++) {
            int nombre = lectureEntier();
            if (estPair(nombre)) {
                System.out.println("Pair : " + nombre);
            }
        }
    }
}