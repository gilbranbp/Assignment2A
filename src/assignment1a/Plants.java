package assignment1a;
import java.util.Scanner;

abstract class PlantsProgram                                                    //abstract class declared
{
    public void welcome()
    {
        System.out.println("Welcome to the Seed Buying Program!");
    }
    
}
class Plants extends PlantsProgram                                                
{
    Scanner input = new Scanner(System.in);
    
    private String plantType;
    private String user;
    private String username;
    private double price = 0.0, totalPrice = 0.0;
    private int seed = 0;
    
    public Plants()
    {
        this.plantType = "Mango Tree";
        this.user = "Muhammad Sri Gilbran";
        this.price = 1250.00;
    }
    
    public Plants(String username)
    {
        this.username = username;
    }
    
    public void printUsername(String user)                                      //Polymorphism declared by setting up methods with parameters in the sub class
    {
        user = username;
        System.out.println(username);
    }
    
    public void setPlantType(String plantType)
    {
        this.plantType = plantType;
    }
    
    public void setUser(String user)
    {
        this.user = user;
    }
    
    public void setPrice(String plantType)
    {
        this.plantType = plantType;
        
        if (plantType.equalsIgnoreCase("Mango"))
        {
            price = 1250.00;
            System.out.println("How many seeds you wanna buy? ");
            seed = input.nextInt();
            
            totalPrice = seed * price;
        }
        else if (plantType.equalsIgnoreCase("Rambutan"))
        {
            price = 1500.00;
            System.out.println("How many seeds you wanna buy? ");
            seed = input.nextInt();
            
            totalPrice = seed * price;
        }
        else
        {
            System.out.println("You enter a wrong plants!");
        }
    }
    
    public void guidelines(String plantType)
    {
       this.plantType = plantType;
        
        if (plantType.equalsIgnoreCase("Mango"))
        {
            System.out.println("Requirements: Soil should be deep to accommodate the extensive root system and have a pH between 5.5 and 7.5.");
            System.out.println("Climate: Mango trees need a frost-free climate.");
        }
        else if (plantType.equalsIgnoreCase("Rambutan"))
        {
            System.out.println("Requirments: Soil should be organic and Rambutan tree thrives in 71 - 86 degrees F.");
            System.out.println("Climate: Rambutan trees need a tropical climate.");
        }
        else
        {
            System.out.println("You enter a wrong plants!");
        } 
    }
    
    public String getPrice()
    {
        return "Total Price: RM" + totalPrice;
    }
    
    public String getPlantType()
    {
        return plantType;
    }
    
    public String getUser()
    {
        return user;
    }
    
    
    public String toString()
    {
        return user + " choose the " + plantType + " with the price of " + price;
    }
}
