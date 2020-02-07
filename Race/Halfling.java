
public final class Halfling {
	this.setRaceName("Halfling");
	this.setRaceType(RaceType.HALFLING);
	this.setAbilityBonuses(new ArrayList<Scores>(new Score(Constants.DEX, 2)));
	this.setRaceAbilities("Lucky \n Brave \n Halfling Nimbleness");
	this.setAgeAdult(20);
	this.setAgeSpan(250);
	this.setSize(Size.SMALL);
	this.setLangs(new ArrayList<Language>(Language.COMMON, Language.HALFLING));
	this.setBaseSpeed(25);
}
