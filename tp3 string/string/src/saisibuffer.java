import java.util.Scanner;

public class saisibuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir une phrase");
        String ch2=sc.nextLine();
        StringBuffer ch=new StringBuffer(sc.nextLine());
        System.out.println("le contenu du stringbufferest :"+ch);
        sc.close();


    }
}



// to change a caracter to uppercase u need to enter caracter class