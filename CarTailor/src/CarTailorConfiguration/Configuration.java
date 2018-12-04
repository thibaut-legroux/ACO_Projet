package carTailorConfigurator;

import carTailor.Part;



public  interface Configuration 
{
	public Part Deselectionner() ;
	
	public Part GetPartFromCategory() ;
	
	public Part RemovePart() ;

	public boolean isComplete() ;

	public boolean isValide() ;

}

