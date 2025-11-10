import java.util.Scanner;

import java.util.Scanner; 

public class codagemot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        ch = sc.nextLine();
        
        while (ch.length() > 30) {
            ch = sc.nextLine();
        }
        
        int i; int a;

        for(i = 0; i < ch.length(); i++) { 
            a = (int) ch.charAt(i) + 3;
            
            
            if (Character.isLowerCase(ch.charAt(i))) {
                if (a > 122) {
                    a = a - 26;
                }
            } else if (Character.isUpperCase(ch.charAt(i))) {
                if (a > 90) { 
                    a = a - 26;
                }
            }
            
            
            System.out.print((char) a);
        }
        sc.close();
    }
}

