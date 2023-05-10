package Day1;

public class ToH {
    public static void main(String[] args) {
        int n=3;
        Toh(n,"SRC","HELP","DEST");
            
    }
    
    
    public static void Toh(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Move from "+src+ " to"+dest);
            return;
        }
    
        Toh(n-1,"src","dest","help");
        System.out.println("Move from "+src+ " to"+dest);
        Toh(n-1,"help","src","dest");
    }
    
   
}
