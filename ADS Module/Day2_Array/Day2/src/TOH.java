
public class TOH {
	public static void toh(int n, String src, String help, String dest) {
	if(n==1) {
		System.out.println("Disk from "+src+" to "+dest);
		return;
	}
	toh(n-1, src,dest,help);
	System.out.println("Disk from "+src+" to "+dest);
	toh(n-1, help, src,dest);
}
	public static void main(String[] args) {
		int n=3;
		toh(3,"src","help","dest");

	}

}
