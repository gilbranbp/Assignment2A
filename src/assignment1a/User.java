package assignment1a;


public class User                                                               
{
    private String firstName, lastName, username;
    
    public User()
    {
        this.firstName = "Muhammad Sri Gilbran";
        this.lastName = "Billahputra";
    }
    
    public User(String username)
    {
        this.username = username;
    }
    
    public void printUsername()                                                 //Polymorphism declared by setting up methods in parent class
    {
        System.out.println(username);
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
}
