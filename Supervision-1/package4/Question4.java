package package4;

public class Question4 {
	public static void main(String[] args){
		int[] a = {3, -5, 7, -9};
		System.out.println("The total of 3 -5 7 -9 = " + sum(a));
		
		System.out.print("The cumulative total of 3 -5 7 -9 = ");
		int[] cumsum = cumsum(a);
		for(int i = 0; i < cumsum.length; i++){
			System.out.print(cumsum[i] + " ");
		}
		System.out.println();
		
		System.out.print("The positives in the list 3 -5 7 -9 = ");
		int[] pos = positives(a);
		for(int i = 0; i < pos.length; i++){
			System.out.print(pos[i] + " ");
		}
	}
	
	public static int sum(int[] a){
		int total = 0;
		for(int i = 0; i < a.length; i++){
			total += a[i];
		}
		return total;
	}
	
	public static int[] cumsum(int[] a){
		int[] ans = new int[a.length];
		int total = 0;
		
		for(int i = 0; i < a.length; i++){
			total += a[i];
			ans[i] = total;
		}
		
		return ans;
	}
	
	public static int[] positives(int[] a){
		int noPos = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] >= 0)
				noPos++;
		}
		
		int[] pos = new int[noPos];
		int posInd = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] >= 0){
				pos[posInd] = a[i];
				posInd++;
			}
		}
		
		return pos;
	}
}
