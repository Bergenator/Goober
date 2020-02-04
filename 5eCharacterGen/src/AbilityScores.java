import java.util.*; 

public class AbilityScores 
{    
    private int cha;
    private int dex;
    private int intel;
    private int str;
    private int wis;
    private int con;
    RollRandom myDice;
    
    
    
    public AbilityScores(int myCha, int myDex, int myIntel, int myStr, int myWis, int myCon)
    {
        myDice = new RollRandom();
        if (myCha == -1)
        {
            cha = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            cha = myCha;
        }
        if (myDex == -1)
        {
            dex = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            dex = myDex;
        }
        if (myIntel == -1)
        {
            intel = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            intel = myIntel;
        }
        if (myStr == -1)
        {
            str = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            str = myStr;
        }
        if (myWis == -1)
        {
            wis = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            wis = myWis;
        }
        if (myCon == -1)
        {
            con = myDice.sum(myDice.select(4,3,6,true));
        }
        else
        {
            con = myCon;
        }
    }
    
    public String toString()
    {
        String scores = "";
        scores += "CHA: " + cha + "\n";
        scores += "DEX: " + dex + "\n";
        scores += "INT: " + intel + "\n";
        scores += "STR: " + str + "\n";
        scores += "WIS: " + wis + "\n";
        scores += "CON: " + con + "\n";
        return scores;
    }
    
    public void setCha(int cha) {
        this.cha = cha;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getCha() {
        return cha;
    }

    public int getDex() {
        return dex;
    }

    public int getIntel() {
        return intel;
    }

    public int getStr() {
        return str;
    }

    public int getWis() {
        return wis;
    }

    public int getCon() {
        return con;
    }
    
    public int[] highestScores()
    {
        int [] highest = new int[3];
        ArrayList<Integer> scores = new ArrayList<Integer>();
        ArrayList<Integer> names = new ArrayList<Integer>();
        scores.add(cha); // ties will prefer earlier items on the list. Need to find a solution, perhaps randomizing the order?
        scores.add(dex);
        scores.add(intel);
        scores.add(str);
        scores.add(wis);
        scores.add(con);
        names.add(Constants.CHA);
        names.add(Constants.DEX);
        names.add(Constants.INTEL);
        names.add(Constants.STR);
        names.add(Constants.WIS);
        names.add(Constants.CON);
        
        for(int i = 0; i < 3; i++)
        {
            int currentMax = 0;
            for(int j = 0; j < scores.size(); j++)
            {
                if(scores.get(j) > scores.get(currentMax))
                {
                    currentMax = j;
                }
            }
            highest[i] = names.get(currentMax);
            names.remove(currentMax);
            scores.remove(currentMax);
        }
        
        return highest;
    }
    
    public static void main(String[] args)
    {
        /*AbilityScores scores = new AbilityScores(-1,-1,-1,-1,-1,-1);
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
        
        
    }
}

