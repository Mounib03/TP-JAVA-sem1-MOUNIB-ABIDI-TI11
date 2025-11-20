import java.util.Scanner;

public class appli3 {
    public static int lectureN (){
         Scanner sc=new Scanner(System.in);
        int nl;
         System.out.println("donner nl>0");
        nl= sc.nextInt();
        while ((nl<0)){
            System.out.println("donner nl>0"); 
             nl= sc.nextInt(); }
             return nl;
    }
    public static void  RemplirTab(){
         Scanner sc=new Scanner(System.in);
        int[] t= new int[100];
        for(int i=0;i<t.length;i++){
            System.out.println("donner les element ");
            t[i]=sc.nextInt();
            if (t[i]<=0){
                System.out.println("invalid");
                 t[i]=sc.nextInt();
            }
            }
    public static void Calcul_moy{

    }
            

    }





}


