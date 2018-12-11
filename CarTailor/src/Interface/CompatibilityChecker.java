package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;

import java.util.ArrayList;
import java.util.Collection;

/**
 * L'interface CompatibilityChecker.
 */
public interface CompatibilityChecker {
	public Collection<ArrayList<PartTypeImpl>> getIncompPart(PartTypeImpl refPar) throws Exception;

	public Collection<ArrayList<PartTypeImpl>> getRequirements(PartTypeImpl refPar);
}