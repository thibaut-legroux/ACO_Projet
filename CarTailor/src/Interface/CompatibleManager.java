package CarTailor.src.Interface;

import java.util.Collection;
import java.util.Iterator;

public interface CompatibleManager extends CompatibilityChecker {
	
  public void removeInCompPartType(PartType refPart, Collection<PartType> collectPart);
  
  public void addInCompPartType(PartType refPart,Iterator<PartType> collectPartType);

  public void addRequirementPart(PartType refPart, Iterator<PartType> collectPartType);

  public void removeRequirementPart(PartType refPart, Iterator<PartType> collectPartType);
  
}