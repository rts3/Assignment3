
public class Carclass {
	private String CarColor;
	private int HorsePow;
	private double EngSz;
	private String Carnum;
	public Carclass(){
		this.Carnum="The 2014 Dodge Dart is colored";
		this.CarColor =" green";
		this.HorsePow =184;
		this.EngSz =2;
	}
	public Carclass(String Carnum,String CarColor, int HorsePow, double EngSz){
		this.Carnum = Carnum;
		this.CarColor = CarColor;
		this.HorsePow = HorsePow;
		this.EngSz= EngSz;
	}
	public void setCarnum(String Carnum){
		this.Carnum = Carnum;
	}
	public String getCarnum(){
		return this.Carnum;
	}
	public void setCarColor(String CarColor){
		this.CarColor = CarColor;
	}
	public String getCarColor(){
		return this.CarColor;
	}
	public void setHorsePow(int HorsePow){
		this.HorsePow = HorsePow;
	}
	public int getHorsePow(){
		return this.HorsePow;
	}
	public void setEngSz(double EngSz){
		this.EngSz = EngSz;
	}
	public double getEngSz(){
		return this.EngSz;
	}
	public String toString(){
		return ""+this.Carnum+ this.CarColor+", has a "+this.EngSz+" liter engine, and horse power measured around "+this.HorsePow+" hp";
	}
}
