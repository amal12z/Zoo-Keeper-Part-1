package zookeeperpartone;

public class Mammal {
	
	// 1- Create a Mammal class that has an energyLevel member variable and displayEnergy() method. 
	// The displayEnergy() method should show the animal's energy level as well as return it.
	
	// First way : to set default value to member variables 
		// private int energyLevel = 100;
	// Second way :
	protected int energyLevel; // then initialize variable value in the CONSTRUCTOR
	// to apply encapsulation : we declare this member variable as a (private)
	
	// CONSTRUCTOR :
	public Mammal(){
		this.energyLevel=100;
		//OR : energyLevel=100; 
	}
	// first method 
	public int displayEnergy() {
		System.out.println("Energy Level =" + energyLevel);
		return energyLevel;
	}
	
	// getter : to get energyLevel value outside this class
	//	public int getEnergyLevel() {
	//		return energyLevel;
	//	}
	

}
