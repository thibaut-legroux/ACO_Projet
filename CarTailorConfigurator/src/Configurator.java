package carTailorConfigurator;

import invalid;
import carTailor.Incomptatibility;

public  interface Configurator 
{

    public Requierement requierement = null;

	public  addIncompatibility(Incomptatibility inc) ;
	
	public  addRequirement(Requierement req) ;

	public  removeIncompatibility(Incomptatibility inc) ;

}

