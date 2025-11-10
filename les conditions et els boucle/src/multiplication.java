import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;

        System.out.println("donner nombre");
        n = sc.nextInt();

        while ((n > 10) || (n < 1)) {
            System.out.println("donner nombre");
            n = sc.nextInt();
        }

        for (i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
