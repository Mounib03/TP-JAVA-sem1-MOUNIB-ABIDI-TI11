import java.util.Scanner;

public class stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; int i;

        System.out.println("donner n lignes ");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("n strictement positif");
            n = sc.nextInt();
        }

        for (i = 1; i <= n; i++) {  
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
