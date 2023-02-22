package main;

public class Gorilla extends Mammal{
	
	public Gorilla() {}
	
	public void throwSomething() {
		int currentEnergyLevel = super.getEnergyLevel();
		int newEnergyLevel = currentEnergyLevel - 5;
		super.setEnergyLevel(newEnergyLevel);
	}
}
