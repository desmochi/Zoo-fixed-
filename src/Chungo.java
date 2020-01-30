
public class Chungo extends Animal implements Flyable, Swimmable
{
	public Chungo(String name)
	{
		super(name);
	}
	
	public String eat()
	{
		return "I LOVE EATING TOO";
	}
	
	public String fly()
	{
		return "i believe i can fly";
	}
	
	public String swim()
	{
		return "tsunami incoming";
	}
}
