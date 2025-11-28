package devices;

import device_interfaces.KitchenAppliance;
import device_interfaces.TemperatureControllable;

public class Fridge extends Device implements TemperatureControllable, KitchenAppliance {

	private int temperature=5;

	public Fridge(String deviceName) {
		super(deviceName);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void increaseTemp() {
		// TODO Auto-generated method stub
		temperature++;
		System.out.println(deviceName+" Temperature : "+ temperature);
		
	}

	@Override
	public void decreaseTemp() {
		// TODO Auto-generated method stub
		temperature--;
		System.out.println(deviceName+" Temperature : "+ temperature);
		
	}

	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "Fridge";
	}
	
	
	
	
}
