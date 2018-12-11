package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;
import CarTailor.src.Interface.PartType;

import java.util.Collection;
import java.util.Iterator;

/**
 * L'interface Category.
 */
public interface CompatibleManager extends CompatibilityChecker {

  boolean removeInCompPartType(PartTypeImpl partType, PartTypeImpl partRequire);

  boolean addInCompPartType(PartTypeImpl partType, PartTypeImpl partIncomp);

  boolean addRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire);

  boolean removeRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire);

  boolean isComplete();

  boolean isValid();
}