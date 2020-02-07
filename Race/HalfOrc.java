
public final class HalfOrc extends Race {
	public HalfOrc()
	{
		this.setRaceName("Half-Orc");
		this.setRaceType(RaceType.HALFORC);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.CON, 1), 
				new Score(Constants.STR, 2)));
		this.setRaceAbilities("Darkvision \n Menacing \n Relentless Endurance \n "
				+ "Savage Attacks");
		this.setAgeAdult(14);
		this.setAgeSpan(75);
		this.setSize(Size.MEDIUM);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.ORCISH));
		this.setBaseSpeed(30);
	}
}
