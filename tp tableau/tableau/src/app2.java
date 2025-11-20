import java.util.Scanner;

public class app2 {
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
        int s =0;
        for(int i=0;i<n;i++){
            if(t[i]%2!=0){
                s=s+t[i];
                
            }
           
    }
     System.out.println("la somme est"+s);


} }

