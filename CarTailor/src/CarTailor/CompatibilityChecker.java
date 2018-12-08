package CarTailor.src.CarTailor;

import CarTailor.PartType;

import java.util.Iterator;

public interface CompatibilityChecker {
	  public Iterator<PartType> getIncompPart(PartType refPar) throws Exception;

	  public Iterator<PartType>  getRequirements(PartType refPar);
}