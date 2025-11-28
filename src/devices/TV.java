package devices;
import device_interfaces.AdjustableVolume;
import device_interfaces.BedRoomAppliance;
import device_interfaces.ChannelChangeable;
import device_interfaces.LivingRoomAppliance;

public class TV extends Device implements ChannelChangeable,LivingRoomAppliance,BedRoomAppliance,AdjustableVolume{

	private int volume=1;
	private int channel=10;
	
	
	public TV(String name) {
		super(name);
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "TV";
	}


	@Override
	public void increaseVolume() {
		volume++;	
		System.out.println("Volume : "+ volume);
		
	}


	@Override
	public void decreaseVolume() {
		volume--;	
		System.out.println("Volume : "+ volume);
	}


	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		channel++;
		System.out.println("Channel :"+ channel);
		
	}


	@Override
	public void previousChannel() {
		channel--;
		System.out.println("Channel :"+ channel);
		
	}
	

}
