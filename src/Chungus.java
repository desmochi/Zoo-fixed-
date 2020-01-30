
public class Chungus extends Animal implements Flyable, Runnable
{
	public Chungus(String name)
	{
		super(name);
	}
	
	public String eat()
	{
		return "I love eating";
	}
	
	public String fly()
	{
		return "Funny that you think i can fly";
	}
	
	public String run()
	{
		return "i only sit";
	}
}
