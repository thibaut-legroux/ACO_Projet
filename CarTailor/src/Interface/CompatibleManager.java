package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;
import CarTailor.src.Interface.PartType;

import java.util.Collection;
import java.util.Iterator;

public interface CompatibleManager extends CompatibilityChecker {

  public boolean removeInCompPartType(PartTypeImpl refPart, Collection<PartTypeImpl> collectPart);

  public boolean addInCompPartType(PartTypeImpl refPart,Iterator<PartTypeImpl> collectPartType);

  public boolean addRequirementPart(PartTypeImpl refPart, Iterator<PartTypeImpl> collectPartType);

  public boolean removeRequirementPart(PartTypeImpl refPart, Iterator<PartTypeImpl> collectPartType);

  boolean isComplete();

  boolean isValid();
}