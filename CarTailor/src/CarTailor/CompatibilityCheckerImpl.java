import java.util.Iterator;

public class CompatibilityCheckerImpl implements CompatibilityChecker {

	@Override
	public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return refPar.getIncompPartType();
	}

	@Override
	public Iterator<PartType> getRequirements(PartType refPar) {
				return refPar.getRequirement();
	}