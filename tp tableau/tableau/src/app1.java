import java.util.Scanner;

public class app1 {
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
            if (t[i]<10 & t[i]>99){
                System.out.println("donner les element ");
            }
            
        }
        
    }
    
}
