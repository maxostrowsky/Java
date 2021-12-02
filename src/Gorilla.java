
public class Gorilla extends Mammal {

	public Gorilla() {
		
	}

	public void throwSomething(){
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("RAWRRRRRR!!! Watch out!!!");
	}
	
	public void eatBanana(){
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("NOM NOM NOM!! Hes Hungry!!!");
	}
	
	public void climb(){
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("Leaves falling and Branches breaking");
	}
}
