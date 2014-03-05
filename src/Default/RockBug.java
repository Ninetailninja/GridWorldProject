package Default;

import Default.actor.Actor;
import Default.actor.Bug;
import Default.actor.Flower;
import Default.actor.Rock;
import Default.grid.Grid;
import Default.grid.Location;

public class RockBug extends Bug 
{
	
	public void move()
	{
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        
        Rock currentRock = new Rock(getColor());
        currentRock.putSelfInGrid(gr, loc);
        //Flower flower = new Flower(getColor());
        //flower.putSelfInGrid(gr, loc);
	}
	
}
