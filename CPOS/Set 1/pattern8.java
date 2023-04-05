class pattern8{

public static void main(String args[]){
		
	for(int i=1;i<=5;i++){
		int num=5;
		for(int j=1;j<=5-i;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print(num+" ");
			num--;
		}
	System.out.println("");
	}
}
}