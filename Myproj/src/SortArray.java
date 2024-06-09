
public class SortArray {

	public static void main(String[] args) {
		int temp;
		int[] arr= {2,5,3,1,6,4,7,8};
		for (int j=0;j<arr.length;j++) {			
			for (int i=0;i<j;i++) {
				if (arr[i+1]<arr[i]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		for (int x:arr) {			
			System.out.print(x+" ");
		}
		System.out.println("\nBig="+arr[arr.length-1]);
		System.out.println("second Big="+arr[arr.length-2]);
		System.out.println("small="+arr[0]);
		System.out.println("Second small="+arr[1]);

	}

}
