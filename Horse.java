/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            Horses.java
 */
package demohorses;

/**
 *
 * @author Redindianfred
 */
public class Horse 
{
    private String name;
    private String color;
    private int birthYear;
    
    public void setName(String nme)
    {
        name = nme;
    } // end of setName
    
    public void setColor(String clr)
    {
        color = clr;
    } // end of setColor
    
    public void setYear(int year)
    {
        birthYear = year;
    } // end of setYear
    
    public String getName()
    {
        return name;
    } // end of getName
    
    public String getColor()
    {
        return color;
    } // end of getColor
    
    public int getBirth()
    {
        return birthYear;
    } // end of getBirth
    
    public void displayHorse()
    {
        System.out.println("My name is " + name);
        System.out.println("I am " + color);
        System.out.println("And I was born in " + birthYear);
    } // end of displayHorse
    
    
//    public void Horse(String nme, String clr, int year)
//    {
//        this.name = nme;
//        this.color = clr;
//        this.birthYear = year;
//    } // end of Horse
    
} // end of class Horse
