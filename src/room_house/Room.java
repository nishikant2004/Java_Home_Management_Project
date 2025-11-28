package room_house;
import java.util.ArrayList;
import java.util.List;
import device_interfaces.*;
import devices.Device;
public class Room {
	private String roomName;
	ArrayList<Device> devices;
	
	//Constructors
	public Room(String name) {
		super();
		this.roomName = name;
		devices=new ArrayList<Device>();
	}
	public Room() {
		super();
	}
	
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public ArrayList<Device> getDevices() {
		return devices;
	}
	public void setDevices(ArrayList<Device> devices) {
		this.devices = devices;
	}
	
	public boolean canDeviceBeAdded(Device device,String roomName) {
		switch (roomName.toLowerCase().replace(" ", "").trim()) {
		case "livingroom":
			return device instanceof LivingRoomAppliance;
		case "kitchen":
			return device instanceof KitchenAppliance;
		case "washroom":
			return device instanceof WashRoomAppliance;
		case "bedroom":
			return device instanceof BedRoomAppliance;
		default:
			return true; //default allow everything(for corridors,dining,etc)
		}
		
	}
	public boolean addDevice(Device device) {
		if(canDeviceBeAdded(device,this.getRoomName())) {
			devices.add(device);
			//System.out.println("Device added successfully");
			return true;
		}
		else {
			//System.out.println("Device cannot be added,Because it is not a "+getRoomName()+" device");
			return false;
		}
	
	}
	public boolean turnOnDevice(String device) {
		// TODO Auto-generated method stub
		for(Device d:devices) {
			if (d.getDeviceName().equalsIgnoreCase(device)) {
				d.turnOn();
				//System.out.println(d.getDeviceName()+" Device Turn ON.");
				return true;
			}
		}
		//System.out.println(device+" Device not found.");
		return false;

	}
	public boolean turnOffDevice(String device) {
		// TODO Auto-generated method stub
		for(Device d:devices) {
			if (d.getDeviceName().equalsIgnoreCase(device)) {
				d.turnOff();
				//System.out.println(d.getDeviceName()+" Device Turn Off.");
				return true;
			}
		}
		//System.out.println(device+" Device not found.");
		return false;

	}
//	public void showStatus() {
//		System.out.println("\n Room : "+ roomName);
//		for (Device d : devices) {
//			String status=d.showStatus();
//			
//		}
//	}
	
	
	
	
}
