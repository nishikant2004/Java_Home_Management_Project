package devices;
import device_interfaces.TemperatureControllable;
import device_interfaces.WashRoomAppliance;

public class Geyser extends Device implements WashRoomAppliance,TemperatureControllable{
	private int temperature=40;

	public Geyser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geyser(String deviceName) {
		super(deviceName);
		// TODO Auto-generated constructor stub
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

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
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "Geyser";
	}
	
	
	
}
