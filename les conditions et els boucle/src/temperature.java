public class temperature {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Double t ;
    system.out.println("donner un temperature");
    t=sc.nextDouble();
    if (t<=0){
        system.out.println("glace");
    }
    else if (0<t<=100){
        system.out.println("eau");
    
    }
    else if (100<=t){
        system.out.println("vapeur");
        
        
    }



    }
        
    }