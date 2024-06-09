class ArrayOperations {
	int[] Reverse(int a[]) {
		for (int i = 0; i < a.length/2; i++) {
			a[i]=a[i]+a[a.length-1-i];
			a[a.length-1-i]=a[i]-a[a.length-1-i];
			a[i]=a[i]-a[a.length-1-i];
		}
		return a;
	}
	int[] swapFirstAndLast(int a[]) {
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		return a;
	}
	int[] shiftFirstToLast(int b[]) {
		
		for (int i = 0; i < b.length-1; i++) {
			int temp=b[i];
			b[i]=b[i+1];
			b[i+1]=temp;
		}
		return b;
	}
	int[] shiftLastToFirst(int a[])
	{
		for (int i = a.length-1; i>0; i--) {
			int temp=a[i];
			a[i]=a[i-1];
			a[i-1]=temp;
		}
		return a;
	}
	int firstMax(int a[]) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		return max;
	}
	int secondMax(int a[]) {
		int max=0,smax=0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				smax=max;
				max=a[i];
			}
			else if(smax<a[i] && max>a[i]) {
				smax=a[i];
			}
		}
		return smax;
	}
}
