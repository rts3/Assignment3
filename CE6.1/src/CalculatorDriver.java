
public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] array = new double[3];
		array[0]= 4;
		array[1]=52;
		array[2]= 11;
		
		System.out.println(Calculator.Average(array));
		System.out.println(Calculator.Average(1,2));
		System.out.println(Calculator.Sum(array));
		System.out.println(Calculator.Sum(3,45));
		System.out.println(Calculator.Factorial(4));
		System.out.println(Calculator.Product(56,76));
		System.out.println(Calculator.Product(array));
		


	}

}
