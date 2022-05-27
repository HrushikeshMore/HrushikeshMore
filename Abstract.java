abstract class A{
	abstract void m1();
	abstract void m2();
}
abstract class B extends A{
	@Override
	void m1(){
		System.out.println("m1 solution");
	}
	
}
 class C extends B{
	@Override
	void m2(){
		System.out.println("m2 Abc solution");
	}
	
}
class Abstract{
	public static void main(String... args){
		A ob=new C();
		ob.m1();
		ob.m2();
		
	}
}
