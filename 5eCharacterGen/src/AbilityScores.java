import java.util.*; 

public class AbilityScores 
{   
    private Score cha;
    private Score dex;
    private Score intel;
    private Score str;
    private Score wis;
    private Score con;
    RollRandom myDice;
    
    
    
    public AbilityScores(int myCha, int myDex, int myIntel, int myStr, int myWis, int myCon)
    {
        myDice = new RollRandom();
        
        cha = new Score();
        dex = new Score();
        intel = new Score();
        str = new Score();
        wis = new Score();
        con = new Score();
        
        cha.type = Constants.CHA;
        dex.type = Constants.DEX;
        intel.type = Constants.INTEL;
        str.type = Constants.STR;
        wis.type = Constants.WIS;
        con.type = Constants.CON;
        
        if (myCha == -1)
        {
            cha.value = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            cha.value = myCha;
        }
        if (myDex == -1)
        {
            dex.value = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            dex.value = myDex;
        }
        if (myIntel == -1)
        {
            intel.value = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            intel.value = myIntel;
        }
        if (myStr == -1)
        {
            str.value = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            str.value = myStr;
        }
        if (myWis == -1)
        {
            wis.value = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            wis.value = myWis;
        }
        if (myCon == -1)
        {
            con.value = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            con.value = myCon;
        }
    }
    
    public String toString()
    {
        String scores = "";
        scores += "CHA: " + cha.value + "\n";
        scores += "DEX: " + dex.value + "\n";
        scores += "INT: " + intel.value + "\n";
        scores += "STR: " + str.value + "\n";
        scores += "WIS: " + wis.value + "\n";
        scores += "CON: " + con.value + "\n";
        return scores;
    }
    
    public void setCha(int cha) {
        this.cha.value = cha;
    }

    public void setDex(int dex) {
        this.dex.value = dex;
    }

    public void setIntel(int intel) {
        this.intel.value = intel;
    }

    public void setStr(int str) {
        this.str.value = str;
    }

    public void setWis(int wis) {
        this.wis.value = wis;
    }

    public void setCon(int con) {
        this.con.value = con;
    }

    public int getCha() {
        return cha.value;
    }

    public int getDex() {
        return dex.value;
    }

    public int getIntel() {
        return intel.value;
    }

    public int getStr() {
        return str.value;
    }

    public int getWis() {
        return wis.value;
    }

    public int getCon() {
        return con.value;
    }
    
    public int[] highestScores()
    {
        int [] highest = new int[3];
        ArrayList<Score> scores = new ArrayList<Score>();
        scores.add(cha); // ties will prefer earlier items on the list. Need to find a solution, perhaps randomizing the order?
        scores.add(dex);
        scores.add(intel);
        scores.add(str);
        scores.add(wis);
        scores.add(con);
        
        Collections.shuffle(scores);
        
        for(int i = 0; i < 3; i++)
        {
            int currentMax = 0;
            for(int j = 0; j < scores.size(); j++)
            {
                if(scores.get(j).value > scores.get(currentMax).value)
                {
                    currentMax = j;
                }
            }
            highest[i] = scores.get(currentMax).type;
            scores.remove(currentMax);
        }
        
        return highest;
    }
    
    public static void main(String[] args)
    {
        /*AbilityScores scores = new AbilityScores(13,13,13,13,13,13);
        Class myClass = new Class(scores);
        System.out.println(scores.toString());
        System.out.println(Arrays.toString(scores.highestScores()));*/
        
        int barbCount = 0, bardCount = 0, clerCount = 0, druidCount = 0,
                fightCount = 0, monkCount = 0, palCount = 0, rangeCount = 0,
                rogueCount = 0, sorceCount = 0, warCount = 0, wizCount = 0;
        int nope = 0;
        
        for(int i = 0; i < 200; i++)
        {
            AbilityScores scores = new AbilityScores(-1,-1,-1,-1,-1,-1);
            Class myClass = new Class(scores);
            if(myClass.className.equals("BARBARIAN"))
            {
                barbCount++;
            }
            else if(myClass.className.equals("BARD"))
            {
                bardCount++;
            }
            else if(myClass.className.equals("CLERIC"))
            {
                clerCount++;
            }
            else if(myClass.className.equals("DRUID"))
            {
                druidCount++;
            }
            else if(myClass.className.equals("FIGHTER"))
            {
                fightCount++;
            }
            else if(myClass.className.equals("MONK"))
            {
                monkCount++;
            }
            else if(myClass.className.equals("PALADIN"))
            {
                palCount++;
            }
            else if(myClass.className.equals("RANGER"))
            {
                rangeCount++;
            }
            else if(myClass.className.equals("ROGUE"))
            {
                rogueCount++;
            }
            else if(myClass.className.equals("SORCERER"))
            {
                sorceCount++;
            }
            else if(myClass.className.equals("WARLOCK"))
            {
                warCount++;
            }
            else if(myClass.className.equals("WIZARD"))
            {
                wizCount++;
            }
            else nope++;
            
        }
        
        System.out.println("Barbarian:" + barbCount);
        System.out.println("Bard:" + bardCount);
        System.out.println("Cleric:" + clerCount);
        System.out.println("Druid:" + druidCount);
        System.out.println("Fighter:" + fightCount);
        System.out.println("Monk:" + monkCount);
        System.out.println("Paladin:" + palCount);
        System.out.println("Ranger:" + rangeCount);
        System.out.println("Rogue:" + rogueCount);
        System.out.println("Sorcerer:" + sorceCount);
        System.out.println("Warlock:" + warCount);
        System.out.println("Wizard:" + wizCount);
        System.out.println(nope + " characters were not assigned a class.");
        
        
        // random comment...
        
        
    }
}

