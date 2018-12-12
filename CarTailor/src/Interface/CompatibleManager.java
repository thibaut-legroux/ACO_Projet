package CarTailor.src.Interface;

import CarTailor.src.CarTailor.PartTypeImpl;

/**
 * L'interface Category.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface CompatibleManager extends CompatibilityChecker {

  boolean removeInCompPartType(PartTypeImpl partType, PartTypeImpl partRequire);

  boolean addInCompPartType(PartTypeImpl partType, PartTypeImpl partIncomp);

  boolean addRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire);

  boolean removeRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire);

  boolean isComplete();

  boolean isValid();
}