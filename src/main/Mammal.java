package main;

public class Mammal {
	private Integer energyLevel = 100;
	
	public Mammal() {}

	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

	public void displayEnergy() {
		System.out.println("Energy Level : " + energyLevel);
	}
}
