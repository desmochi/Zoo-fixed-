
public class Eagle extends Animal implements Flyable, Runnable
{
	public Eagle(String name)
	{
		super(name);
	}
	
	public String eat()
	{
		return "Nom nom I am apex predator";
	}
	
	public String fly()
	{
		return "Caw caw mofo";
	}
	
	public String run() 
	{
		return "Galloping with my talons";
	}
}
