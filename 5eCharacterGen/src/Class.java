public class Class 
{   
    String className;
    
    public enum charClass
    {
        BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, 
        MONK, PALADIN, RANGER, ROGUE, SORCERER, 
        WARLOCK, WIZARD
    }
    
    public Class(AbilityScores myScores)
    {
        className = "";
        
        int barbPoints = 0, bardPoints = 0, clerPoints = 0, druidPoints = 0, fightPoints = 0,
                monkPoints = 0, palPoints = 0, rangePoints = 0, roguePoints = 0, sorcePoints = 0,
                warPoints = 0, wizPoints = 0;
        
        boolean barbEleg = true, bardEleg = true, clerEleg = true, druidEleg = true, fightEleg = true,
                monkEleg = true, palEleg = true, rangeEleg = true, rogueEleg = true, sorceEleg = true,
                warEleg = true, wizEleg = true;
        
        int[] highest = myScores.highestScores();
        
        /*CHA = 0, DEX = 1, INTEL = 2, STR = 3, WIS = 4, CON = 5*/
        
        if(highest[0] == Constants.STR && highest[1] == Constants.CON || highest[0] == Constants.CON && highest[1] == Constants.STR)
        {
            barbPoints += 20;
            fightPoints += 10;
        }
       
        if(highest[0] == Constants.DEX && highest[1] == Constants.CHA || highest[0] == Constants.CHA && highest[1] == Constants.DEX)
        {
            bardPoints += 20;
            roguePoints += 10;
            sorcePoints += 4;
            warPoints += 4;
        }
        if(highest[0] == Constants.WIS && highest[1] == Constants.STR || highest[0] == Constants.STR && highest[1] == Constants.WIS)
        {
            clerPoints += 10;
            rangePoints += 4;
        }
        if(highest[0] == Constants.WIS && highest[1] == Constants.CON || highest[0] == Constants.CON && highest[1] == Constants.WIS)
        {
            clerPoints += 10;
            druidPoints += 20;
        }
        if(highest[0] == Constants.DEX && highest[1] == Constants.CON || highest[0] == Constants.CON && highest[1] == Constants.DEX)
        {
            fightPoints += 10;
        }
        if(highest[0] == Constants.DEX && highest[1] == Constants.WIS || highest[0] == Constants.WIS && highest[1] == Constants.DEX)
        {
            monkPoints += 20;
            rangePoints += 16;
        }
        if(highest[0] == Constants.STR && highest[1] == Constants.CHA || highest[0] == Constants.CHA && highest[1] == Constants.STR)
        {
            palPoints += 20;
        }
        if(highest[0] == Constants.DEX && highest[1] == Constants.INTEL || highest[0] == Constants.INTEL && highest[1] == Constants.DEX)
        {
            roguePoints += 10;
            wizPoints += 10;
        }
        if(highest[0] == Constants.CHA && highest[1] == Constants.CON || highest[0] == Constants.CON && highest[1] == Constants.CHA)
        {
            sorcePoints += 16;
            warPoints += 16;
        }
        if(highest[0] == Constants.INTEL && highest[1] == Constants.CON || highest[0] == Constants.CON && highest[1] == Constants.INTEL)
        {
            wizPoints += 10;
        }
        
        // requisites
        if(myScores.getCha() < 13)
        {
            sorceEleg = false;
            palEleg = false;
            warEleg = false;
            bardEleg = false;
        }
        else
        {
            sorcePoints += 2;
            palPoints += 2;
            warPoints += 2;
            bardPoints += 2;
        }
        if(myScores.getDex() < 13)
        {
            monkEleg = false;
            rogueEleg = false;
        }
        else
        {
            monkPoints += 2;
            roguePoints += 2;
        }
        if(myScores.getDex() < 13 && myScores.getStr() < 13)
        {
            fightEleg = false;
            rangeEleg = false;
        }
        else
        {
            fightPoints += 2;
            rangePoints += 2;
        }
        if(myScores.getDex() < 13 && myScores.getCon() < 13)
        {
            wizEleg = false;
            warEleg = false;
            sorceEleg = false;
        }
        else
        {
            wizPoints += 2;
            warPoints += 2;
            sorcePoints += 2;
        }
        
        if(myScores.getStr() < 13 && myScores.getCon() < 13)
        {
            clerEleg = false;
        }
        else
        {
            clerPoints += 2;
        }
        if(myScores.getIntel() < 13)
        {
            wizEleg = false;        
        }
        else
        {
            wizPoints += 2;
        }
        if(myScores.getStr() < 13)
        {
            barbEleg = false;
            palEleg = false;
        }
        else
        {
            barbPoints += 2;
            palPoints += 2;
        }
        if(myScores.getWis() < 13)
        {
            clerEleg = false;
            druidEleg = false;
            monkEleg = false;
            rangeEleg = false;
        }
        else
        {
            clerPoints += 2;
            druidPoints += 2;
            monkPoints += 2;
            rangePoints += 2;
        }
        if(myScores.getCon() < 13)
        {
            barbEleg = false;
            fightEleg = false;
            druidEleg = false;
        }
        else
        {
            barbPoints += 2;
            fightPoints += 2;
            druidPoints += 2;
        }
        if(myScores.getIntel() < 13 && myScores.getCha() < 13)
        {
            rogueEleg = false;
        }
        else
        {
            roguePoints += 2;
        }
        
        if (!barbEleg)
            barbPoints = 0;
        if (!bardEleg)
            bardPoints = 0;
        if (!clerEleg)
            clerPoints = 0;
        if (!druidEleg)
            druidPoints = 0;
        if (!fightEleg)
            fightPoints = 0;
        if (!monkEleg)
            monkPoints = 0;
        if (!palEleg)
            palPoints = 0;
        if (!rangeEleg)
            rangePoints = 0;
        if (!rogueEleg)
            roguePoints = 0;
        if (!sorceEleg)
            sorcePoints = 0;
        if (!warEleg)
            warPoints = 0;
        if (!wizEleg)
            wizPoints = 0;
        
        System.out.println("Barbarian:" + barbPoints);
        System.out.println("Bard:" + bardPoints);
        System.out.println("Cleric:" + clerPoints);
        System.out.println("Druid:" + druidPoints);
        System.out.println("Fighter:" + fightPoints);
        System.out.println("Monk:" + monkPoints);
        System.out.println("Paladin:" + palPoints);
        System.out.println("Ranger:" + rangePoints);
        System.out.println("Rogue:" + roguePoints);
        System.out.println("Sorcerer:" + sorcePoints);
        System.out.println("Warlock:" + warPoints);
        System.out.println("Wizard:" + wizPoints);
        
        int barbMax = barbPoints;
        int bardMax = barbMax + bardPoints;
        int clerMax = bardMax + clerPoints;
        int druidMax = clerMax + druidPoints;
        int fightMax = druidMax + fightPoints;
        int monkMax = fightMax + monkPoints;
        int palMax = monkMax + palPoints;
        int rangeMax = palMax + rangePoints;
        int rogueMax = rangeMax + roguePoints;
        int sorceMax = rogueMax + sorcePoints;
        int warMax = sorceMax + warPoints;
        int wizMax = warMax + wizPoints;
        
        RollRandom dice = new RollRandom();
        int choice = dice.rollDice(1, wizMax);
        
        System.out.println("Barb range:" + barbMax);
        System.out.println("Bard range:" + bardMax);
        System.out.println("Cleric range:" + clerMax);
        System.out.println("Druid range:" + druidMax);
        System.out.println("Fight range:" + fightMax);
        System.out.println("Monk range:" + monkMax);
        System.out.println("Pal range:" + palMax);
        System.out.println("Range range:" + rangeMax);
        System.out.println("Rogue range:" + rogueMax);
        System.out.println("Sorce range:" + sorceMax);
        System.out.println("War range:" + warMax);
        System.out.println("Wiz range:" + wizMax);


        
        System.out.println("RNG:" + choice);
        
        if(choice <= barbMax && barbEleg == true)
        {
            className = "BARBARIAN";
        }
        else if(choice <= bardMax && bardEleg == true)
        {
            className = "BARD";
        }
        else if(choice <= clerMax && clerEleg == true)
        {
            className = "CLERIC";
        }
        else if(choice <= druidMax && druidEleg == true)
        {
            className = "DRUID";
        }
        else if(choice <= fightMax && fightEleg == true)
        {
            className = "FIGHTER";
        }
        else if(choice <= monkMax && monkEleg == true)
        {
            className = "MONK";
        }
        else if(choice <= palMax && palEleg == true)
        {
            className = "PALADIN";
        }
        else if(choice <= rangeMax && rangeEleg == true)
        {
            className = "RANGER";
        }
        else if(choice <= rogueMax && rogueEleg == true)
        {
            className = "ROGUE";
        }
        else if(choice <= sorceMax && sorceEleg == true)
        {
            className = "SORCERER";
        }
        else if(choice <= warMax && warEleg == true)
        {
            className = "WARLOCK";
        }
        else if(choice <= wizMax && wizEleg == true)
        {
            className = "WIZARD";
        }
        
        //System.out.println("This character has been assigned: " + className);
        
        
    }

    public String getClassName()
    {
        return className;
    }
}

