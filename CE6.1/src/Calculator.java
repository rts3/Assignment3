
public class Calculator {
	
	public static double Average (double[] array){
		double sum = 0;
		for(int i=0; i<array.length; i++){
			sum+=array[i];
		}
		return(sum/array.length);
	}
	public static double Average (double a,double b){
		
		return(a+b/2);
	}
	public static double Sum (double[] array){
		double sum = 0;
		for(int i=0; i<array.length; i++){
			sum+=array[i];
		}
		return sum;
	}
	public static double Sum (double a, double b){
		
		return (a+b);
	}
	public static int Factorial (int a){
		int x, fact = 1;
		  for ( x =a; x > 1; x--)
		     fact *= x;

		  return fact;
	}
	public static double Product (double[] array){
		double result = 0;
		for(int i=0; i<array.length; i++){
			result=result*i;
		}
		return result;
	}
	public static double Product (double a, double b){
		return(a*b);
	}
	
	
	
}
