import java.util.Scanner;

public class anne_mois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int ann;

        System.out.println("de quel mois?");
        m = sc.nextInt();

        while ((m > 12) || (m < 1)) {
            System.out.println("impossible ce mois n'existe pas");
            m = sc.nextInt();
        }

        System.out.println("de quelle année");
        ann = sc.nextInt();

        // code de jour
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:  
                System.out.println(ann + " le mois n° " + m + " a 31 jours");
                break;
            case 4, 6, 9, 11:
                System.out.println(ann + " le mois n° " + m + " a 30 jours");
                break;
            case 2:
                if ((ann % 4 == 0 && ann % 100 != 0) || (ann % 400 == 0)) {
                    System.out.println(ann + " le mois n° " + m + " a 29 jours");
                } else {
                    System.out.println(ann + " le mois n° " + m + " a 28 jours");
                }
                break;
        }
    }
}
