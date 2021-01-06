package assignment1a;
import java.util.Scanner;
         
public class Assignment1A 
{

   public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Plants b = new Plants();
        String username, firstName, lastName, plantType;
        b.welcome();
        
        System.out.println("Please Enter your username: ");
        username = input.nextLine();
        
        User a = new User(username);
        
        System.out.println("Please enter your first name: ");
        firstName = input.nextLine();
        a.setFirstName(firstName);
        
        System.out.println("Please enter your last name: ");
        lastName = input.nextLine();
        a.setLastName(lastName);
        
        a.getFirstName();
        a.getLastName();
        
        System.out.println("Please choose your type of plants: (Mango or Rambutan)");
        plantType = input.nextLine();
        
        b.setPrice(plantType);
        
        System.out.println("========== RECIPT ==========");
        System.out.println("Full Name: " + a.toString());
        b.setPlantType(plantType);
        System.out.println("Plant Type: " + b.getPlantType());
        System.out.println(b.getPrice()); 
        System.out.println("");
        System.out.println("********** GUIDELINES **********");
        b.guidelines(plantType);        
    }
    
}
