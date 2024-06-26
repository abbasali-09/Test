class F{
	void meth(){
		System.out.println("jay");
	}
	
	void meth(int a){
		System.out.println(a);
	}
}

public class Main {
	public static void main(String[] args) {
	 F me = new F();
	 me.meth();
	 me.meth(20);
	}
}
