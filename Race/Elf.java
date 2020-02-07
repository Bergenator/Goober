
public final class Elf extends Race {
	public Elf()
	{
		this.setRaceName("Elf");
		this.setRaceType(RaceType.ELF);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.DEX, 2)));
		this.setRaceAbilities("Darkvision \n Keen Senses \n Fey Ancestry \n Trance");
		this.setAgeAdult(100);
		this.setAgeSpan(750);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.ELVISH));
		this.setBaseSpeed(30);
	}
}
