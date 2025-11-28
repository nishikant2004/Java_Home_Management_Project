package room_house;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class House {

	private ArrayList<Room> rooms=new ArrayList<Room>();

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(Room room) {
		rooms.add(room);
	}
	
	//get Room by Name
	
	public Room getRoom(String roomName) {
		for (Room room : rooms) {
			if(room !=null && room.getRoomName().equalsIgnoreCase(roomName));
			
			return room;
		}
		return null;
	}
	public void turnOn(String roomName,String deviceName) {
		for (Room room : rooms) {
			if(room.toString().contains(roomName)) {
				room.turnOnDevice(deviceName);
				return;
			}
			
		}
		System.out.println("Room"+ roomName+" Not Found");
		
	}
	public void turnOff(String roomName,String deviceName) {
		for (Room room : rooms) {
			if(room.toString().contains(roomName)) {
				room.turnOffDevice(deviceName);
				return;
			}
			
		}
		System.out.println("Room"+ roomName+" Not Found");
	}
	
//	public void showAllStatus() {
//		for (Room room : rooms) {
//			room.showStatus();
//		}
//		
//	}
	
	
	
}
