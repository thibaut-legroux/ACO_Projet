package CarTailor.src.Interface;

import CarTailor.src.CarTailor.*;

public  interface Configurator 
{

    public Requirement requierement = null;

	public void addIncompatibility(Incomptatibility inc) ;
	
	public void addRequirement(Requirement req) ;

	public void removeIncompatibility(Incomptatibility inc) ;

}

