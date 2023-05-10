package Day1;

public class SumofN {
    public static void sum(int a, int n, int sum){
    if(a==n){
        sum=sum+a;
        System.out.println(sum);
        return;
    }
    sum=sum+a;
    sum(a+1,n,sum);
}
    public static void main(String[] args) {
        sum(1,5,0);
        
    }
}
