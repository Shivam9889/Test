public class PushZeroes {
	
	static void pushZeroesToEnd(int[] arr, int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
			while(count<n) {
				arr[count++]=0;
		}
	}
public static void main(String[] args) {
		int[] arr = {8,9,0,0,9,8,0};
		int n=arr.length;
		pushZeroesToEnd(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
}
}
}