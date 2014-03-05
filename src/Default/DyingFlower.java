package Default;

import java.awt.Color;

import Default.actor.Flower;

public class DyingFlower extends Flower 
{
	private int turns;
	
	public DyingFlower()
	{
		turns = 0;
	}
	
	public DyingFlower(Color color)
	{
		super(color);
		turns = 0;
	}
	
	public void act()
	{
		super.act();
		turns++;
		if(turns == 5)
		{
			removeSelfFromGrid();
		}
	}
}
