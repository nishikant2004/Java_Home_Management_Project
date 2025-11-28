🏠 Java Home Management & Automation System

A complete Java-based Home Automation System built using modular OOP design, multiple interfaces, scalable device architecture, and full room-device management.

This project is based on the official case study requirements provided, covering room creation, dynamic device addition, remote control, status checking, and device state duration tracking.


📌 Project Objective

Build a flexible Home Automation System that allows:

Multiple rooms in a house

Each room containing different types of devices

Dynamic addition of devices at runtime

Turning devices ON/OFF remotely

Checking room & device status

Tracking how long a device has been ON/OFF

Supporting future devices without modifying existing code

📁 Project Folder Structure

src/
│
├── device_interfaces/
│     ├── AdjustableVolume.java
│     ├── BedRoomAppliance.java
│     ├── ChannelChangeable.java
│     ├── ColorChangeable.java
│     ├── KitchenAppliance.java
│     ├── LivingRoomAppliance.java
│     ├── ModeChangeable.java
│     ├── SpeedControllable.java
│     ├── TemperatureControllable.java
│     ├── TimeSettable.java
│     ├── WashRoomAppliance.java
│
├── devices/
│     ├── AC.java
│     ├── Device.java
│     ├── Fan.java
│     ├── Fridge.java
│     ├── Geyser.java
│     ├── Light.java
│     ├── TV.java
│
├── room_house/
│     ├── House.java
│     ├── Room.java
│
├── MainClass/
      ├── MainApp.java


🧩 Architecture Summary
✔ 1. device_interfaces/

Contains capability-based interfaces.
Each interface defines one specific behavior, such as:

Switch On/Off (comes from Device base class)

AdjustableVolume → TV

SpeedControllable → Fan

ModeChangeable → AC

TemperatureControllable → AC, Fridge

ColorChangeable → Light

TimeSettable → Geyser

Room-specific markers:

KitchenAppliance

LivingRoomAppliance

BedRoomAppliance

WashRoomAppliance

This design allows devices to have only the abilities they need, keeping the system clean and extensible.

✔ 2. devices/

Contains all device classes.

Device.java → Base class containing:

name

state (ON/OFF)

time tracking (stateChangedTime)

turnOn() / turnOff()

getTimeInCurrentState()

Concrete devices:

AC → temperature, mode, speed

Fan → speed

Fridge → temperature

Geyser → timer

TV → volume + channel

Light → color change

Each device optionally implements the interfaces it needs.

✔ 3. room_house/

Room.java

Stores list of devices added to that room

Operations: add device, view status

House.java

Stores all rooms

Methods to add a room

Retrieve devices room-wise

✔ 4. MainClass/MainApp.java

Contains the main menu-driven console application:

Add room

Add device to any room

Turn device ON/OFF

Show all rooms and device status

Display device active time

🎯 Case Study Requirements Mapping



Case Study Requirement	Your Implementation
House has multiple rooms	House.java manages list of rooms
Each room may have different devices	Room.java stores device list
Add any device dynamically	Menu in MainApp.java
Turn ON/OFF devices remotely	Device.turnOn() / turnOff()
Check status of each room & device	Printed through MainApp status menu
Show how long device is in current state	getTimeInCurrentState()
Should support future devices	Interface-based architecture + base class inheritance
🧠 Key OOP Concepts Used
✔ Inheritance

All devices inherit from Device.java.

✔ Polymorphism

Every device can be referenced using the parent Device type.

✔ Abstraction

Device-specific abilities are implemented via interfaces.

✔ Encapsulation

Private properties + getters/setters across all classes.

✔ Open/Closed Principle

New devices can be added without modifying existing code.

▶️ How to Run the Project

Clone the repository

git clone https://github.com/your-username/Java_Home_Management_Project.git


Import into Eclipse / IntelliJ / VS Code

Run the file:

MainClass/MainApp.java


Use the console menu to manage rooms & devices

📌 Sample Console Features

Add Room (Kitchen, Bedroom, etc.)

Add Device (Fan, AC, Light, TV, Fridge, Geyser, etc.)

Turn any device ON/OFF

List devices by room

Display how long device has been ON

🌟 Future Enhancements

GUI Dashboard using JavaFX / Swing

IoT Integration (ESP32/Raspberry Pi)

REST API for mobile app control

Database storage for device history

Voice assistant integration
