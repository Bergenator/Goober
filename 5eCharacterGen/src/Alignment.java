public class Alignment 
{
    private Behavior behavior;
    private Morality morality;
    
    public Alignment(int behav, int moral)
    {
        RollRandom dice = new RollRandom();
        
        if(behav != 0 && behav != 1 && behav != 2)
        {
            int choice = dice.rollDice(1,3);
            switch(choice)
            {
                case 1:
                    behavior = Behavior.LAWFUL;
                    break;
                case 2:
                    behavior = Behavior.NEUTRAL;
                    break;
                case 3:
                    behavior = Behavior.CHAOTIC;
                    
            }
        }
        else
        {
             switch(behav)
            {
                case 0:
                    behavior = Behavior.LAWFUL;
                    break;
                case 1:
                    behavior = Behavior.NEUTRAL;
                    break;
                case 2:
                    behavior = Behavior.CHAOTIC;
                    
            }
        }
        
        if(moral != 0 && moral != 1 && moral != 2)
        {
            int choice = dice.rollDice(1,3);
            switch(choice)
            {
                case 1:
                    morality = Morality.GOOD;
                    break;
                case 2:
                    morality = Morality.NEUTRAL;
                    break;
                case 3:
                    morality = Morality.EVIL;
                    
            }
        }
        else
        {
             switch(moral)
            {
                case 0:
                    morality = Morality.GOOD;
                    break;
                case 1:
                    morality = Morality.NEUTRAL;
                    break;
                case 2:
                    morality = Morality.EVIL;
                    
            }
        }
    }
    
    public String getBehavior()
    {
        if(behavior == behavior.LAWFUL)
        {
            return "LAWFUL";
        }
        else if(behavior == behavior.NEUTRAL)
        {
            return "NEUTRAL";
        }
        else return "CHAOTIC";
    }
    
    public String getMorality()
    {
        if(morality == Morality.GOOD)
        {
            return "GOOD";
        }
        else if(morality == Morality.NEUTRAL)
        {
            return "NEUTRAL";
        }
        else return "EVIL";
    }
    
    public String toString()
    {
        if(behavior == Behavior.NEUTRAL && morality == Morality.NEUTRAL)
        {
            return "TRUE NEUTRAL";
        }
        else return this.getBehavior() + " " + this.getMorality();
    }
}


