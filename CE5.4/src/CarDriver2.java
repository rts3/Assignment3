import javax.swing.JOptionPane;
public class CarDriver2 {
	private static String colorCar,colorCar2,colorCar3;
	private static String HPI,HPI2,HPI3;
	private static int HPA,HPA2,HPA3;
	private static String ESI,ESI2,ESI3;
	private static int ESA,ESA2,ESA3;	

	public static void main(String[] args){
		colorCar= JOptionPane.showInputDialog(null,"What color is the first car?");
		HPI = JOptionPane.showInputDialog(null,"what is the horsePower of the first car?");
		HPA =Integer.parseInt(HPI);
		ESI = JOptionPane.showInputDialog(null,"How big is the first car's engine?");
		ESA =Integer.parseInt(ESI);
		colorCar2= JOptionPane.showInputDialog(null,"What color is the second car?");
		HPI2 = JOptionPane.showInputDialog(null,"what is the horsePower of the second carcar?");
		HPA2 =Integer.parseInt(HPI2);
		ESI2= JOptionPane.showInputDialog(null,"How big is the second car's engine?");
		ESA2 =Integer.parseInt(ESI2);
		colorCar3= JOptionPane.showInputDialog(null,"What color is the third car?");
		HPI3 = JOptionPane.showInputDialog(null,"what is the horsePower the third car?");
		HPA3 =Integer.parseInt(HPI3);
		ESI3 = JOptionPane.showInputDialog(null,"How big is the third car's engine?");
		ESA3 =Integer.parseInt(ESI3);
		CarClass2 Car1 = new CarClass2 (colorCar,HPA,ESA);
		CarClass2 Car2 = new CarClass2 (colorCar2,HPA2,ESA2);
		CarClass2 Car3 = new CarClass2 (colorCar3,HPA3,ESA3);
		JOptionPane.showMessageDialog(null,"Compare the first and second car:"+Car1.equals(Car2));
		JOptionPane.showMessageDialog(null,"Compare the second and third car:"+Car2.equals(Car3));
		JOptionPane.showMessageDialog(null,"Compare the first and third car:"+Car1.equals(Car3));
		JOptionPane.showMessageDialog(null,Car1);
		JOptionPane.showMessageDialog(null,Car2);
		JOptionPane.showMessageDialog(null,Car3);
	}
}
