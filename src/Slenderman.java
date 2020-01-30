
public class Slenderman extends Animal implements Cloneable, Trainable
{
	public Slenderman(String name)
	{
		super(name);
	}
	
	public String eat()
	{
		return "he eats children";
	}
	
	public String clone()
	{
		return "how do you think i teleport bro";
	}
	
	public String train()
	{
		return "i can be trained to kill children";
	}
}
