public abstract class Animal
{
    private String name;
    /**
     * Constructor for objects of class Animal
     */
    public Animal(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    // **** TASK 1
    // ** Write abstract method eat.  It returns String
    public abstract String eat();
}