import java.util.Scanner;

public class factoriel{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n;int i; int fa=1;
    System.out.println("donner nombre");
    n=sc.nextInt();
    while (n<0){
        System.out.println("donner nombre");
        n=sc.nextInt();  
    }
    for(i=1;i<n;i++);
    {
        System.out.println(fa=fa*i);
    }
}
} 