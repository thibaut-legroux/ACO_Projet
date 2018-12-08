package CarTailor.src.CarTailorConfiguration;

public  interface Configurator 
{

    public CarTailor.src.CarTailorConfiguration.Requierement requierement = null;

	public void addIncompatibility(Incomptatibility inc) ;
	
	public void addRequirement(CarTailor.src.CarTailorConfiguration.Requierement req) ;

	public void removeIncompatibility(Incomptatibility inc) ;

}

