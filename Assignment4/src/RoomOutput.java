 
public class RoomOutput {
	public static void main(String[] args){
		RoomSettings room1= new RoomSettings();
		System.out.println(room1);
		room1.setWindowNumber(0);
		room1.setFloorType(" carpeted");
		room1.setRoomNumber("Room 2");
		room1.setWallColor("purple");
		System.out.println(room1);
		room1.setWindowNumber(3);
		room1.setFloorType(" tiled");
		room1.setRoomNumber("Room 3");
		room1.setWallColor("white");
		System.out.println(room1);
		
		
	}
}
