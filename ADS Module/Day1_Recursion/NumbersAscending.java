package Day1;

public class NumbersAscending {
    public static void printnum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
    public static void main(String[] args) {
        printnum(1);    
    }
}
