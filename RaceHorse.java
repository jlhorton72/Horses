/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            RaceHorses.java
 */
package demohorses;

/**
 *
 * @author Redindianfred
 */
public class RaceHorse extends Horse 
{
    private int numRaces;
    
    public int getRaces()
    {
        return numRaces;
    } // end of getRaces
    
    public void setRaces(int races)
    {
        numRaces = races;
    } // end of setRaces
    
    @Override
    public void displayHorse()
    {
        super.displayHorse();
        System.out.println("And i have raced " + numRaces + " times!");
    } // end of override displayHorse
    
} // end of RaceHorse
