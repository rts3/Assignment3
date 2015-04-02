import javax.swing.JOptionPane;
public class Usingjavadoc {
	public static void main (String[] args){
		String x=JOptionPane.showInputDialog(null, "enter the value of x");
		int ix = Integer.parseInt(x);
		String y=JOptionPane.showInputDialog(null, "enter the value of y");
		int iy = Integer.parseInt(y);
		String z=JOptionPane.showInputDialog(null, "enter the value of z");
		int iz = Integer.parseInt(z);
		int sum = ix+iy;
		System.out.println("h(x)=x^10= " + Math.pow(ix,10));
		System.out.println("f(x,y)=x+y= " + sum);
		System.out.println("g(x,y,z)=sqrt(x)+absolute(y)+z^y= " +Math.sqrt(ix)+Math.abs(iy)+Math.pow(iz, iy));
		
	}
}
