package MainClass;
import java.util.ArrayList;
import java.util.Scanner;

import device_interfaces.BedRoomAppliance;
import device_interfaces.LivingRoomAppliance;
import devices.AC;
import devices.Device;
import devices.Fan;
import devices.Fridge;
import devices.Geyser;
import devices.Light;
import devices.TV;
import room_house.House;
import room_house.Room;

public class MainApp {
	
	static Scanner sc=new Scanner(System.in);
	
	static House house=new House();

	public static void main(String[] args) {
			
		 System.out.println("========== Home Automation System ==========");

		 Device tv = new TV("Test");
		 System.out.println("Living: " + (tv instanceof LivingRoomAppliance));
		 System.out.println("Bedroom: " + (tv instanceof BedRoomAppliance));
	        while (true) {
	            System.out.println("\n1. Add Room");
	            System.out.println("2. Add Device to Room");
	            System.out.println("3. Turn ON Device");
	            System.out.println("4. Turn OFF Device");
	            System.out.println("5. Show Status of a Room");
	            System.out.println("6. Show Status of Entire Home");
	            System.out.println("7. Exit");
	            
	            System.out.println("Enter the Choice : ");
	            int choice=sc.nextInt();
	            sc.nextLine();
	            
	            switch (choice) {
				case 1:
					addRoom();
					break;
				case 2:
					addDevice();
					break;
				case 3:
					turnOnDevice();
					break;
				case 4:
					turnOffDevice();
					break;
				case 5:
					showRoomStatus();
					break;
				case 6:
					showStatusHouse();
//					house.showAllStatus();
					break;
				case 7:
					System.out.println("Exiting from System....");
					return;
				default:
					System.out.println("Invalid Choice!..");
				}
		
//		Room livingroom=new Room("livingroom");
//		Room kitchen=new Room("kitchen");
//		Room bedroom=new Room("bedroom");
//		Room washroom=new Room("washroom");
//		
//		house.addRoom(livingroom);
//		house.addRoom(washroom);
//		house.addRoom(bedroom);
//		house.addRoom(kitchen);
//		
//		TV tv=new TV("Sony TV");
//		Light light=new Light("LED light");
//		Fan fan=new Fan("seling Fan");
//		AC ac=new AC("LG AC");
//		Geyser geyser=new Geyser("Godrej geyser");
//		Fridge fridge=new Fridge("Godrej Fridge");
//		
//		livingroom.addDevice(ac);
//		livingroom.addDevice(fan);
//		livingroom.addDevice(light);
//		livingroom.addDevice(tv);
//		livingroom.addDevice(fridge);
//		
//		livingroom.turnOnDevice("Sony TV");
//		livingroom.turnOnDevice("seling Fan");
//		
//		livingroom.showStatus();
//		
//		
		
		
		
		
	}

}


	private static void showStatusHouse() {
		ArrayList<Room> rooms=house.getRooms();
		if(rooms.isEmpty()) {
			System.out.println("No Rooms to Display Status,Add Rooms First. ");
			return;
			
		}
		for (Room room : rooms) {
			ArrayList<Device> devices= room.getDevices();
			for (Device device : devices) {
				System.out.println(device.showStatus());
			}
				
		}
	}


	private static void showRoomStatus() {
		
		System.out.println("Enter the Room Name : ");
		String roomName=sc.nextLine();
		Room room=house.getRoom(roomName);
		
		if(room == null) {
			System.out.println("Room Not Found");
			return;
		}
		
		ArrayList<Device> devices=room.getDevices();
		for (Device device : devices) {
			System.out.println(device.showStatus());
		}
	}


	private static void turnOffDevice() {
			
			System.out.println("Enter the Room Name : ");
			String roomName=sc.nextLine();
			Room room=house.getRoom(roomName);
			
			if(room == null) {
				System.out.println("Room Not Found");
				return;
			}
			
			System.out.println("Enter the Device Name to Turn On");
			String deviceName=sc.nextLine();
			
			if(room.turnOffDevice(deviceName))
				System.out.println(deviceName+" Device Turn Off.");
			else 
				System.out.println(deviceName+" Device not found.");
				
	}


	private static void turnOnDevice() {
		
		System.out.println("Enter the Room Name : ");
		String roomName=sc.nextLine();
		Room room=house.getRoom(roomName);
		
		if(room == null) {
			System.out.println("Room Not Found");
			return;
		}
		
		System.out.println("Enter the Device Name to Turn On");
		String deviceName=sc.nextLine();
		
		if(room.turnOnDevice(deviceName))
			System.out.println(deviceName+" Device Turn ON.");
		else 
			System.out.println(deviceName+" Device not found.");
			
	}


	private static void addRoom() {
		System.out.println("Enter The Name Of Room : ");
		String name=sc.nextLine();
		
		Room room=new Room(name);

		house.addRoom(room);
		
		System.out.println("Room Added Sucessfully");
	
	}
	private static void addDevice() {
			
		System.out.println("Enter The Name Of Room : ");
		String roomName=sc.nextLine();
		
		Room room=house.getRoom(roomName);
		
		if(room == null) {
			System.out.println("Room Not Found");
			return;
		}
		 System.out.println("Select Device Type:");
	        System.out.println("1. TV");
	        System.out.println("2. Light");
	        System.out.println("3. Fridge");
	        System.out.println("4. AC");
	        System.out.println("5. Geyser");
	        System.out.println("6. Fan");
	        
	        System.out.println("Enter Your Choice : ");
	        int choice=sc.nextInt();
	        sc.nextLine();
	        
	        System.out.println("Enter The Device Name : ");
	        String deviceName=sc.nextLine();
	        
	        Device device;
	        
	        switch (choice) {
			case 1:
				device=new TV(deviceName);
				break;
			case 2:
				device=new Light(deviceName);
				break;
			case 3:
				device=new Fridge(deviceName);
				break;
			case 4:
				device=new AC(deviceName);
				break;
			case 5:
				device=new Geyser(deviceName);
				break;
			case 6:
				device=new Fan(deviceName);
				break;
			default:
				System.out.println("Invalid device type!");
                return;
			}
	        
	        if(room.addDevice(device))
	        	System.out.println(deviceName+"Device Added Sucessfully in "+ roomName);
	        else
	        	System.out.println("Device cannot be added,Because it is not a "+roomName+" device");
	        
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	