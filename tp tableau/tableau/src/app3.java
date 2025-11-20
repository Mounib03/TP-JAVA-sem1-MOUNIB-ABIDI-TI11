import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n; int[] t= new int[30];
        System.out.println("donner n>0");
        n= sc.nextInt();
        while ((n<=0) || (n>30)){
            System.out.println("donner n>0"); 
             n= sc.nextInt();  
        }
        for(int i=0;i<n;i++){
            System.out.println("donner les element ");
            t[i]=sc.nextInt();
            }
            System.out.println("donner x");
            int x=sc.nextInt();
        boolean test= false;
        int occ=0;
        for(int i=0;i<n;i++){
            if (t[i]==x){
                test=true;
                occ++;

            }
            

        }
System.out.println(x+"se trouve "+occ+"fois");
    }
}
