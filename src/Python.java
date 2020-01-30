public class Python extends Animal implements Runnable, Swimmable 
{
	public Python(String name)
	{
		super(name);
	}
	
	public String eat()
	{
		return "The python eats a rat.";
	}

	public String swim() {
		return "Slitherin on the water.";
	}

	public String run() {
		return "Pythons do not run, they slither.";
	}
}
