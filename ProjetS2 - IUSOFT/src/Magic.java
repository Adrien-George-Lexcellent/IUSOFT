public abstract class Magic extends Creature {
	
	protected Magic(int soulCost, int neededSanity, int neededResistance, int neededIntelligence, int health, int attack, int defense, String trigger, String type) {
		super(soulCost, neededSanity, neededResistance, neededIntelligence, health,	attack, defense, trigger, type);
	}

	public void domainEffect() {
		//TODO
	}
}