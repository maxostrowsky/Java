
public class Bat extends Mammal {

	public Bat() {
		// TODO Auto-generated constructor stub
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		setEnergyLevel(getEnergyLevel() - 50);
		System.out.println("TAKE-OFF in 3....2....1!!!");
	}
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("I want to suck your blood");
	}
	public void attackTown() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("BURNNN!!!!!!");
	}
}
