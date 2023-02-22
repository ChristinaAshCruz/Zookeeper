package main;

public class Bat extends Mammal{
	private Integer energyLevel = 300;
	
	public Bat() {}
	
	public void fly() {
		System.out.println("----- FLYING ----");
		int currentEnergyLevel = energyLevel;
		int newEnergyLevel = currentEnergyLevel - 50;
		super.setEnergyLevel(newEnergyLevel);
	}
	
	public void eatHumans() {
		System.out.println("----- EATING HUMANS ----");
		int currentEnergyLevel = energyLevel;
		int newEnergyLevel = currentEnergyLevel - 25;
		super.setEnergyLevel(newEnergyLevel);
	}
	
	public void attackTown() {
		System.out.println("----- ATTACKING TOWN ----");
		int currentEnergyLevel = energyLevel;
		int newEnergyLevel = currentEnergyLevel - 100;
		super.setEnergyLevel(newEnergyLevel);
	}
}
