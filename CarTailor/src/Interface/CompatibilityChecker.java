package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;

import java.util.ArrayList;
import java.util.Collection;

/**
 * L'interface CompatibilityChecker.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface CompatibilityChecker {
	ArrayList<PartTypeImpl> getIncompPart(PartTypeImpl refPar);

	ArrayList<PartTypeImpl> getRequirements(PartTypeImpl refPar);
}