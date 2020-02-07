
public abstract class Race {
	private RaceType type;
	private String raceName;
	private ArrayList<Scores> abilityBonuses;
	private String raceAbilities;
	private int ageAdult, ageSpan;
	private Size size;
	private ArrayList<Language> languages;
	private int baseSpeed;
	
	public enum RaceType
	{
		AASIMAR, DRAGONBORN, DWARF, ELF, FIRBOLG, 
		GNOME, GOLIATH, HALFLING, HALFELF, HALFORC, 
		HUMAN, KENKU, LIZARDFOLK, TABAXI, TIEFLING,
		TRITON;
	}
	public enum Size
	{
		TINY, SMALL, MEDIUM, LARGE, HUGE;
	}
	public enum Language
	{
		COMMON, ELVISH, DWARVISH, DRACONIC, HALFLING,
		PRIMORDIAL, INFERNAL, GNOMISH, ORCISH, ABYSSAL,
		DRUIDIC, SYLVAN, UNDERCOMMON, CELESTIAL, GIANT,
		DEEPSPEECH, GOBLIN;
	}
	
	public String getRaceName() {return raceName;}
	public ArrayList<Scores> getAbilityBonuses() {return abilityBonuses;}
	public String getRaceAbilities() {return raceAbilities;}
	public int getAgeAdult() {return ageAdult;}
	public int getAgeSpan() {return ageSpan;}
	public Size getSize() {return size;}
	public ArrayList<Language> getLangs() {return languages;}
	public int getBaseSpeed() {return baseSpeed;}
	protected String setRaceName() {return raceName;}
	protected ArrayList<Scores> setAbilityBonuses() {return abilityBonuses;}
	protected String setRaceAbilities() {return raceAbilities;}
	protected int setAgeAdult() {return ageAdult;}
	protected int setAgeSpan() {return ageSpan;}
	protected Size setSize() {return size;}
	protected ArrayList<Language> setLangs() {return languages;}
	protected int setBaseSpeed() {return baseSpeed;}
	
	public static RaceType randomRace()
	{
		int i = (int)(Math.random()*RaceType.getEnumConstants().length);
		return RaceType.getEnumConstants()[i];
	}
}

