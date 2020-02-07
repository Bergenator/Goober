
public final class Human extends Race {
	public Human()
	{
		this.setRaceName("Human");
		this.setRaceType(RaceType.HUMAN);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.CHA, 1), 
				new Score(Constants.DEX, 1), new Score(Constants.INTEL, 1), 
				new Score(Constants.STR, 1), new Score(Constants.WIS, 1), 
				new Score(Constants.CON, 1)));
		this.setRaceAbilities(null);
		this.setAgeAdult(18);
		this.setAgeSpan(100);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON));
		// one additional language of your choice
		this.setBaseSpeed(30);
	}
}
