package CarTailor.src.CarTailor;

import CarTailor.src.Interface.CompatibilityChecker;
import CarTailor.src.Interface.PartType;

import java.util.Iterator;

public class CompatibilityCheckerImpl implements CompatibilityChecker {

	public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return refPar.getIncompPartType();
	}

	public Iterator<PartType> getRequirements(PartType refPar) {
		return refPar.getRequirement();
	}

}