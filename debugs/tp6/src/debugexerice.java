import java.util.Scanner;

public class debugexerice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("entre un nombre entier:");
        int n=sc.nextInt();
        int somme=1;
        for(int i=1;i<=n;i++){
            somme=somme + i;
        }
        System.out.println("la somme des entiers de 1 a "+n+"est:"+somme);
        sc.close();
    }
    
}
