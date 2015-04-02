import java.util.Scanner;
public class UsingMethod {
	public static void main (String[] args){
		int[] numbers=input();
      System.out.println(h(numbers[0]));
      System.out.println(f(numbers[0],numbers[1]));
      System.out.println(g(numbers[0],numbers[1],numbers[2]));
	
	}
	
	public static int[] input(){
		int x,y,z;
		Scanner values = new Scanner(System.in);
		System.out.println("Enter the first value");
		x=values.nextInt();
		System.out.println("Enter the second value");
		y=values.nextInt();
		System.out.println("Enter the third value");
		z=values.nextInt();
      int[]arrayxyz= new int[3];
      arrayxyz[0]=x;
      arrayxyz[1]=y;
      arrayxyz[2]=z;
      return arrayxyz;
		
	}
	
	public static int h(int x){
		return x*x*x*x*x*x*x*x*x*x;
	}
	public static int f(int x, int y){
		return x+y;
	}
	public static int g(int x,int y, int z){
		int zpower=z;
      for(int i = 1; i<y; i++){
         zpower*=z;
      }
      return (x*x+((y*y)/(y*-1))+zpower);
	}
}