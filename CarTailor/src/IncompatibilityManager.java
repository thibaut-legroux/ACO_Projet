package carTailor;

import java.util.HashSet;
import java.util.Set;

public  interface IncompatibilityManager 
{
    public Set<Incomptatibility> incompatibilities = new HashSet<Incomptatibility>();

	public  addIncompatibility(Incomptatibility incompat, Collection<Part,Type> incompatibilityType, Part part) ;
	
	public  addRequierement() ;

	public Collection<Part,Type> getIncompatibility() ;
	
	public  removeIncompatibility() ;
	
	public  removeRequirement() ;
}

