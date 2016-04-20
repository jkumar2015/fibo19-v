/**
 * Verbesserung des 4ten Tests
 * @author jyotikumar
 * @version 2016-04-20
 */
public class Rekursiv2 {
	
	public static long fibonacciRec(int n){
		
		if(n==0){
			return 0;
		}
		
		if(n==1){
			return 1; 
		}
		
		if(n<0){
			throw new ArithmeticException("Unzulässiger Wert");
		}
		
		if(Long.MAX_VALUE/n < fibonacciRec(n-2)){
			throw new ArithmeticException("Unzulässiger Wert");
		}
		
		return fibonacciRec(n-1) +fibonacciRec(n-2);
		
	}
	
	public static long lukasArr(int n){
		
		long[] lz = new long[n+1];
		
		if(n==0){
			return 2;
		}
		
		if(n==1){
			return 1;
		}
		
		if(n<0){
			throw new ArithmeticException("Unzulässiger Wert");
		}
		
		lz[0]=2;
		lz[1]=1;
		
		for(int i=2; i<=lz.length-1;i++){
			
		if(Long.MAX_VALUE-lz[i-1]<lz[i]){
			throw new ArithmeticException("Unzulässiger Wert");
		}
			
			lz[i] = lz[i-1]+lz[i-2];
			
		}
		return lz[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacciRec(3));//2
		System.out.println(lukasArr(4));//11
		
		
	}

}

