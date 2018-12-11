package CarTailor.src.CarTailor;

import CarTailor.src.Interface.CompatibilityChecker;

import java.util.Iterator;

public class CompatibilityCheckerImpl implements CompatibilityChecker {

	public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return null;
	}

	public Iterator<PartType> getRequirements(PartType refPar) {
		return null;
	}

	/*public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return refPar.getIncompPartType();
	}


}