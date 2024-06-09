
public class NumIncPyramid {

	public static void Numpyramid(int n){
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {				
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		

	}

	public static void main(String args[]) {
		int n =6;
		Numpyramid(n);
				
	}

}
