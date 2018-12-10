package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

import java.util.Collection;

public  interface Configurator 
{

    public Requirement requierement = null;

	public void addIncompatibility(Incomptatibility inc) ;
	
	public void addRequirement(Requirement req) ;

	public void removeIncompatibility(Incomptatibility inc) ;

	public void removeRequirement(Requirement req);

	public Requirement getrequirements();

	public Incomptatibility getincompatibilities();

}

