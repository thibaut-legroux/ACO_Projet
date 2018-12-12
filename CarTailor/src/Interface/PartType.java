package CarTailor.src.Interface;

import CarTailor.src.CarTailor.CategoryImpl;


/**
 * L'interface PartType.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface PartType {

  String getName();

  CategoryImpl getCategory();
  
  String getDescription();

}