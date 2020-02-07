
public final class Tiefling extends Race {
	public Tiefling()
	{
		this.setRaceName("Tiefling");
		this.setRaceType(RaceType.TIEFLING);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.CHA, 2), 
				new Score(Constants.INTEL, 1)));
		this.setRaceAbilities("Darkvision \n Hellish Resistance \n Infernal Legacy");
		this.setAgeAdult(18);
		this.setAgeSpan(120);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.INFERNAL));
		this.setBaseSpeed(30);
	}
}
