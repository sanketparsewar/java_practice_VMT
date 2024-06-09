package programss;

public class CompoundInterest
{
	public static void main(String []args)
	{
		int p=3000;
		float r = 2f;
		double A = p * Math.pow((1+(r/100)),r);
		double CInterest = A-p;
		System.out.println(CInterest);
	
	

	}
}