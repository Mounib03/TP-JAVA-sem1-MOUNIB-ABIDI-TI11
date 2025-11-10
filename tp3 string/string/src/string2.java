import java.util.Scanner;  

public class string2 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int nb; 
        int i;
        char c; 
        String a;
        
       
        System.out.print("Enter a character: ");
        c = sc.nextLine().charAt(0);  
        
        System.out.print("Enter a string: ");
        a = sc.nextLine(); 
        
        while(a.length() > 20) {  
            System.out.print("String too long. Enter a string (max 20 chars): ");
            a = sc.nextLine();  
        }
        
        nb = 0;
        
        
        for (i = 0; i < a.length(); i++) {
            if(a.charAt(i) == c) {  
                nb++;  
            }
        }
        
        System.out.println("Number of '" + c + "' in string: " + nb);  
    }  
}