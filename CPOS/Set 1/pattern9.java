class pattern9{
public static void main(String args[]){
	
	for (int i=1;i<=5;i++){
		char s='A';
		for (int j=1;j<=5-i;j++){
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++){
			System.out.print(s+" ");
			s++;
		}
		
	System.out.println("");
	}
	
	
}

}