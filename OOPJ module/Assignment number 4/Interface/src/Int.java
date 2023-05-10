

interface a{
	public abstract void f1();
	public abstract void f2();
	public abstract void f3();
	default public void f4() {
		
	}
}

abstract class abc implements a{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Int extends abc {

	public static void main(String[] args) {
		
	}
}



