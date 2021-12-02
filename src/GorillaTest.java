
public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gorilla harambe = new Gorilla();
		System.out.println(harambe.getEnergyLevel());
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.eatBanana();
		harambe.eatBanana();
		harambe.climb();
		System.out.println(harambe.getEnergyLevel());
		
		
		Bat batman = new Bat();
		System.out.println(batman.getEnergyLevel());
		batman.attackTown();
		batman.attackTown();
		batman.attackTown();
		batman.eatHumans();
		batman.eatHumans();
		batman.fly();
		batman.fly();
		System.out.println(batman.getEnergyLevel());
	}

}
