/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            DemoHorses.java
 */
package demohorses;
import java.util.*;
/**
 *
 * @author Redindianfred
 */
public class DemoHorses 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String name;
        String color;
        int birth;
        int races;
        Horse aHorse = new Horse();
        RaceHorse rcHrs = new RaceHorse();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the horse name: ");
        name = sc.nextLine();
        aHorse.setName(name);
        System.out.println("Please enter the color of the horse: ");
        color = sc.nextLine();
        aHorse.setColor(color);
        System.out.println("Please enter the year " + name + " was born: ");
        birth = sc.nextInt();
        sc.nextLine();
        aHorse.setYear(birth);
        aHorse.displayHorse();
        
        System.out.println("Please enter the racehorse's name:");
        name = sc.nextLine();
        rcHrs.setName(name);
        System.out.println("Please enter the color of the racehorse: ");
        color = sc.nextLine();
        rcHrs.setColor(color);
        System.out.println("Please enter the year " + name + " was born: ");
        birth = sc.nextInt();
        rcHrs.setYear(birth);
        System.out.println("How many races has " + name + " competed in: ");
        races = sc.nextInt();
        rcHrs.setRaces(races);
        rcHrs.displayHorse();
        
        
        
    } // end of main
    
} // end of class
