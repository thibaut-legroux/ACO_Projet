package CarTailor.src.CarTailorConfiguration;

public  interface Configurator 
{

    public Requirement requierement = null;

	public void addIncompatibility(Incomptatibility inc) ;
	
	public void addRequirement(Requirement req) ;

	public void removeIncompatibility(Incomptatibility inc) ;

}

