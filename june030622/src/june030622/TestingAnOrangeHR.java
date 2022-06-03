package june030622;

public class TestingAnOrangeHR {
	public static void main(String[] args) {
		int a[]= {0,1,0,1,0};
		int size=a.length;
		int k;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<=size-1;j++) {
				if(a[i]>a[j]) {
				k=a[i];
				a[i]=a[j];
				a[j]=k;
				}
			}
		
		}
		for(int m=0;m<size;m++) {
			System.out.print(a[m]+" ");
		}
	}

}
