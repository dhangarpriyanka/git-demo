
public class B extends Inhritance {
	
	@Override
	void m1(){
		System.out.println("This is the Override method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Inhritance inhritance=new Inhritance();
		B b=new B();
		Inhritance inhritance=new B(); 
		inhritance.m1();
		

	}

}
