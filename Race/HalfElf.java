
public final class HalfElf extends Race {
	public HalfElf()
	{
		this.setRaceName("Half-Elf");
		this.setRaceType(RaceType.HALFELF);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.CHA, 2)));
		// and +1 to two ability scores of your choice 
		this.setRaceAbilities("Darkvision \n Fey Ancestry \n Skill Versatility");
		this.setAgeAdult(20);
		this.setAgeSpan(180);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.ELVISH));
		// one additional language of your choice
		this.setBaseSpeed(30);
	}
}
