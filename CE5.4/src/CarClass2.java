
public class CarClass2 {
	private String CarColor;
	private int HorsePow;
	private int EngSz;
	private static int count;
	public CarClass2(){
		
		this.CarColor ="";
		this.HorsePow =0;
		this.EngSz =0;
	}
	public CarClass2(String CarColor,int HorsePow,int EngSz){

		this.CarColor = CarColor;
		this.HorsePow = HorsePow;
		this.EngSz= EngSz;
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
	public void setEngSz(int EngSz){
		this.EngSz = EngSz;
	}
	public double getEngSz(){
		return this.EngSz;
	}
	public static int getCount(){
		return count;
	}
	public boolean equals(CarClass2 otherObjects){
		return (this.CarColor ==otherObjects.CarColor)&&(this.HorsePow ==otherObjects.HorsePow)&&(this.EngSz ==otherObjects.EngSz);
	}
	public String toString(){
		return "This car is"+ this.CarColor+", has a "+this.EngSz+" liter engine, and horse power measured around "+this.HorsePow+" hp";
	}
	
}