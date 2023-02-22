package main;

public class Gorilla extends Mammal{
	
	public Gorilla() {}
	
	public void throwSomething() {
		System.out.println("----- THROWING SOMETHING ----");
		int currentEnergyLevel = super.getEnergyLevel();
		int newEnergyLevel = currentEnergyLevel - 5;
		super.setEnergyLevel(newEnergyLevel);
	}
	
	public void eatBananas() {
		System.out.println("----- EATING BANANAS ----");
		int currentEnergyLevel = super.getEnergyLevel();
		int newEnergyLevel = currentEnergyLevel + 10;
		super.setEnergyLevel(newEnergyLevel);
	}
	
	public void climb() {
		System.out.println("----- CLIMBING ----");
		int currentEnergyLevel = super.getEnergyLevel();
		int newEnergyLevel = currentEnergyLevel - 10;
		super.setEnergyLevel(newEnergyLevel);
	}
}
