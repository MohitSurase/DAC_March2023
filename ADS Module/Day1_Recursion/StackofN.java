package Day1;

public class StackofN {
    public static int raiseto(int n, int x){
        if(x==0)
    {
        
        return 1;
        
    }
        int ans = raiseto(n, x-1);
        int result=n*n;
        System.out.println(ans);;
    }
    public static void main(String[] args) {
        int num=2;
        int x=5;
        int ans =raiseto(num,x);
        System.out.println(ans);
    }
}
