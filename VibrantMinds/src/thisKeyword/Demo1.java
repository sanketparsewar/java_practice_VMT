package thisKeyword;

public class Demo1 {
	int a = 10, b = 20;
	Demo1() {
//		a=12;
//		b=23;
		System.out.println("Default const called Demo1");
	}
	Demo1(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Parameterised constructor of Demo1");
	}
	void m1() {
		int a=this.a,b=this.b;
		System.out.println("a= "+a+" b="+b);
	}
}