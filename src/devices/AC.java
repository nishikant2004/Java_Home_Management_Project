package devices;
import device_interfaces.BedRoomAppliance;
import device_interfaces.KitchenAppliance;
import device_interfaces.LivingRoomAppliance;
import device_interfaces.ModeChangeable;
import device_interfaces.TemperatureControllable;
import room_house.*;

public class AC extends Device implements ModeChangeable,TemperatureControllable,KitchenAppliance,BedRoomAppliance,
LivingRoomAppliance{
	private int temperature=24;
	private String mode="Cool";
	public AC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AC(String deviceName) {
		super(deviceName);
		
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@Override
	public void increaseTemp() {
		temperature++;
		System.out.println(deviceName+" Temperature : "+ temperature);
	}
	@Override
	public void decreaseTemp() {
		temperature--;
		System.out.println(deviceName+" Temperature : "+ temperature);
	}
	@Override
	public void changeMode(String mode) {
		this.mode=mode;
		System.out.println(deviceName+" Mode : "+ mode);
	}
	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "AC";
	}
	
	
	
	
	
	
}
