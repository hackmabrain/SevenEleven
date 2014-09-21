package com.seveneleven.implementation;

import java.util.Random;


public class Die
{   public static final int DEFAULT_SIDES = 6;

    private static Random randomGenerator = new Random();

    private final int numSides;
    private int result;


    
    public Die()
    {   this(DEFAULT_SIDES);
    }


    
    public Die(int numSides)
    {   if(numSides < 1)
    		throw new IllegalArgumentException("Violation of precondition: numSides = " + numSides + "numSides must be greater than 1");

        this.numSides = numSides;
        result = 1;
    }


    
    public Die(int numSides, int result)
    {   if(numSides < 1 && 1>= result && result >= numSides) 
    		throw new IllegalArgumentException("Violation of precondition: numSides ="+ numSides +" numSides must be greater than 1 and result = "+result+"result must be in between and inclusive of  1 and numsides");

        this.numSides = numSides;
        this.result = result;
    }


    
    public int roll()
    {   result = randomGenerator.nextInt(numSides) + 1;

        assert ( 1 <= getResult() ) && ( getResult() <= getNumSides() );

        return result;
    }


    
    public int getNumSides()
    {   return numSides; }


   
    public int getResult()
    {   return result;   }


   
    public boolean equals(Object otherObj)
    {   boolean result = true;
        if(otherObj == null)
            result = false;
        else if(this == otherObj)
            result = true;
        else if(this.getClass() != otherObj.getClass())
            result = false;
        else
        {   Die otherDie = (Die)otherObj;
            result = this.result == otherDie.result
                && this.numSides == otherDie.numSides;
        }
        return result;
    }


   
    public String toString()
    {   return "Num sides " + getNumSides() + " result " + getResult();
    }


}// end of Die class

