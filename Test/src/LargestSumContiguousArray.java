
public class LargestSumContiguousArray {
	
	static int getLargestSum(int[] a) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			currsum=currsum+a[i];
			if(maxsum<currsum)
				maxsum=currsum;
			if(currsum<0)
				currsum=0;
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int[] a = { -1,1 };
		System.out.println(getLargestSum(a));
	}

}
