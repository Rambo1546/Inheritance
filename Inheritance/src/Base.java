
public class Base extends Racing {
	public static void main(String[] args)
	{
		//Creating objects
	Racing Race = new Racing();
	Dice Dices = new Dice();
	Automobile Automobiles = new Automobile(0, null, null, null, null, 0, 0);
	//Using inheritance to call a method that is connected to multiple classes.
	Race.main();
	
}
}