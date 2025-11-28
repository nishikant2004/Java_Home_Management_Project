package devices;

import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Device {
	String deviceName;
	boolean isOn;
	LocalDateTime stateChangedTime;
	
	
	public Device() {
		
	}

	public Device(String deviceName) {
		super();
		this.deviceName = deviceName;
		this.isOn = false;
		this.stateChangedTime = LocalDateTime.now();
	}

	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public boolean getIsOn() {
		return isOn;
	}
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	public LocalDateTime getStateChangedTime() {
		return stateChangedTime;
	}
	public void setStateChangedTime(LocalDateTime stateChangedTime) {
		this.stateChangedTime = stateChangedTime;
	}
	
	public void turnOn() {
		if(!isOn) {
			setIsOn(true);
			stateChangedTime=LocalDateTime.now();
		}
	}
	public void turnOff() {
		if(isOn) {
			setIsOn(false);
			stateChangedTime=LocalDateTime.now();
		}
		
		
	}
	public long getTimeInCurrentState() {
		
		  return java.time.Duration.between(stateChangedTime, LocalDateTime.now()).toMinutes();

	}
	 public abstract String getDeviceType();
	 
	 public String  showStatus() {
		 return deviceName + " (" + getDeviceType() + ") → " +
	                (isOn ? "ON" : "OFF") + " | Time in state: " +
	                getTimeInCurrentState() + " minutes";
	 }
	 	
}
