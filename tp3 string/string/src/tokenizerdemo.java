import java.util.StringTokenizer;

public class tokenizerdemo {
    public static void main(String[] args) {
        String texte1="bonjour les etudiants,bienvenue en java!";
        StringTokenizer st1= new StringTokenizer(texte1);
        System.out.println("decoupage du texte en mot");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
            
        }
        System.out.println(" le tewte principal est : "+texte1);
    }
    
}
