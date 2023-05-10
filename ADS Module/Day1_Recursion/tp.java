package Day1;

class tp{
    public static void main(String[] args) {
        int a[]=new int[]{1,8,6,3,6,5,2,7,9,4};
        int key=10;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                flag=true;
                break;
             }
            else{
            flag=false;
        }
    }
    if(flag)
        System.out.println("Element found");
    else
        System.out.println("Element not found");
    }
}
