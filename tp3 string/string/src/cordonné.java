import java.util.Scanner;
import java.util.StringTokenizer;
public class cordonné {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("saisir vos coordonnées :");
        System.out.println("(Nom, Prénom, CTN, Date de naissance, Ville d'origine, Spécialité du bac, Année du bac)");
        
        String saisie = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(saisie, ",");
        
        if (tokenizer.countTokens() < 7) {
            System.out.println("Erreur : Toutes les informations n'ont pas été saisies !");
        }
        String nom = tokenizer.nextToken().trim();
        String prenom = tokenizer.nextToken().trim();
        String ctn = tokenizer.nextToken().trim();
        String dateNaissance = tokenizer.nextToken().trim();
        String ville = tokenizer.nextToken().trim();
        String specialite = tokenizer.nextToken().trim();
        String anneeBac = tokenizer.nextToken().trim();
        
        System.out.println("Votre nom est : " + nom);
        System.out.println("Votre prénom est : " + prenom);
        System.out.println("Votre numéro de CTN est : " + ctn);
        System.out.println("Votre date de naissance est : " + dateNaissance);
        System.out.println("Votre ville d'origine est : " + ville);
        System.out.println("Votre spécialité de bac est : " + specialite);
        System.out.println("Vous avez obtenu votre bac en : " + anneeBac);
        
        sc.close();
    }
}




