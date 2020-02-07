
public final class Dragonborn extends Race {
	
	public Dragonborn()
	{
		this.setRaceName("Dragonborn");
		this.setRaceType(RaceType.DRAGONBORN);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.STR, 2), new Score(Constants.CHA, 1)));
		this.setRaceAbilities("Draconic Ancestry \n Breath Weapon \n Damage Resistance");
		this.setAgeAdult(15);
		this.setAgeSpan(80);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.DRACONIC));
		this.setBaseSpeed(30);
	}
}
