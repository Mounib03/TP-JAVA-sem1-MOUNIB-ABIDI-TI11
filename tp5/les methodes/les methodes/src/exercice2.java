import java.util.Scanner;

public class exercice2 {
    
    public static int lectureEntier() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    
    public static int compter(int n) {
        int i = 0;
        while (n != 0) {
             n=n/10;
            i++;
        }
        return i;
    }
    
    public static void main(String[] args) {
        int n = lectureEntier();
        System.out.println("Nombre de chiffres : " + compter(n));
    }
}