abstract class Vehicle
{
	int noofwheels;
	String colour;
	String fueltype;
	float speed;
 abstract void start();
 abstract void accelerate();
 abstract void brake();
}
class transportationvehicle extends Vehicle
{
	int noofdoors;
	float loadcapacity;
}
class Van extends transportationvehicle
{
	int noofboxes;
    void start()
	{
		System.out.println("\nThe van is starting.");
	}
    void accelerate()
	{
		System.out.println("The van is accelerating");
	}
    void brake()
	{
		System.out.println("The van is stopping.");
	}
	void loadVan()
	{
		System.out.println("\nVan is loading.");
	}
}
class Truck extends transportationvehicle
{
	int noofboxes;
	float sizeofcontainer;
    void start()
	{
		System.out.println("\nThe Truck is starting.");
	}
    void accelerate()
	{
		System.out.println("The Truck is accelerating");
	}
    void brake()
	{
		System.out.println("The Truck is stopping.");
	}
	void loadTruck()
	{
		System.out.println("Truck loads containers.");
	}
}
public class lab
{
	public static void main(String args[])
	{
		Van v = new Van();
	    v.noofwheels = 4;
		v.colour = "Black";
		v.fueltype = "Petrol";
	    v.speed = 90;
		v.noofdoors = 4;
		v.loadcapacity = 2000;
		v.noofboxes = 14;
		v.start();
		v.accelerate();
		v.brake();
		v.loadVan();
		Truck t = new Truck();
		t.noofwheels = 12;
		t.colour = "Red";
		t.fueltype = "Petrol";
	    t.speed = 76;
		t.noofdoors = 2;
		t.loadcapacity = 17000;
		t.noofboxes = 31;
		t.start();
		t.accelerate();
		t.brake();
		t.loadTruck();
	}
}
