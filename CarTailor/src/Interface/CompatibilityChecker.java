package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;

import java.util.Iterator;

public interface CompatibilityChecker {
	  public Iterator<PartTypeImpl> getIncompPart(PartTypeImpl refPar) throws Exception;

	  public Iterator<PartTypeImpl>  getRequirements(PartTypeImpl refPar);
}