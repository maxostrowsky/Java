
public class Mammal {
	
	private int energyLevel = 100;

	
	public void displayEnergy() {
		System.out.println(this.getEnergyLevel());
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
