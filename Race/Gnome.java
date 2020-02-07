
public final class Gnome extends Race {
	public Gnome()
	{
		this.setRaceName("Gnome");
		this.setRaceType(RaceType.GNOME);
		this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.INTEL, 2)));
		this.setRaceAbilities("Darkvision \n Gnome Cunning");
		this.setAgeAdult(40);
		this.setAgeSpan(500);
		this.setSize(Size.SMALL);
		this.setLangs(new ArrayList<Language>(Language.COMMON, Language.GNOMISH));
		this.setBaseSpeed(25);
	}
}
