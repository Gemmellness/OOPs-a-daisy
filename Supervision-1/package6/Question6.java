package package6;

public class Question6 {
	public static int[] vectorAdd(int[] x, int dx, int dy){
		x[0] += dx;
		x[1] += dy;
		
		return x;
	}
	
	public static void main(String[] args){
		int[] a = {1, 2};
		
		a = vectorAdd(a, 1, 1);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i] + " ");
		}
	}
}
