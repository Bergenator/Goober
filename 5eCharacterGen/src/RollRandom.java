import java.util.*; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goolsbey
 */
public class RollRandom 
{
    public RollRandom()
    {
        
    }
    
    public int rollDice(int numDice, int dieMax)
    {
        int total = 0;
        for(int i = 1; i <= numDice; i++)
        {
            int rand = ((int)(Math.random()*(dieMax)))+1;
            total += rand;
        }
        return total;
    }
    
    public ArrayList<Integer> select(int totalRolls, int numSelect, int dieMax, boolean highest)
    {
        ArrayList<Integer> values = new ArrayList<>();
        // minMax: 0 = min, 1 = max
        if(highest)
        {
            for(int i = 0; i < totalRolls; i++)
            {
                values.add(this.rollDice(1,dieMax));
                if(values.size() > numSelect)
                {
                    int min = 0;
                    for(int j = 1; j < values.size(); j++)
                    {
                        if (values.get(j) < values.get(min))
                        {
                            min = j;
                        }
                    }
                    values.remove(min);
                }
            }
        }
        else
        {
            for(int i = 0; i < totalRolls; i++)
            {
                values.add(this.rollDice(1,dieMax));
                if(values.size() > numSelect)
                {
                    int max = 0;
                    for(int j = 1; j < values.size(); j++)
                    {
                        if (values.get(j) > values.get(max))
                        {
                            max = j;
                        }
                    }
                    values.remove(max);
                }
            }
        }
        return values;
    }
    
    public int sum(ArrayList<Integer> values)
    {
        int mySum = 0;
        for(int i = 0; i < values.size(); i++)
        {
            mySum += values.get(i);
        }
        return mySum;
    }
    
}



