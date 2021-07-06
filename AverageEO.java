package eg1;

public class AverageEO {
	public static void main(String[] args) {
		int arr[]= {14,43,59,68,71,86};
		int oddsum=0,evensum=0,evencount=0,oddcount=0;
		for(int i=0;i<6;i++) {
			if(arr[i]%2==0) {
				evensum=evensum+arr[i];
				evencount++;
			}
			else {
				oddsum=oddsum+arr[i];
				oddcount++;
			}
		}
		double avgodd=oddsum/oddcount;
		double avgeven=evensum/evencount;
		System.out.println("\naverage of even numbers are:"+avgeven);
		System.out.println("\naverage of odd numbers are:"+avgodd);
	}

}
