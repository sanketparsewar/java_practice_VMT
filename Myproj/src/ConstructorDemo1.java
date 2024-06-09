class Sample{
	int i;
	int j;
	Sample(int i,int j)//constructor
	{
		this.i=i;
		this.j=j;
		
	}
	void dislay() {
		System.out.println("i= "+i+"\nj= "+j);
	}
	
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s= new Sample(10,20);
		s.dislay();

	}

}
