package b.creational.e.prototype;

public class PrototypeDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		// SwordsMan example
		Swordsman swordsman = new Swordsman();
		System.out.println("swordsman1: " + swordsman);
		
		swordsman.move(10, 20, 30);
		swordsman.attack();
		System.out.println("swordsman2: " + swordsman);
		
		Swordsman cloneSwordsman = (Swordsman) swordsman.clone();
		System.out.println("cloneSwordsman: " + cloneSwordsman);
		
		
		
		// MajorGeneral example
		MajorGeneral majorGeneral = new MajorGeneral();
		System.out.println("majorGeneral1: " + majorGeneral);
		
		majorGeneral.boostMorale();
		majorGeneral.move(1, 2, 4);
		System.out.println("majorGeneral2: " + majorGeneral);
		
		MajorGeneral cloneMajorGeneral = (MajorGeneral) majorGeneral.clone();
		System.out.println("cloneMajorGeneral: " + cloneMajorGeneral);
	}
}
