import java.util.Scanner;

public class pari{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("donner un n");
        n = sc.nextInt();

        while (n == 0) {
            n = sc.nextInt();
        }

        if (n % 2 == 0) {
            System.out.println(n + " pair");
        } else {
            System.out.println(n + " impair");
        }
        so
    }
}
