public class hello1 {

	public static void main(String[] args){
		int[] array = {};
		System.out.println(sum(array));
		System.out.println(first(array));
		System.out.println(last(array));
		System.out.println(secondlast(array));

	}

	public static int sum(int a[] ){
		int sum = 0;
		
		for(int i = 0; i < a.length; i++){
			 sum += a[i];
		}
		return sum;
	}
	
	public static int first(int a[] ){
		
		return a[0];
	}
	public static int last(int a[] ){
		
		return a[a.length-1];
	}
	public static int secondlast(int a[] ){	
		
		return a[a.length-2];
	}
	



}
