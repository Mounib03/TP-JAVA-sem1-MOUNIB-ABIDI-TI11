import java.util.Scanner;

public class appli2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nl,nc;
         System.out.println("donner nl>0");
        nl= sc.nextInt();
        while ((nl>30)){
            System.out.println("donner nl>0"); 
             nl= sc.nextInt(); }
         System.out.println("donner nc>0");
        nc= sc.nextInt();
        while ((nc>30)){
            System.out.println("donner nc>0"); 
             nc= sc.nextInt(); }
        int [][] m= new int[nl][nc];
        int s=0;int p=1;
        System.out.println("donner les element");

        for(int i=0;i<nl;i++){
            for(int j=0;j<nc;j++){
                m[i][j]=sc.nextInt();
                s=s+m[i][j];
                p=p*m[i][j];
            }
            

        }
        System.out.println("somme est"+s);
        System.out.println("produit est"+p);
       


    }
    
}
