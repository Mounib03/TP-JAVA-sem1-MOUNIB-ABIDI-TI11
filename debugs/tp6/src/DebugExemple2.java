public class DebugExemple2 {
    public static void main(String[] args) {
        int note1=14;
        int note2=16;
        int note3=13;
        double moyenne=(note1+note2+note3)/3.0;
        System.out.println("la moyenne est:"+moyenne);
        System.out.println("la moyenne est:%.2f\n",moyenne);
        if (moyenne>=10){
            System.out.println("admis");
        }
        else{
            System.out.println("ajourné");
        }
    }
    
}
