package CarTailor.src.CarTailor;

import CarTailor.src.CarTailor.PartType;

import java.util.Iterator;

public class CompatibilityCheckerImpl implements CarTailor.src.CarTailor.CompatibilityChecker {

	public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return refPar.getIncompPartType();
	}

	public Iterator<PartType> getRequirements(PartType refPar) {
		return refPar.getRequirement();
	}

}