
public final class Dwarf extends Race {
	public Dwarf()
	{
		this.setRaceName("Dwarf");
		this.setRaceType(RaceType.DWARF);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.CON, 2)));
		this.setRaceAbilities("Darkvision \n Dwarven Resilience \n Stonecunning \n "
				+ "Dwarven Combat Training \n Tool Proficiency");
		this.setAgeAdult(50);
		this.setAgeSpan(350);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.DWARVISH));
		this.setBaseSpeed(25);
	}
}
