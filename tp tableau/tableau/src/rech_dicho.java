import java.util.Scanner;

public class rech_dicho{
    public static void main(String[] args) {
       
        int[] t = {0, 1, 2, 3};
        int inf,sup,x,mil;
        System.out.println("donner x");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        inf=1;
        sup=4;
        do{
            mil=(inf+sup)/2;
            if(x<t[mil]){
                sup=mil-1;

            }
            else{
                inf=mil + 1;
            }

        }
        while (x!=t[mil]||(inf<sup));


    }
}