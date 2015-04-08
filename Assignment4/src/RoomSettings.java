
public class RoomSettings 
{
	private String WallColor;
	private String FloorType;
	private int WindowNumber;
	private String RoomNumber;
	public RoomSettings()
	{
		this.WallColor="yellow";
		this.FloorType=" hard wood";
		this.WindowNumber = 1;
		this.RoomNumber="Room 1";
	}
	public RoomSettings(String WallColor,String FloorType,int WindowNumber,String RoomNumber)
	{
		this.WallColor=WallColor;
		this.FloorType=FloorType;
		this.WindowNumber = WindowNumber;
		this.RoomNumber=RoomNumber;
	}
	/**
	 * set the Room Number
	 * @param RoomNumber
	 */
	public void setRoomNumber(String RoomNumber)
	{
		this.RoomNumber=RoomNumber;
	}
	/**
	 * Get the Room Number
	 * @return the current Room Number
	 */
	public String getRoomNumber()
	{
		return RoomNumber;
	}
	/**
	 * set the Wall Color
	 * @param WallColor
	 */
	public void setWallColor(String WallColor)
	{
		this.WallColor=WallColor;
	}
	/**
	 * Get the Wall Color
	 * @return the current Wall Color
	 */
	public String getWallColor()
	{
		return WallColor;
	}
	/**
	 * set the Floor Type
	 * @param FloorType
	 */
	public void setFloorType(String FloorType)
	{
		this.FloorType=FloorType;
	}
	/**
	 * Get the Floor Type
	 * @return the current Floor type
	 */
	public String getFloorType()
	{
		return FloorType;
	}
	/**
	 * Set the Window Number
	 * @param WindowNumber
	 */
	public void setWindowNumber(int WindowNumber)
	{
		this.WindowNumber=WindowNumber;
	}
	/**
	 * Get the Window Number
	 * @return the current number of Windows
	 */
	public int getWindowNumber()
	{
		return WindowNumber;
	}
	public String toString(){
		return ""+this.RoomNumber+" has "+ this.WallColor+" colored walls,"+this.FloorType+" floors, and "+this.WindowNumber+" window(s).";
	}
}
