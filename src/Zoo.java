import java.util.*;

public class Zoo
{
    public static void main(String[] args)
    {
        System.out.println("*** Let's visit the Zoo");
        List<Animal> animals = new ArrayList<Animal>();
        
        // Populate our zoo
        animals.add(new FlyingHippo("Flying Hippo"));
        animals.add(new FlyingHippo("Yo Mama"));
        
        for (Animal a : animals)
        {
            System.out.println(" *** Let's visit the "+a.getName());
            System.out.println("     *** Let us watch the "+a.getName()+" eat : "+a.eat());
           
            
            // Task 2.  Create the Swimmable Interface
            // Task 3. Complete the following lines with Swimmable and Flyable
            // Task 4. In groups of two, create four more animals of your choice.
            if (a instanceof Runnable) 
            {
                System.out.println("    This animal can run: "+((Runnable) a).run());
            }
            
            if(a instanceof Flyable)
            {
            	System.out.println("    This animal can fly: "+((Flyable) a).fly());
            }
            
            if(a instanceof Swimmable)
            {
            	System.out.println("    This animal can swim: "+((Swimmable) a).swim());
            }
        }
        
    }
}
