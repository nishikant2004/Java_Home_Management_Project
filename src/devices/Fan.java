package devices;
import device_interfaces.BedRoomAppliance;
import device_interfaces.KitchenAppliance;
import device_interfaces.LivingRoomAppliance;
import device_interfaces.SpeedControllable;
import device_interfaces.WashRoomAppliance;

public class Fan extends Device
		implements SpeedControllable, KitchenAppliance, BedRoomAppliance, LivingRoomAppliance, WashRoomAppliance {
	private int speed = 10;

	public Fan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fan(String deviceName) {
		super(deviceName);
		// TODO Auto-generated constructor stub
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void increaseSpeed() {
		speed++;
		System.out.println(deviceName + " Speed : " + speed);
	}

	@Override
	public void decreaseSpeed() {
		speed--;
		System.out.println(deviceName + " Speed : " + speed);
	}

	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "Fan";
	}

}
