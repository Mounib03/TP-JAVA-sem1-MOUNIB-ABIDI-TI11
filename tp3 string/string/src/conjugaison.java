import java.util.Scanner;

public class conjugaison {
    public static void main(String[] args) {
        String verb;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez un verbe du premier groupe :");
        verb = sc.nextLine();
        
       
        while (!verb.endsWith("er")) {
            System.out.println("verb est faux");
            verb = sc.nextLine();
        }
        
        
        String radical = verb.substring(0, verb.length() - 2);
        char excp= radical.charAt(radical.length()-1);
        
       System.out.println("Conjugaison du verbe " + verb + " au présent de l'indicatif:");
        
        
        if (excp == 'g') {
            
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radical + "eons");
            System.out.println("Vous " + radical + "ez");
            System.out.println("Ils/Elles " + radical + "ent");
        }
        else if (excp == 'c') {
            
            String rad2 = radical.substring(0, radical.length() - 3) ;
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + rad2+ "çons");
            System.out.println("Vous " + radical + "ez");
            System.out.println("Ils/Elles " + radical + "ent");
        }
        
        
        else if ("aeiou".indexOf(excp) != -1) {
            
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radical + excp + "ons");
            System.out.println("Vous " + radical + excp + "ez");
            System.out.println("Ils/Elles " + radical + "ent");
        }
        else {
            
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radical + "ons");
            System.out.println("Vous " + radical + "ez");
            System.out.println("Ils/Elles " + radical + "ent");
        }
        
        sc.close();
    }
}